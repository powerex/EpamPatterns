public abstract class Order {

    protected OrderState currentState;

    public void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
    }
}
