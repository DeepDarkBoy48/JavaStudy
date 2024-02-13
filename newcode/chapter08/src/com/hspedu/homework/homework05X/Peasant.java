package com.hspedu.homework.homework05X;

public class Peasant extends Employee{
    public Peasant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("农民");
        super.printSalary();
    }
}
