package task8.order.state;

public interface OrderState {

    String getCurrentState();
    void use();
    void sendToReview();

}
