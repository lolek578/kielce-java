package edu.kielce.lab9;

abstract class Person {
    private String name, surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    abstract String getDescription();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
