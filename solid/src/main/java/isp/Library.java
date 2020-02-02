package isp;

public class Library implements Entity {

    private Long id;

    private String branch;

    @Override
    public Long getId() {
        return this.id;
    }
}
