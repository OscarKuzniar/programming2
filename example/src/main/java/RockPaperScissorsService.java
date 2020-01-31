public class RockPaperScissorsService {

    private Game game;

    private static final String HARD_GAME_MODE = "HARD";

    public RockPaperScissorsService(Game game) {
        this.game = game;
    }

    public GameMode setupGame() {
        if (game.getGameType().equals(HARD_GAME_MODE)) {
            return new HardGame();
        }
        return new EasyGame();
    }
}
