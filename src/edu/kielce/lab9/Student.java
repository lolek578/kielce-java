package edu.kielce.lab9;

public class Student extends Person{
    private String specialization;

    public Student(String name, String surname, String specialization) {
        super(name, surname);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String getDescription() {
        return getName() + " " + getSurname() + " " + getSpecialization();
    }
}
