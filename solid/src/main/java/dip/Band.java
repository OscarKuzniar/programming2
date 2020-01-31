package dip;

public class Band {

    private Guitarist guitarist = new Guitarist();
    private Drummer drummer = new Drummer();
    private Bassist bassist = new Bassist();

    public void perform() {
        drummer.playDrums();
        guitarist.playGuitar();
        bassist.playBase();
    }
}
