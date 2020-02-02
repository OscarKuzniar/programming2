package order;

public class OrderDTO {

    private final Address address;

    private final Product product;

    private final User user;


    public OrderDTO(Address address, Product product, User user) {
        this.address = address;
        this.product = product;
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }
}
