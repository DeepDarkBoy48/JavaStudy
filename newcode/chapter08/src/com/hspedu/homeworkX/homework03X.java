package com.hspedu.homeworkX;

public class homework03X {
    public static void main(String[] args) {
        Professor teacher1 = new Professor("robin", 23, "tutor", 5000,1.3);
        tutor teacher2 = new tutor("bob", 23, "chef", 10000,1.2);
        subProfessor teacher3 = new subProfessor("batman", 23, "cleaner", 22000,1.1);
        teacher1.introduce(teacher1);
        teacher2.introduce(teacher2);
        teacher3.introduce(teacher3);
    }
}

class Teacher{
    private String name;
    private int age;
    private String post;
    private int salary;
    private double level;

    public void introduce(Teacher person){
        System.out.println(person);
    }

    public Teacher(String name, int age, String post, int salary, double level) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

class Professor extends Teacher{
    public Professor(String name, int age, String post, int salary, double level) {
        super(name, age, post, salary, level);
    }

    @Override
    public void introduce(Teacher person) {
        System.out.println("professor");
        super.introduce(person);
    }
}

class subProfessor extends Teacher{
    public subProfessor(String name, int age, String post, int salary, double level) {
        super(name, age, post, salary, level);
    }

    @Override
    public void introduce(Teacher person) {
        System.out.println("subProfessor");
        super.introduce(person);
    }
}

class tutor extends Teacher{
    public tutor(String name, int age, String post, int salary, double level) {
        super(name, age, post, salary, level);
    }

    @Override
    public void introduce(Teacher person) {
        System.out.println("tutor");
        super.introduce(person);
    }
}
