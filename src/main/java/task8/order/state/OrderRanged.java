package task8;

public class OrderRanged implements OrderState {

    private Order order;

    public OrderRanged(Order order) {
        this.order = order;
    }

    public String getCurrentState() {
        return "task8.Order is on ranged";
    }

    public void use() {
        System.out.println("You can't use this order, it will be must approved first ");
    }

    public void sendToReview() {
        System.out.println("The order already in review");
    }
}
