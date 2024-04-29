import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import electricity.app.*;
public class ElectricityBillingSystem {
    private static List<Customer> customers = new ArrayList<>();
    private static List<Bill> bills = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new Customer");
            System.out.println("2. Add new Bill");
            System.out.println("3. Display Bill amount of particular customer");
            System.out.println("4. Display all unpaid bills sorted category wise and bill amount in desc order");
            System.out.println("5. Do Bill payment for customer");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewCustomer(scanner);
                    break;
                case 2:
                    addNewBill(scanner);
                    break;
                case 3:
                    displayBillAmountOfCustomer(scanner);
                    break;
                case 4:
                    displayAllUnpaidBills();
                    break;
                case 5:
                    doBillPayment(scanner);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addNewCustomer(Scanner scanner) {
        System.out.println("Enter customer details:");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Mobile: ");
        String mobile = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();
        System.out.print("Address: ");
        String address = scanner.next();

        Customer customer = new Customer(customers.size() + 1, name, mobile, email, password, address);
        customers.add(customer);
        System.out.println("Customer added successfully!");
    }

    private static void addNewBill(Scanner scanner) {
        System.out.println("Enter bill details:");
        System.out.print("Bill No: ");
        String billNo = scanner.next();
        System.out.print("Category (RESIDENTIAL/COMMERCIAL): ");
        BillCategory category = BillCategory.valueOf(scanner.next().toUpperCase());
        System.out.print("Reading: ");
        int reading = scanner.nextInt();
        System.out.print("Customer ID: ");
        int customerId = scanner.nextInt();
        System.out.print("Bill Amount: ");
        double billAmount = scanner.nextDouble();

        Bill bill = new Bill(billNo, "UNPAID", category, reading, customerId, billAmount);
        bills.add(bill);
        System.out.println("Bill added successfully!");
    }

    private static void displayBillAmountOfCustomer(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();

        for (Bill bill : bills) {
            if (bill.getCustomerId() == customerId) {
                System.out.println("Bill Amount: " + bill.getBillAmount());
                break;
            }
        }
    }

    private static void displayAllUnpaidBills() {
        Collections.sort(bills, (b1, b2) -> {
            if (b1.getCategory() != b2.getCategory()) {
                return b1.getCategory().compareTo(b2.getCategory());
            } else {
                return Double.compare(b2.getBillAmount(), b1.getBillAmount());
            }
        });

        System.out.println("Unpaid Bills:");
        for (Bill bill : bills) {
            if (bill.getStatus().equals("UNPAID")) {
                System.out.println(bill);
            }
        }
    }

    private static void doBillPayment(Scanner scanner) {
        System.out.print("Enter bill No: ");
        String billNo = scanner.next();

        for (Bill bill : bills) {
            if (bill.getBillNo().equals(billNo)) {
                bill.setStatus("PAID");
                System.out.println("Bill paid successfully!");
                break;
            }
        }
    }
}