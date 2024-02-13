package com.hspedu.poly_.polyparameter_.polyparameterX;

public class PolyParameter {
    public static void main(String[] args) {
        Worker robin = new Worker("Robin", 3000);
        Manager bob = new Manager("Bob", 6000, 500);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(robin);
        polyParameter.showEmpAnnual(bob);
        polyParameter.testWork(robin);
        polyParameter.testWork(bob);
    }

    public void showEmpAnnual(Employee a) {
        System.out.println(a.getAnnual());
    }

    public void testWork(Employee a) {
        if (a instanceof Worker) {
            ((Worker) a).work();
        } else if (a instanceof Manager) {
            ((Manager) a).manage();
        } else {
            System.out.println("no action");
        }
    }
}
