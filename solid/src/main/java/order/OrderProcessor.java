package order;

public class OrderProcessor {

    private OrderService orderService;
    private OrderRepository orderRepository;
    private InformationService informationService;

    public OrderProcessor(OrderService orderService,
                          OrderRepository orderRepository,
                          InformationService informationService) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }

    public void process(OrderDTO orderDTO) {
        boolean isOrderProcessed = this.orderService.order(
                orderDTO
        );
        if (isOrderProcessed) {
            this.orderRepository.createOrder(
                    orderDTO.getAddress(), orderDTO.getProduct(), orderDTO.getUser()
            );
            this.informationService.inform(orderDTO.getUser());
        } else {
            throw new OrderNotProcessedException();
        }
    }
}
