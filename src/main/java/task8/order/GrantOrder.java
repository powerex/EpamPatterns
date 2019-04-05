package task8;

public class GrantOrder extends Order implements OrderState {

    public GrantOrder() {
        currentState = new OrderCreated(this);
    }

    public String getCurrentState() {
        return currentState.getCurrentState();
    }

    public void use() {
        currentState.use();
    }

    public void sendToReview() {
        currentState.sendToReview();
    }
}
