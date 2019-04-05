package task8.order.state;

import task8.order.Order;

public class OrderRanged implements OrderState {

    private Order order;

    public OrderRanged(Order order) {
        this.order = order;
    }

    public String getCurrentState() {
        return "task8.order.Order is on ranged";
    }

    public void use() {
        System.out.println("You can't use this order, it will be must approved first ");
    }

    public void sendToReview() {
        System.out.println("The order already in review");
    }

    public void takeOff() {
        order.setCurrentState(new OrderTakeAway(order));
    }
}
