package isp;

public class Book implements Entity {

    private Long id;

    private String title;

    @Override
    public Long getId() {
        return this.id;
    }

}
