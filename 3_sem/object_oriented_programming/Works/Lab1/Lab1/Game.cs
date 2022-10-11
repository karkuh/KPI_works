using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace Lab1
{
    public class Game
    {
        Random rnd = new Random();

        private int GamesCount;
        private StringBuilder InfoGames;
        private string NameGame;
        private Dictionary<GameAccount, int> Players;


        public Game(string nameGame)
        {
            NameGame = nameGame;
            InfoGames = new StringBuilder();
            Players = new Dictionary<GameAccount, int>();

            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine(
                "\t\t\t\t\t\t-----------------------------\n\t\t\t\t\t\t\\/\\/ Створену гру " + nameGame + " \\/\\/");
            Console.ResetColor();
        }

        public void Information()
        {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("\t\t\t\t\t\t      Stats about " + NameGame);
            Console.WriteLine("\t\t\t\t\t\t      Games count: " + GamesCount);
            Console.ForegroundColor = ConsoleColor.Cyan;
            Console.WriteLine("\t\t\t____________________________________________________________________________\n" +
                              "\t\t\t|  ID  |       |    PLAYERS   |       |RATING GAME|       |     RESULT     |\n" +
                              "\t\t\t----------------------------------------------------------------------------");
            Console.Write(InfoGames);
            Console.WriteLine("\t\t\t----------------------------------------------------------------------------");
            Console.ResetColor();
        }

        public void Top3()
        {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine($"\t\t\t\t\t\t      ___________________\n\t\t\t\t\t\t      Top 3 for \"{NameGame}\"");
            var sortedDict = Players.OrderBy(x => x.Value).ToDictionary(x => x.Key, x => x.Value);
            int top3 = 0;
            for (int i = sortedDict.Count - 1; i >= 0; i--)
            {
                top3++;
                if (top3 == 1)
                {
                    Console.ForegroundColor = ConsoleColor.Yellow;
                }
                else if (top3 == 2)
                {
                    Console.ForegroundColor = ConsoleColor.White;
                }
                else
                {
                    Console.ForegroundColor = ConsoleColor.Gray;
                }
                Console.WriteLine(
                    $"\t\t\t\t\t\t      {top3} place: {sortedDict.ElementAt(i).Key.UserName,5} ({sortedDict.ElementAt(i).Value,2})");
                if (top3 == 3)
                {
                    break;
                }
            }
            Console.ResetColor();
            for (int i = top3; i < 3; i++)
            {
                if (i == 0)
                {
                    Console.WriteLine("\t\t\t\t\t\t      Game clear");
                    break;
                }

                if (i==2)
                {
                    Console.WriteLine("\t\t\t\t\t\t      3 place: --------");
                }
            }
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("\t\t\t\t\t\t      -------------------\n");
            Console.ResetColor();

        }

        public void PlayingGame(GameAccount player1, GameAccount player2, int rating)
        {
            var random = rnd.Next(1, 101);

            Regex shabl = new Regex(@"\D");
            string id = shabl.Replace(Guid.NewGuid().ToString(), "").Substring(0, 6);

            if (random % 10 == 0)
            {
                player1.TieGame(NameGame,id, rating, player2);
                player2.TieGame(NameGame,id, rating, player1);
                InfoGames.Append(
                    $"\t\t\t|{id,6}|  -->  |{player1.UserName,5} VS {player2.UserName,-5}|  -->  |     {rating}     |  -->  |{player1.UserName,5} {GameResult.TIE}  {player2.UserName,-5}|\n");
            }
            else if (random % 2 != 0)
            {
                player1.WinGame(NameGame,id, rating, player2);
                player2.LoseGame(NameGame,id, rating, player1);
                InfoGames.Append(
                    $"\t\t\t|{id,6}|  -->  |{player1.UserName,5} VS {player2.UserName,-5}|  -->  |     {rating}     |  -->  |{player1.UserName,5} {GameResult.WIN}  {player2.UserName,-5}|\n");
            }
            else
            {
                player1.LoseGame(NameGame,id, rating, player2);
                player2.WinGame(NameGame,id, rating, player1);
                InfoGames.Append(
                    $"\t\t\t|{id,6}|  -->  |{player1.UserName,5} VS {player2.UserName,-5}|  -->  |     {rating}     |  -->  |{player1.UserName,5} {GameResult.LOSE} {player2.UserName,-5}|\n");
            }


            GamesCount++;

            AddPlayersToTop(player1);
            AddPlayersToTop(player2);
        }

        private void AddPlayersToTop(GameAccount player)
        {
            if (Players.Keys.ToList().IndexOf(player) == -1)
            {
                Players.Add(player, player.CurrentRating);
            }
            else
            {
                Players[player] = player.CurrentRating;
            }
        }



    }
}