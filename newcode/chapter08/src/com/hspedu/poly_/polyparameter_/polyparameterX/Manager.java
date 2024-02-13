package com.hspedu.poly_.polyparameter_.polyparameterX;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getAnnual() {
        return super.getSalary() * 12 + bonus;
    }

    public void manage() {
        System.out.println("manager name is " + getName() + " manager salary is " + getAnnual() + " monthly salary is " + getSalary());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
