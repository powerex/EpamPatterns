public class OrderRejected implements OrderState {

    private Order order;

    public OrderRejected(Order order) {
        this.order = order;
    }

    public String getCurrentState() {
        return "Order is rejected";
    }

    public void use() {
        System.out.println("You can't use rejected order, create new for this");
    }

    public void sendToReview() {
        System.out.println("You can't send to review rejected order");
    }
}
