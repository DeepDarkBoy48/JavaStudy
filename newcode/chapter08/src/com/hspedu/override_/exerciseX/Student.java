package com.hspedu.override_.exerciseX;

public class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);//调用父类的构造器
        this.id = id;
        this.score = score;
    }

    //重写父类的say方法
    public String say() {//super.say()调用父类的say方法
        return super.say() + "\t学号=" + id + "\t成绩=" + score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
