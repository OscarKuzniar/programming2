package order;

public class PizzaOrderService implements OrderService {

    @Override
    public boolean order(OrderDTO orderDTO) {
        System.out.println("Request sent from: " + orderDTO.getUser().getEmail());
        System.out.println("by " + orderDTO.getUser().getEmail());
        System.out.println("Ordering pizza " + orderDTO.getProduct().getName() + " on address " +
                orderDTO.getAddress().getStreet() + " " + orderDTO.getAddress().getStreetNumber()
                + ((orderDTO.getAddress().getLocalNumber() != null) ? ("/" + orderDTO.getAddress().getLocalNumber() + " ") : " "));
        return true;
    }
}
