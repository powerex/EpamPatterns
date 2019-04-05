package task8.order.state;

import task8.order.Order;

public class OrderRejected implements OrderState {

    private Order order;

    public OrderRejected(Order order) {
        this.order = order;
    }

    public String getCurrentState() {
        return "task8.order.Order is rejected";
    }

    public void use() {
        System.out.println("You can't use rejected order, create new for this");
    }

    public void sendToReview() {
        System.out.println("You can't send to review rejected order");
    }
}
