package order;

public class PizzaOrderRepository implements OrderRepository {

    @Override
    public void createOrder(Address address, Product product, User user) {
        System.out.println("Order has been saved");
    }
}
