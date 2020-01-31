import order.Address;
import order.PizzaOrderService;
import order.Product;
import order.User;

public class OrderApplication {

    public static void main(String[] args) {
        User user = new User("example@email.com");
        Product product = new Product("Pollo");
        Address address = new Address("Słowackiego", "24", "35-001");

        PizzaOrderService pizzaOrderService = new PizzaOrderService();

        boolean isOrderProcessed = pizzaOrderService.order(address, product, user);

        if (isOrderProcessed) {
            //logic
        }
    }
}
