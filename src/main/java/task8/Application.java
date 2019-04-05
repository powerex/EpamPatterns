package task8;

import task8.model.Commision;
import task8.model.User;
import task8.order.GrantOrder;

public class Application {

    public static void main(String[] args) {
        GrantOrder grantOrder = new GrantOrder();
        User user = new User("Mark");
        user.createOrder();
        user.useOrder();
        Commision.ApproveOrder(user.getOrder());
        user.useOrder();
    }

}
