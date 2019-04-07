package task9.payment;

public class PreferentialPyment extends Payment {
    public PreferentialPyment(String receiver, long receiverAcountNumber, String sender, long senderAcountNumber, double amount) {
        super(receiver, receiverAcountNumber, sender, senderAcountNumber, amount);
    }
}
