package dip;

import java.util.ArrayList;
import java.util.List;

public class Band {

    private List<Musician> musicians = new ArrayList<>();

    public Band(List<Musician> musicians) {
        this.musicians = musicians;
    }

    public void perform() {
        this.musicians.forEach(Musician::play);
    }
}
