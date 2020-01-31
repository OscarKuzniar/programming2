package order;

public interface OrderService {

    boolean order(Address address, Product product, User user);
}
