public class test {
    public static void main(String[] args) {
        person person = new person("John", 25);
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}

class person {
    private String name;
    private int age;

//    这个函数是构造函数，用来初始化对象
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
