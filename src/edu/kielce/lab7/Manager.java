package edu.kielce.lab7;

public class Manager extends Employee{
    private double bonus;

    public Manager(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
        this.bonus = 0;
    }

    public double getManagerSalary(){
        return salary * (1 + (bonus / 100));
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public String toString(){
        return (firstName + " " + lastName + " salary = " + getManagerSalary());
    }
}
