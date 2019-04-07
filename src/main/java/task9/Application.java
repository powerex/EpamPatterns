package task9;

import task9.model.Bank;
import task9.payment.*;

public class Application {

    public static void main(String[] args) {
        Bank stereo = new Bank();

        Payment payment1 = new GovernmentalPayment("Avtodor", 132L, "Repair", 432L, 10000);
        Payment payment2 = new CommonPayment("Ben", 678567L, "Bob", 23452345L, 1000);
        Payment payment3 = new CommonPayment("Ben", 678567L, "Ben", 5467456L, 10);
        Payment payment4 = new PreferentialPyment("Robert", 5467345L, "Martin", 95645L, 5000);
        Payment payment5 = new InnerPayment("Accounting department", 567456L, "IT department", 6345645L, 1000000);

        stereo.executePayment(payment1);
        stereo.executePayment(payment2);
        stereo.executePayment(payment3);
        stereo.executePayment(payment4);
        stereo.executePayment(payment5);



        stereo.showLogs();
    }

}
