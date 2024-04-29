package com.app.phonebook;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBookUtility phoneBookUtility = new PhoneBookUtility();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (true) {
            System.out.println("\nPhoneBook Menu:");
            System.out.println("1. Add new Contact");
            System.out.println("2. Display All Contact Details");
            System.out.println("3. Update Contact details for given Name & Date of Birth");
            System.out.println("4. Remove all Contacts who are above 80 years");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter Phone Number: ");
                    scanner.nextLine();
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
                    LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
                    System.out.print("Enter Email (optional): ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(phoneNumber, name, dateOfBirth, email);
                    try {
                        phoneBookUtility.addNewContact(contact);
                        System.out.println("Contact added successfully.");
                    } catch (PhoneBookException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    phoneBookUtility.displayAllContactDetails();
                    break;
                case 3:
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
                    dateOfBirth = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
                    System.out.print("Enter new Phone Number: ");
                    phoneNumber = scanner.nextLine();
                    System.out.print("Enter new Email (optional): ");
                    email = scanner.nextLine();

                    try {
                        phoneBookUtility.updateContactDetails(name, dateOfBirth, phoneNumber, email);
                        System.out.println("Contact updated successfully.");
                    } catch (PhoneBookException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    phoneBookUtility.removeContactsAboveEighty();
                    System.out.println("Contacts above 80 years removed.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}