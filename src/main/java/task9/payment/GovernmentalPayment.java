package task9.payment;

public class GovernmentalPayment extends Payment {
    public GovernmentalPayment(String receiver, long receiverAcountNumber, String sender, long senderAcountNumber, double amount) {
        super(receiver, receiverAcountNumber, sender, senderAcountNumber, amount);
    }
}
