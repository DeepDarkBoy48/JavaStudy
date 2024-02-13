package com.hspedu.override_.exerciseX;

public class overrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 20);
        System.out.println(jack.say());
        Student tom = new Student("tom", 18, 1001, 100);
        System.out.println(tom.say());

    }
}
