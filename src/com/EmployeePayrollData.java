package com;

public class EmployeePayrollData
{
    int id;
    String name;
    double salary;

    public EmployeePayrollData(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Employee Id: "+id+", Employee Name: "+name+", Employee Salary: "+salary;
    }
}
