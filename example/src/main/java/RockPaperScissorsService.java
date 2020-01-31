public class RockPaperScissorsService {

    private Game game;

    public RockPaperScissorsService(Game game) {
        this.game = game;
    }

    public Object setupGame() {
        if (game.gameType.equals("hard")) {
            return new HardGame();
        } else if (game.getGameType().equals("EASY")) {
            return new EasyGame();
        }
        return null;
    }

    class Game {

        String gameType;

        public Game(String gameType) {
            this.gameType = gameType;
        }

        public String getGameType() {
            return this.gameType;
        }
    }
}
