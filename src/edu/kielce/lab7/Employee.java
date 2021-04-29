package edu.kielce.lab7;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected double salary;

    public Employee(){
        this.firstName = "John";
        this.lastName = "Henderson";
        this.salary = 0;
    }

    public Employee(Employee myEmployee){
        this.firstName = myEmployee.firstName;
        this.lastName = myEmployee.lastName;
        this.salary = myEmployee.salary;
    }

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double raiseProcent){
        return salary * (1 + (raiseProcent / 100));
    }

    public String toString(){
        return (firstName + " " + lastName + " salary= " + salary);
    }

}
