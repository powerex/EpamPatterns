package task8;

public class OrderApproved implements OrderState {

    private Order order;

    public OrderApproved(Order order) {
        this.order = order;
    }

    public String getCurrentState() {
        return "task8.Order is Approved";
    }

    public void use() {
        System.out.println("Go to gnaw granite of science");
    }

    public void sendToReview() {
        System.out.println("For what?");
    }
}