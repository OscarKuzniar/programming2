public class RockPaperScissorsService {
    private Game gam;
    public RockPaperScissorsService(Game game){
    this.gam = game;}

            //setups game
    public Object setupGame()
    {       /**
            * checks game difficulty level;
            */
        if(gam.gameType == "hard") return new HardGame();


        else if
            (gam.getType() == "EASY")
            {
                return new EasyGame();
            }



        return null; }

    class Game{

        String gameType;

        public  Game (String type) {
            gameType = type;
        }

        public String getType(){
            return gameType;
        }
    }
}
