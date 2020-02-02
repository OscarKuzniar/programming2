package dip;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        List<Musician> musicians = List.of(
                new Guitarist(),
                new Drummer(),
                new Trumpeter(),
                new Bassist()
        );
        Band band = new Band(musicians);
        band.perform();
    }
}
