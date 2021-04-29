package edu.kielce.lab7;

public class Business {
    public static void main(String[] args) {

        Employee employeeBond = new Employee("James", "Bond", 7);
        Manager managerRobert = new Manager("Robert", "Johnson", 10000);
        managerRobert.setBonus(25);
        System.out.println("Bond's salary = " + employeeBond.raiseSalary(50));

        Employee employees[] = new Employee[4];

        employees[0]= managerRobert;
        employees[1] = new Employee(employeeBond);
        employees[2] = new Employee();
        employees[3] = new Employee("Michael" , "Jordan", 23232);

        for(Employee x : employees){
            System.out.println(x);
        }


    }
}
