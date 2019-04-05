public class Application {

    public static void main(String[] args) {
        GrantOrder grantOrder = new GrantOrder();
        User user = new User("Mark");
        user.createOrder();
        user.useOrder();
        user.sendToReview();
        user.useOrder();
    }

}
