package homework.homeworkX;

public class Homework03X {
    public static void main(String[] args) {
        Animal cat = new cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}

abstract class Animal{
    public abstract void shout();
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("dog shout");
    }
}

class cat extends Animal{
    @Override
    public void shout() {
        System.out.println("cat shout");
    }
}
