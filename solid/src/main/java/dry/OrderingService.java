package dry;

import java.time.LocalDate;

public class OrderingService {

    public Order order(String orderingDetails) {
        Order order = generateOrder(orderingDetails);
        if (orderingDetails.equals("SPECIAL")) {
            sendNotificationsToDeliveriesDepartment(order);
        }
        return order;
    }

    private Order generateOrder(String orderingDetails) {
        LocalDate now = LocalDate.now();
        long daysToAdd = orderingDetails.equals("CLASSIC") ? 10 : 5;
        Order order = new Order();
        order.generateOrderNumber();
        order.fetchClientNumber();
        order.setDateOfDelivery(now.plusDays(daysToAdd));
        return order;
    }

    private void sendNotificationsToDeliveriesDepartment(Order order) {
        System.out.println("order " + order + " marked as special");
        order = order("asd");
    }
}
