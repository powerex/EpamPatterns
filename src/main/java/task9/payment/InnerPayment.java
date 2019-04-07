package task9.payment;

public class InnerPayment extends Payment {
    public InnerPayment(String receiver, long receiverAcountNumber, String sender, long senderAcountNumber, double amount) {
        super(receiver, receiverAcountNumber, sender, senderAcountNumber, amount);
    }
}
