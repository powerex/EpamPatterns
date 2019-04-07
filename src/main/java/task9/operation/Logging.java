package task9.operation;

import task9.model.Logger;
import task9.payment.CommonPayment;
import task9.payment.GovernmentalPayment;
import task9.payment.InnerPayment;
import task9.payment.PreferentialPyment;

public class Logging extends Operation {

    private Logger logger;

    public Logging(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void execute(CommonPayment payment) {
        logger.add("Common", payment);
        super.execute(payment);
    }

    @Override
    public void execute(GovernmentalPayment payment) {
        logger.add("Governmental", payment);
        super.execute(payment);
    }

    @Override
    public void execute(PreferentialPyment payment) {
        logger.add("Preferential", payment);
        super.execute(payment);
    }

    @Override
    public void execute(InnerPayment payment) {
        logger.add("Inner", payment);
        super.execute(payment);
    }
}

