package com.company.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the employee type:");
        Scanner scanner=new Scanner(System.in);
        String type= scanner.next();

        System.out.print("Enter the employee name:");
        String name= scanner.next();

        System.out.print("Enter the hours worked:");
        int hoursWorked= scanner.nextInt();

        System.out.print("Enter the rate:");
        double rate= scanner.nextDouble();

        EmployeeFactory employeeFactory= new EmployeeFactory();
        Employee employee=employeeFactory.getInstance(type, name,hoursWorked,rate);
        System.out.println("Salary of "+name+" is "+employee.calcSalary());









        //employee 1
        /*Employee nimal=new HourlyEmployee("1","Nimal",40,1000);
        System.out.println("Salary of Nimal is "+nimal.calcSalary());*/
//id name rate
        //Employee kamal= new MonthlyEmployee("2","Kamal", 10000);
        //System.out.println("Salary of Kamal is "+kamal.calcSalary());

        /*Employee saman=new HourlyEmployee("1","Nimal",40,1000);
        System.out.println("Salary of Nimal is "+saman.calcSalary());
*/
        //employee 2
       /* Employee employee2=new Employee();
        employee.id="1";
        employee.name="Kamal";
        employee.type="monthly";
        employee.rate=10000;

        System.out.println("Salary of Nimal is "+employee.calcSalary());
*/


    }
}
