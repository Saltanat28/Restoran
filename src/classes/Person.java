package classes;

import enums.Country;
import enums.Status;

import java.io.ObjectInputFilter;
import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private ObjectInputFilter.Status status;
    private double bankAccount;
    private Country country;

    public Person(String name, LocalDate dateOfBirth, ObjectInputFilter.Status status, double bankAccount, Country country) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.bankAccount = bankAccount;
        this.country = country;
    }

    public Person(String saltanat, LocalDate of, Status client, int bankAccount, Country poland) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ObjectInputFilter.Status getStatus() {
        return status;
    }

    public void setStatus(ObjectInputFilter.Status status) {
        this.status = status;
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person:" +
                 name +
                 dateOfBirth +
                 status +
                 bankAccount +
                 country +
                '.';
    }
}
