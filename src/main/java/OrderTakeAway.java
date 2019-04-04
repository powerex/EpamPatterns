public class OrderTakeAway implements OrderState {

    private Order order;

    public OrderTakeAway(Order order) {
        this.order = order;
    }

    public String getCurrentState() {
        return "Order is Take Away";
    }

    public void use() {
        System.out.println("You can't use this order, it will be must reviewed and approved first ");
    }

    public void sendToReview() {
        System.out.println("You can't send to review no active order");
    }
}
