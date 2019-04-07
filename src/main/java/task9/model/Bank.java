package task9.model;

import task9.operation.*;
import task9.payment.Payment;

public class Bank {

    private Logger logger;
    private Operation operation = new Operation();
    private double taxes;

    public Bank() {
        taxes = 0;
        logger = new Logger();
        Logging logging = new Logging(logger);
        Validate validate = new Validate();
        BankComission comission = new BankComission();
        Taxes taxes = new Taxes();
        operation.setNextOperation(logging);
        operation.setNextOperation(validate);
        operation.setNextOperation(comission);
        operation.setNextOperation(taxes);
    }

    public void executePayment(Payment payment) {
        operation.execute(payment);
        taxes += payment.getTaxes();
    }

    public void showLogs() {
        logger.viewLog();
        System.out.println("All taxes " + taxes);
    }
}
