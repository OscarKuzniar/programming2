package order;

public class PizzaOrderRepository implements OrderRepository {

    public void createOrder(Address address, Product product, User user) {
        //Here should be logic for saving an order
        System.out.println("Order has been saved!");
    }
}
