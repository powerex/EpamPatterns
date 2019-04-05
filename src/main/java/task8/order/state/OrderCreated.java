package task8;

public class OrderCreated implements OrderState {

    private Order order;

    public OrderCreated(Order order) {
        this.order = order;
    }

    public String getCurrentState() {
        return "task8.Order just created";
    }

    public void use() {
        System.out.println("You can't use just-created order, it will be must reviewed and approved first ");
    }

    public void sendToReview() {
        System.out.println("task8.Order was send to review");
        order.setCurrentState(new OrderRanged(order));
    }
}
