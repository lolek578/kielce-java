package edu.kielce.lab9;

public class PersonMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John", " Employee", 6000);
        Student student = new Student("Martin", " Student", "IT Engineer");

        System.out.println(employee.getDescription());
        System.out.println(student.getDescription());
    }
}
