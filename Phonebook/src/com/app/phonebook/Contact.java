package com.app.phonebook;

import java.time.LocalDate;
import java.util.Objects;

public class Contact {
    private String phoneNumber;
    private final String name;
    private final LocalDate dateOfBirth;
    private String email;

    public Contact(String phoneNumber, String name, LocalDate dateOfBirth, String email) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
   }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getPhoneNumber(), contact.getPhoneNumber()) &&
                Objects.equals(name, contact.name) &&
                Objects.equals(getDateOfBirth(), contact.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhoneNumber(), name, getDateOfBirth());
    }
}