package isp;

public class Book implements Entity {

    private Long id;

    private String name;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
