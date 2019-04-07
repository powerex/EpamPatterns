package task9.operation;

import task9.payment.*;

public class Operation {

    protected Operation nextOperation = null;

    public void execute(Payment payment) {
        if (payment instanceof CommonPayment)
            execute((CommonPayment) payment);
        else if (payment instanceof GovernmentalPayment)
            execute((GovernmentalPayment) payment);
        else if (payment instanceof InnerPayment)
            execute((InnerPayment)payment);
        else
            execute((PreferentialPyment) payment);
    }

    public void execute(CommonPayment payment) {
        if (nextOperation != null)
            nextOperation.execute(payment);
    }

    public void execute(GovernmentalPayment payment) {
        if (nextOperation != null)
            nextOperation.execute(payment);
    }

    public void execute(PreferentialPyment payment) {
        if (nextOperation != null)
            nextOperation.execute(payment);
    }

    public void execute(InnerPayment payment) {
        if (nextOperation != null)
            nextOperation.execute(payment);
    }

    public void setNextOperation(Operation nextOperation) {
        if (this.nextOperation == null)
            this.nextOperation = nextOperation;
        else
            this.nextOperation.setNextOperation(nextOperation);
    }
}
