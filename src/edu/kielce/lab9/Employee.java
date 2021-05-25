package edu.kielce.lab9;

public class Employee<salary> extends Person{
    private double salary;

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void bonus(double procent){
        double bonus = (salary*procent) / 100;
        salary += bonus;
        System.out.println("Salary with bonus = " + bonus);
    }

    @Override
    public String getDescription() {
        return getName() + " " + getSurname() + " " + getSalary();
    }
}
