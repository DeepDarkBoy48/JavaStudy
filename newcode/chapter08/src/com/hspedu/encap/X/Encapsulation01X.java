package com.hspedu.encap.X;

public class Encapsulation01X {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("robingyyg");
        person1.setAge(300);
        person1.setSalary(30000);
        System.out.println(person1.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    //构造器
    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("name is not valid");
            this.name = "aaa";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("age is not valid");
            this.age = 18;
        }
    }

    public double getSalary() {
        //增加对当前对象的权限校验
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "name:" + name + " age:" + age + " salary:" + salary;
    }
}
