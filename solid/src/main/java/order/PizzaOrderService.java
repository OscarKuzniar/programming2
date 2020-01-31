package order;

public class PizzaOrderService {

    public boolean order(Address address, Product product, User user) {
        System.out.println("Request sent from: " + user.getEmail());
        System.out.println("by " + user.getName());
        System.out.println("Ordering pizza " + product.getName() + " on address " +
                address.getStreet() + " " + address.getStreetNumber()
                + ((address.getLocalNumber() != null) ? ("/" + address.getLocalNumber() + " ") : " "));
        return true;
    }
}
