package com.hspedu.homeworkX;

public class homework01X {
    public static void main(String[] args) {
        person[] people = new person[3];
        people[0] = new person("robin", 23, "java devoleper");
        people[1] = new person("jack", 20, "C++ devoleper");
        people[2] = new person("mark", 32, "python devoleper");
        System.out.println("before sorting");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        person temp = null;
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {

                if (people[j].getAge() < people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("after sorting");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}

class person {
    private String name;
    private int age;
    private String job;

    public person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
