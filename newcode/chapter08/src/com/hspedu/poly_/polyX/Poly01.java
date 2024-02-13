package com.hspedu.poly_.polyX;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog dog1 = new Dog("dog1");
        Bone bigBone = new Bone("bigBone");
        tom.feed(dog1, bigBone);

        Cat littleCat = new Cat("littleCat");
        Fish littleFish = new Fish("littleFish");
        System.out.println("=========");
        tom.feed(littleCat, littleFish);

        System.out.println("=========");
        Pig pigRobin = new Pig("pigRobin");
        Rice rice1 = new Rice("Rice1");
        tom.feed(pigRobin, rice1);

    }
}
