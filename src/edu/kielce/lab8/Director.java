package edu.kielce.lab8;

public class Director extends Employee{
    private String phoneNumber;

    public Director(String name, String surname, String phoneNumber) {
        super(name, surname);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                "phoneNumber='" + phoneNumber + '\'';
    }
}
