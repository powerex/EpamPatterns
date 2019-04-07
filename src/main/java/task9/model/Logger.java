package task9.model;

import task9.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private List<String> operations;

    public Logger() {
        operations = new ArrayList<String>();
    }

    public void add(String type, Payment payment) {
        StringBuilder sb = new StringBuilder(type + " payment: ");
        sb.append("from " + payment.getSenderAcountNumber())
          .append(" to " + payment.getReceiverAcountNumber())
          .append(" amount " + payment.getAmount() );
        operations.add(sb.toString());
    }

    public void viewLog() {
        System.out.println("\n\n==========================================================");
        for (String s: operations) {
            System.out.println(s);
        }
    }
}
