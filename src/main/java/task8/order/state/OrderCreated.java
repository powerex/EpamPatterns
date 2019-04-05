package task8.order.state;

import task8.order.Order;

public class OrderCreated implements OrderState {

    private Order order;

    public OrderCreated(Order order) {
        this.order = order;
    }

    public String getCurrentState() {
        return "task8.order.Order just created";
    }

    public void use() {
        System.out.println("You can't use just-created order, it will be must reviewed and approved first ");
    }

    public void sendToReview() {
        System.out.println("task8.order.Order was send to review");
        order.setCurrentState(new OrderRanged(order));
    }
}
