package task8.order;

import task8.order.state.OrderState;

public abstract class Order {

    protected OrderState currentState;

    public void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
    }
}
