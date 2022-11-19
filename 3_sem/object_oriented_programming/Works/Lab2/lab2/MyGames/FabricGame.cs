namespace lab2.MyGames
{
    public class FabricGame
    {
        public Game GetClassic()
        {
            return new ClassicGame();
        }
        public Game GetTraining()
        {
            return new TrainingGame();
        }
        
        public Game GetGameForOne()
        {
            return new GameForOne();
        }
    }
}