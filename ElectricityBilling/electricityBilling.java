// Customer.java
public class Customer {
    private int id;
    private String name;
    private String mobile;
    private String email;
    private String password;
    private String address;

    public Customer(int id, String name, String mobile, String email, String password, String address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// BillCategory.java
public enum BillCategory {
    RESIDENTIAL,
    COMMERCIAL
}

// Bill.java
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

    // Getters and setters
    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BillCategory getCategory() {
        return category;
    }

    public void setCategory(BillCategory category) {
        this.category = category;
    }

    public int getReading() {
        return reading;
    }

    public void setReading(int reading) {
        this.reading = reading;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
}

// ValidationUtil.java
public class ValidationUtil {
    public static boolean isValidEmail(String email) {
        // Implement email validation
        // Return true if email is valid, false otherwise
    }

    public static boolean isValidMobile(String mobile) {
        // Implement mobile validation
        // Return true if mobile is valid, false otherwise
    }

    // Other validation methods
}

// ElectricityBillingService.java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ElectricityBillingService {
    private List<Customer> customers;
    private List<Bill> bills;

    public ElectricityBillingService() {
        this.customers = new ArrayList<>();
        this.bills = new ArrayList<>();
    }

    public void addNewCustomer(int id, String name, String mobile, String email, String password, String address) {
        if (!ValidationUtil.isValidMobile(mobile) || !ValidationUtil.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid mobile number or email");
        }

        customers.add(new Customer(id, name, mobile, email, password, address));
    }

    public void addNewBill(String billNo, String status, BillCategory category, int reading, int customerId, double billAmount) {
        bills.add(new Bill(billNo, status, category, reading, customerId, billAmount));
    }

    public double displayBillAmount(int customerId) {
        double totalBillAmount = 0;
        for (Bill bill : bills) {
            if (bill.getCustomerId() == customerId) {
                totalBillAmount += bill.getBillAmount();
            }
        }
        return totalBillAmount;
    }

    public List<Bill> displayUnpaidBillsSorted() {
        return bills.stream()
                .filter(bill -> "UNPAID".equals(bill.getStatus()))
                .sorted(Comparator.comparing(Bill::getCategory).thenComparing(Bill::getBillAmount).reversed())
                .collect(Collectors.toList());
    }

    public void doBillPayment(int customerId) {
        // Implement bill payment logic
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        ElectricityBillingService service = new ElectricityBillingService();

        // Example usage
        service.addNewCustomer(1, "John Doe", "1234567890", "john@example.com", "password123", "123 Main St");
        service.addNewBill("B001", "UNPAID", BillCategory.RESIDENTIAL, 1000, 1, 50.0);
        
        // Example display
        double billAmount = service.displayBillAmount(1);
        System.out.println("Total bill amount for customer 1: $" + billAmount);
    }
}
