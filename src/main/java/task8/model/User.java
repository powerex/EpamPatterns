package task8.model;

import task8.order.GrantOrder;
import task8.order.Order;

public class User {

    private String name;
    private GrantOrder order;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Order getOrder() {
        return order;
    }

    public void createOrder() {
        order = new GrantOrder();
    }

    public void useOrder() {
        order.use();
    }

    public void sendToReview() {
        order.sendToReview();
    }
}
