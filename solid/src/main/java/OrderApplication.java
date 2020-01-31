import order.*;

public class OrderApplication {

    public static void main(String[] args) {
        User user = new User("example@email.com");
        Product product = new Product("Pollo");
        Address address = new Address("Słowackiego", "24", "35-001");

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(),
                new PizzaOrderService(),
                new PizzaOrderRepository()
        );

        orderProcessor.process(address, product, user);
    }
}
