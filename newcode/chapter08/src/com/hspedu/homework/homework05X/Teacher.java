package com.hspedu.homework.homework05X;

public class Teacher extends Employee{
    private int classDays;
    private double classSalary;

    public void printSalary(){
        System.out.println("老师");
        System.out.println(getName()+"年工资是"+(getSalary()*getSalMonth()+classDays*classSalary));
    }

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public double getClassSalary() {
        return classSalary;
    }

    public void setClassSalary(double classSalary) {
        this.classSalary = classSalary;
    }
}
