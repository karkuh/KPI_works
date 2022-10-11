using System;


namespace Lab1
{
    internal class Program
    {
        public static void Main(string[] args)


        {

            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("\t\t\t\t        _______         ___         .___  ___.     _______ \n"+
                              "\t\t\t\t       /  _____|       /   \\        |   \\/   |    |   ____|\n"+
                              "\t\t\t\t      |  |  __        /  ^  \\       |  \\  /  |    |  |__   \n"+
                              "\t\t\t\t      |  | |_ |      /  /_\\  \\      |  |\\/|  |    |   __|  \n"+
                              "\t\t\t\t      |  |__| |     /  _____  \\     |  |  |  |    |  |____ \n"+
                              "\t\t\t\t       \\______|    /__/     \\__\\    |__|  |__|    |_______|\n");


            Console.ResetColor();
            Random rnd = new Random();
            GameAccount player1 = new GameAccount("Vlad");
            GameAccount player2 = new GameAccount("Denys");
            GameAccount player3 = new GameAccount("Roma");
            GameAccount player4 = new GameAccount("Maks");
            Game game1 = new Game("Game 1");
           


            for (int i = 0; i < 3; i++)
            {
                game1.PlayingGame(player1, player2, rnd.Next(2, 6));
                game1.PlayingGame(player3, player4, rnd.Next(2, 6));
            }


            for (int i = 0; i < 3; i++)
            {
                game1.PlayingGame(player1, player3, rnd.Next(2, 6));
                game1.PlayingGame(player2, player4, rnd.Next(2, 6));
            }

            for (int i = 0; i < 3; i++)
            {
                game1.PlayingGame(player4, player1, rnd.Next(2, 6));
                game1.PlayingGame(player3, player2, rnd.Next(2, 6));
            }


            player1.InformationForPlayer();
            player1.GetStats();

            player2.InformationForPlayer();
            player2.GetStats();

            player3.InformationForPlayer();
            player3.GetStats();

            player4.InformationForPlayer();
            player4.GetStats();

            game1.Information();
            game1.Top3();
           
        }
    }
}