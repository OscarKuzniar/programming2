package order;

public interface OrderRepository {

    void createOrder(Address address, Product product, User user);
}
