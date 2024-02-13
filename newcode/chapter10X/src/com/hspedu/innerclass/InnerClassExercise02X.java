package com.hspedu.innerclass;

public class InnerClassExercise02X {
    public static void main(String[] args) {
        Cellphone2 cellphone2 = new Cellphone2();
        cellphone2.alarmClock(new Bell2() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone2.alarmClock(new Bell2() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}

interface Bell2{
    void ring();
}

class Cellphone2{
    public void alarmClock(Bell2 bell){
        bell.ring();
    }
}
