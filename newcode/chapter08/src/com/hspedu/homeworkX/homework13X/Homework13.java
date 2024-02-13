package com.hspedu.homeworkX.homework13X;

public class Homework13 {
    public static void main(String[] args) {
        Student student = new Student("robin", 'm', 20, "192032");
        Teacher teacher = new Teacher("mark", 'w', 30, 3);
        teacher.printInfo();
        System.out.println();
        student.printInfo();
        System.out.println();

        Person[] people = new Person[4];
        people[0]=new Student("mary1",'w',10,"10002");
        people[1]=new Student("mary2",'m',12,"10003");
        people[2]=new Teacher("mary3",'w',20,3);
        people[3]=new Teacher("mary4",'m',30,2);
        Homework13 homework13 = new Homework13();
        homework13.bubble(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
            homework13.test(people[i]);
        }

    }
    public void test(Person p){
        if(p instanceof Student){
            ((Student) p).study();
        } else if (p instanceof  Teacher) {
            ((Teacher)p).teach();
        }else {
            System.out.println("do nothing");
        }
    }
    public void bubble(Person[] people){
        Person temp=null;
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j <people.length-1-i ; j++) {
                if (people[j].getAge()<people[j+1].getAge()){
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }
}
