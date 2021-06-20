package com.company.factory;

public class EmployeeFactory {
    public Employee getInstance(String type, String name, int hoursWorked , double rate){

        Employee employee=null;

        if(type.equals("hourly")){
            employee=new HourlyEmployee("1",name,hoursWorked,rate);
        }
        else if(type.equals("daily")){
            employee=new DailyEmployee("2",name,hoursWorked,rate);
        }
        else if(type.equals("monthly")){
            employee=new MonthlyEmployee("3",name,rate);
        }
        else if(type.equals("contract")){
            employee=new ContractBasicEmployee("4",name,rate);
        }
        return employee;
    }
}
