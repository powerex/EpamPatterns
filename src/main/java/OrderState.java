public interface OrderState {

    String getCurrentState();
    void use();
    void sendToReview();

}
