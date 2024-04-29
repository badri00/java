
import electricity.app.*;
public class Bill {
    private String billNo;
    private String status;
    private BillCategory category;
    private int reading;
    private int customerId;
    private double billAmount;
  

    public Bill(String billNo, String status, BillCategory category, int reading, int customerId, double billAmount) {
        this.billNo = billNo;
        this.status = status;
        this.category = category;
        this.reading = reading;
        this.customerId = customerId;
        this.billAmount = billAmount;
    }

    public String getBillNo() {
        return billNo;
    }

    public String getStatus() {
        return status;
    }

    public BillCategory getCategory() {
        return category;
    }

    public int getReading() {
        return reading;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}