package task11p5.model;

import java.util.Date;

public class ProlongedReceipt implements ReceiptBehavior {

    private ReceiptBehavior realReceipt;
    private Date newData;

    public ProlongedReceipt(ReceiptBehavior realReceipt) {
        this.realReceipt = realReceipt;
        newData = new Date();
    }

    public String getDoctor() {
        return realReceipt.getDoctor();
    }

    public String getTablet() {
        return realReceipt.getTablet();
    }

    public Date getDate() {
        return newData;
    }
}
