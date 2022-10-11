using System;
using System.Text;

namespace Lab1
{
    public class GameAccount
    {
        public string UserName { get; }
        public int CurrentRating { get; private set; } = 1;
        public int GamesCount { get; private set; }

        private int WinCount;

        private int LoseCount;

        private int DrawCount;
        private int Number = 1;

        private StringBuilder InfoGames;

        public GameAccount(string userName)
        {
            UserName = userName;
            InfoGames = new StringBuilder();
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("\t\t\t\t\t\t<-- Створено гравця " + userName + " -->");
            Console.ResetColor();
        }

        public void InformationForPlayer()
        {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("\n\t\t\t\t\t\t      Information for " + UserName);
            Console.ForegroundColor = ConsoleColor.Blue;
            Console.WriteLine("\t\t\t\t\t\t      Player: " + UserName);
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.WriteLine("\t\t\t\t\t\t      Rating : " + CurrentRating);
            Console.ForegroundColor = ConsoleColor.Blue;
            Console.WriteLine("\t\t\t\t\t\t      All game : " + GamesCount);
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.WriteLine("\t\t\t\t\t\t      Win game : " + WinCount);
            Console.ForegroundColor = ConsoleColor.Blue;
            Console.WriteLine("\t\t\t\t\t\t      Lose game : " + LoseCount);
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.WriteLine("\t\t\t\t\t\t      Tie game : " + DrawCount + "\n");

            Console.ResetColor();
        }
        public void GetStats()
        {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine($"{"Stats about",65} " + UserName);
            Console.ForegroundColor = ConsoleColor.Cyan;
            Console.WriteLine("_________________________________________________________________________________________________________________\n" +
                              "| № |       |Name game|       |  ID  |       |RATING GAME|       |     RESULT     |       |CHANGE|       |RATING|\n" +
                              "-----------------------------------------------------------------------------------------------------------------");
            Console.Write(InfoGames);
            Console.WriteLine("-----------------------------------------------------------------------------------------------------------------\n");
            Console.ResetColor();
        }

        public void WinGame(string namegame,string id, int rating, GameAccount player)
        {
            if (rating < 0)
            {
                throw new ArgumentException("rating < 0");
            }

            int currentRating = CurrentRating;
            CurrentRating += rating;
            GamesCount++;
            WinCount++;
            InfoGames.Append(
                $"|{Number,2} |  -->  |  {namegame} |  -->  |{id,6}|  -->  |     {rating}     |  -->  |{UserName,5} {GameResult.WIN}  {player.UserName,-5}|  -->  |{currentRating,2} +{rating,2}|  -->  |  {CurrentRating,2}  |\n");
            Number++;
        }

        public void LoseGame(string namegame,string id, int rating, GameAccount player)
        {
            if (rating < 0)
            {
                throw new ArgumentException("rating < 0");
            }

            int currentRating = CurrentRating;


            if (CurrentRating - rating < 1)
            {
                CurrentRating = 1;
            }
            else
            {
                CurrentRating -= rating;
            }

            GamesCount++;
            LoseCount++;
            InfoGames.Append(
                $"|{Number,2} |  -->  |  {namegame} |  -->  |{id,6}|  -->  |     {rating}     |  -->  |{UserName,5} {GameResult.LOSE} {player.UserName,-5}|  -->  |{currentRating,2} -{rating,2}|  -->  |  {CurrentRating,2}  |\n");
            Number++;
        }


        public void TieGame(string namegame,string id, int rating, GameAccount player)
        {
            GamesCount++;
            DrawCount++;
            InfoGames.Append(
                $"|{Number,2} |  -->  |  {namegame} |  -->  |{id,6}|  -->  |     {rating}     |  -->  |{UserName,5} {GameResult.TIE}  {player.UserName,-5}|  -->  |{CurrentRating,2} + 0|  -->  |  {CurrentRating,2}  |\n");
            Number++;
        }


    }
}