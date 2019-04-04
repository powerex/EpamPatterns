public class OrderPostponed implements OrderState {

    private Order order;

    public OrderPostponed(Order order) {
        this.order = order;
    }

    public String getCurrentState() {
        return "Order is Postponed";
    }

    public void use() {
        System.out.println("You can't use this order, it will be must reviewed and approved first ");
    }

    public void sendToReview() {
        System.out.println("Order was send to review again");
        order.setCurrentState(new OrderRanged(order));
    }
}
