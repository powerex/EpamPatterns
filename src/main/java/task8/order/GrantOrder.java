package task8.order;

import task8.order.Order;
import task8.order.state.OrderCreated;
import task8.order.state.OrderState;

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
