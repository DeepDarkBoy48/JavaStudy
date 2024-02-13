package com.hspedu.poly_.polyparameter_.polyparameterX;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public double getAnnual() {
        return super.getAnnual();
    }

    public void work() {
        System.out.println("worker name is " + getName() + " worker salary is " + getAnnual() + " monthly salary is " + getSalary());
    }
}
