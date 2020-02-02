import order.*;

public class OrderApplication {

    public static void main(String[] args) {
        User user = new User("example@email.com");
        Product product = new Product("Pollo");
        Address address = new Address("Słowackiego", "24", "35-001");

        OrderDTO orderDTO = new OrderDTO(address, product, user);

        OrderProcessor orderProcessor = new OrderProcessor(
                new PizzaOrderService(),
                new PizzaOrderRepository(),
                new MailService()
        );

        orderProcessor.process(orderDTO);
    }
}
