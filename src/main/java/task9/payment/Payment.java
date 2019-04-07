package task9.payment;

public abstract class Payment {

    protected String receiver;
    protected long receiverAcountNumber;
    protected String sender;
    protected long senderAcountNumber;
    protected double amount;
    protected double commision;
    protected double taxes;

    public Payment(String receiver, long receiverAcountNumber, String sender, long senderAcountNumber, double amount) {
        this.receiver = receiver;
        this.receiverAcountNumber = receiverAcountNumber;
        this.sender = sender;
        this.senderAcountNumber = senderAcountNumber;
        this.amount = amount;
        taxes = 0;
        commision = 0;
    }

    public String getReceiver() {
        return receiver;
    }

    public long getReceiverAcountNumber() {
        return receiverAcountNumber;
    }

    public String getSender() {
        return sender;
    }

    public long getSenderAcountNumber() {
        return senderAcountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }

    public double getTotal() {
        return amount + taxes + commision;
    }
}
