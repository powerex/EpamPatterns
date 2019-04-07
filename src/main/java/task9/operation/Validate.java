package task9.operation;

import task9.payment.CommonPayment;
import task9.payment.GovernmentalPayment;
import task9.payment.InnerPayment;
import task9.payment.PreferentialPyment;

public class Validate extends Operation {
    @Override
    public void execute(CommonPayment payment) {
        System.out.println("\nSimple validate");
        super.execute(payment);
    }

    @Override
    public void execute(GovernmentalPayment payment) {
        System.out.println("\nSimplify validate");
        super.execute(payment);
    }

    @Override
    public void execute(PreferentialPyment payment) {
        System.out.println("\nDouble checked");
        super.execute(payment);
    }

    @Override
    public void execute(InnerPayment payment) {
        System.out.println("\nInner operations non-checked");
        super.execute(payment);
    }
}
