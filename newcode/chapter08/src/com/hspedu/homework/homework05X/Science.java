package com.hspedu.homework.homework05X;

public class Science extends Employee{
    private double bonus;
    public Science(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("科学家");
        System.out.println(getName()+"年工资是"+(getSalary()*getSalMonth()+bonus));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
