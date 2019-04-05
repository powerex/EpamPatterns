package task8.model;

import task8.order.Order;
import task8.order.state.OrderApproved;
import task8.order.state.OrderRejected;

public class Commision {

    public static void ApproveOrder(Order order) {
        double mystery = Math.random();
        if (mystery < .2) {
            order.setCurrentState(new OrderApproved(order));
        }
        else {
            order.setCurrentState(new OrderRejected(order));
        }
    }

}
