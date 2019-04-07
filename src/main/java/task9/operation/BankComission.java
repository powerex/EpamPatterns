package task9.operation;

import task9.payment.CommonPayment;
import task9.payment.GovernmentalPayment;
import task9.payment.InnerPayment;
import task9.payment.PreferentialPyment;

public class BankComission extends Operation {

    @Override
    public void execute(CommonPayment payment) {
        if (payment.getSender().equals(payment.getReceiver()) &&
            payment.getSenderAcountNumber() != payment.getReceiverAcountNumber())
            System.out.println("No commission between own accounts");
        else
            System.out.println("Commission of the bank is " + payment.getAmount() * 0.02);
        super.execute(payment);
    }

    @Override
    public void execute(GovernmentalPayment payment) {
        System.out.println("Commission of the bank is " + payment.getAmount() * 0.01);
        payment.setCommision(payment.getAmount() * 0.01);
        super.execute(payment);
    }

    @Override
    public void execute(PreferentialPyment payment) {
        System.out.println("Commission of the bank is " + payment.getAmount() * 0.005);
        payment.setCommision(payment.getAmount() * 0.005);
        super.execute(payment);
    }

    @Override
    public void execute(InnerPayment payment) {
        System.out.println("No commission of the bank");
        super.execute(payment);
    }
}
