package task9.payment;

public class CommonPayment extends Payment {
    public CommonPayment(String receiver, long receiverAcountNumber, String sender, long senderAcountNumber, double amount) {
        super(receiver, receiverAcountNumber, sender, senderAcountNumber, amount);
    }
}
