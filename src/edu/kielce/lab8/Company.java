package edu.kielce.lab8;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Novitzki");
        Employee director1 = new Director("Gregory", "Smith", "123 456 789");

        System.out.println(employee1.toString());
        System.out.println(director1.toString());

    }
}
