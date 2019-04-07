package task11p5.model;

import java.util.Date;

public class Receipt implements ReceiptBehavior {

    private String doctor;
    private String tablet;
    private Date date;

    public Receipt(String doctor, String tablet, Date date) {
        this.doctor = doctor;
        this.tablet = tablet;
        this.date = date;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getTablet() {
        return tablet;
    }

    public Date getDate() {
        return date;
    }
}
