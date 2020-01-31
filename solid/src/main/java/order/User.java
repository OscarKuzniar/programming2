package order;

public class User {

    private String email;

    private String name;

    public User(String email) {
        this.email = email;
    }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
