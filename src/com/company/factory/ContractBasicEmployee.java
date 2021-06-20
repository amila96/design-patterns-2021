package com.company.factory;

public class ContractBasicEmployee extends Employee{

    double rate;

    ContractBasicEmployee(String id,String name, double rate){
        this.id=id;
        this.name=name;
        this.rate=rate;
    }

    @Override
    public double calcSalary(){
        return this.rate-this.rate*0.05;
    }
}
