package com.hspedu.poly_.polyX;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态机制，统一管理
    //animal 的编译类型是Animal，可以指向（接收）Animal子类的对象
//    food的编译类型是Food，可以指向（接收）Food子类的对象
    public void feed(Animal animal, Food food) {
        System.out.println("Master " + name + " feed " + animal.getName() + " with " + food.getName());
    }

    //主人给小狗为食骨头
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("Master " + name + " feed " + dog.getName() + " with " + bone.getName());
//    }
//
//    //主人给小猫为食骨头
//    //方法重载
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("Master " + name + " feed " + cat.getName() + " with " + fish.getName());
//    }
}
