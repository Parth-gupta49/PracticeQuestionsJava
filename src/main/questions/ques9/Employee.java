package main.questions.ques9;

import java.time.LocalDate;
import java.time.Period;

/*9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.*/
public class Employee {
    int salary;
    String name;
    LocalDate hireDate;

    public Employee(int salary, String name, LocalDate hireDate) {
        this.salary = salary;
        this.name = name;
        this.hireDate = hireDate;
    }
    public int yearOfService(){
        return Period.between(hireDate,LocalDate.now()).getYears();
    }


    public void printEmployeeDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("HireDate: " + hireDate);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(20000,"Steve Smith",LocalDate.parse("2009-04-01"));
        Employee employee2 = new Employee(30000,"David Warner",LocalDate.parse("2008-08-06"));
        Employee employee3 = new Employee(25000,"Patrick Cummins",LocalDate.parse("2011-09-24"));
        Employee employee4 = new Employee(19000,"Glenn Maxwell",LocalDate.parse("2013-07-14"));
        employee1.printEmployeeDetails();
        System.out.println("Years of Service: " + employee1.yearOfService());
        employee2.printEmployeeDetails();
        System.out.println("Years of Service: " + employee2.yearOfService());
        employee3.printEmployeeDetails();
        System.out.println("Years of Service: " + employee3.yearOfService());
        employee4.printEmployeeDetails();
        System.out.println("Years of Service: " + employee4.yearOfService());
    }
}
