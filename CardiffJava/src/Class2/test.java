package Class2;

public class test {
    public static void main(String[] args) {
        person p = new person("John", 25);
        p.getName();
        p.getAge();
        p.setName("Jane");
        p.setAge(30);
        p.getName();
        p.getAge();
        // Output:
    }
}

class person {
    private String name;
    private int age;

    // 这个函数是构造函数，用来初始化类的成员变量
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 这个函数是类的成员函数，用来获取类的成员变量
    public void getName() {
        System.out.println(name);
    }

    // 这个函数是类的成员函数，用来获取类的成员变量
    public void getAge() {
        System.out.println(age);
    }

    // 这个函数是类的成员函数，用来设置类的成员变量
    public void setName(String name) {
        this.name = name;
    }

    // 这个函数是类的成员函数，用来设置类的成员变量
    public void setAge(int age) {
        this.age = age;
    }
}
