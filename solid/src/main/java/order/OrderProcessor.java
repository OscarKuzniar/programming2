package order;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService,
                          OrderService orderService,
                          OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(Address address, Product product, User user) {
        boolean isOrdered = orderService.order(address, product, user);
        if(isOrdered) {
            informationService.inform(user);
            orderRepository.createOrder(address, product, user);
            return new OrderDto();
        } else {
            throw new OrderNotProcessedException();
        }

    }
}
