package isp;

public class Author implements Entity, Person {

    private Long id;

    private String name;

    private String lastName;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
}
