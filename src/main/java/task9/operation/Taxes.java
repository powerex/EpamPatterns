package task9.operation;

import task9.payment.CommonPayment;
import task9.payment.GovernmentalPayment;
import task9.payment.InnerPayment;
import task9.payment.PreferentialPyment;

public class Taxes extends Operation {

    @Override
    public void execute(CommonPayment payment) {
        System.out.println("Taxes 5% " + payment.getAmount() * 0.05);
        payment.setTaxes(payment.getTaxes() + payment.getAmount() * 0.05);
        super.execute(payment);
    }

    @Override
    public void execute(GovernmentalPayment payment) {
        System.out.println("Taxes 1% " + payment.getAmount() * 0.01);
        payment.setTaxes(payment.getTaxes() + payment.getAmount() * 0.01);
        super.execute(payment);
    }

    @Override
    public void execute(PreferentialPyment payment) {
        System.out.println("Taxes 2% " + payment.getAmount() * 0.02);
        payment.setTaxes(payment.getTaxes() + payment.getAmount() * 0.02);
        super.execute(payment);
    }

    @Override
    public void execute(InnerPayment payment) {
        System.out.println("Taxes 0%");
        super.execute(payment);
    }
}
