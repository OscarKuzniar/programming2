import order.*;

public class OrderApplication {

    public static void main(String[] args) {
        User user = new User("example@email.com");
        Product product = new Product("Pollo");
        Address address = new Address("Słowackiego", "24", "35-001");

        PizzaOrderService pizzaOrderService = new PizzaOrderService();

        boolean isOrderProcessed = pizzaOrderService.order(address, product, user);

        MailService mailService = new MailService();
        PizzaOrderRepository pizzaOrderRepository = new PizzaOrderRepository();

        if (isOrderProcessed) {
            mailService.sendEmail(user);
            pizzaOrderRepository.createPizzaOrder(address, product, user);
        } else {
            throw new OrderNotProcessedException();
        }
    }
}
