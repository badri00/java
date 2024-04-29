package com.app.phonebook;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookUtility {
    private List<Contact> contacts;

    public PhoneBookUtility() {
        contacts = new ArrayList<>();
    }

    public void addNewContact(Contact contact) throws PhoneBookException {
        if (isContactExists(contact)) {
            throw new PhoneBookException("Contact already exists.");
        }
        contacts.add(contact);
    }

    public void displayAllContactDetails() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void updateContactDetails(String name, LocalDate dateOfBirth, String newPhoneNumber, String newEmail) throws PhoneBookException {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name) && contact.getDateOfBirth().equals(dateOfBirth)) {
                Contact updatedContact = new Contact(newPhoneNumber, name, dateOfBirth, newEmail);
                contacts.set(i, updatedContact);
                return;
            }
        }
        throw new PhoneBookException("Contact not found.");
    }

    public void removeContactsAboveEighty() {
        contacts.removeIf(contact -> Period.between(contact.getDateOfBirth(), LocalDate.now()).getYears() > 80);
    }

    private boolean isContactExists(Contact contact) {
        for (Contact existingContact : contacts) {
            if (existingContact.equals(contact)) {
                return true;
            }
        }
        return false;
    }
}