package com.hspedu.homework.homework05X;

public class Worker extends Employee{
    public Worker(String name,double salary){
        super(name,salary);
    }

    @Override
    public void printSalary() {
        System.out.println("工人");
        super.printSalary();
    }
}
