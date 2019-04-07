package task11p5;

import task11p5.model.Receipt;
import task11p5.model.ReceiptBehavior;
import task11p5.model.ProlongedReceipt;

import java.util.Date;

public class Appplication {
    public static void main(String[] args) throws InterruptedException {

        ReceiptBehavior realReceipt = new Receipt("Smith", "Haloperidol", new Date());

        System.out.println(realReceipt.getDoctor());
        System.out.println(realReceipt.getTablet());
        System.out.println(realReceipt.getDate());
        Thread.sleep(1000);

        ReceiptBehavior prolongedReceipt = new ProlongedReceipt(realReceipt);
        System.out.println(prolongedReceipt.getDoctor());
        System.out.println(prolongedReceipt.getTablet());
        System.out.println(prolongedReceipt.getDate());
    }
}
