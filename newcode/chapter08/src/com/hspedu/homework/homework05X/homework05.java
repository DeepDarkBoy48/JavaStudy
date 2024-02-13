package com.hspedu.homework.homework05X;

public class homework05 {
    public static void main(String[] args) {
        Worker robin = new Worker("robin", 1000);
        robin.setSalMonth(10);
        robin.printSalary();
        Peasant smith = new Peasant("smith", 2000);
        smith.printSalary();
        Teacher mark = new Teacher("mark", 3000);
        mark.setClassDays(360);
        mark.setClassSalary(100);
        mark.printSalary();
        Science jack = new Science("jack", 4000);
        jack.setBonus(10000);
        jack.printSalary();
    }
}
