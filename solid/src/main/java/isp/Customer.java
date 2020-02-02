package isp;

public class Customer implements Entity, Person {
    private Long id;

    private String name;

    private String lastName;

    private int bookRentCounter;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
