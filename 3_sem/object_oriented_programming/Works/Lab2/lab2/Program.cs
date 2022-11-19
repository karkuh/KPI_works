using System;
using System.Collections.Generic;
using lab2.MyAccounts;
using lab2.MyGames;

namespace lab2
{
    internal static class Program
    {
        public static void Main(string[] args)
        {

            var rnd = new Random();
            var a = new PremiumAccount("Vlad");
            var b = new PremiumMiddleAccount("Roma");
            var c = new Account("Maks");
            
            var fabric = new FabricGame();
            var listGames = new List<Game>{fabric.GetClassic(),fabric.GetTraining(),fabric.GetGameForOne()};
            
            
            for (var i = 0; i < 5; i++)
            {
                listGames[0].PlayingGame(a,b,rnd.Next(2,8));
                listGames[0].PlayingGame(c,b,rnd.Next(2,8));
            }
            
            listGames[0].Information();
            
            for (var i = 0; i < 5; i++)
            {
                listGames[1].PlayingGame(c,a,0);
                listGames[1].PlayingGame(b,a,0);
            }
            
            listGames[1].Information();
            
            for (var i = 0; i < 5; i++)
            {
                listGames[2].PlayingGame(a,c,rnd.Next(2,8));
                listGames[2].PlayingGame(b,c,rnd.Next(2,8));
            }
            listGames[2].Information();
            
            a.InformationForPlayer();
            a.GetStats();
            b.InformationForPlayer();
            b.GetStats();
            c.InformationForPlayer();
            c.GetStats();

            
        }
        

    }
}