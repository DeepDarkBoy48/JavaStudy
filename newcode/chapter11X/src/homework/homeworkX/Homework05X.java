package homework.homeworkX;

public class Homework05X {
    public static void main(String[] args) {
        A a = new A();
        a.BX();
    }
}

class A{
    private final String name="jack";
    public void BX(){
        class B{
            private final String name="robin";
            public void show(){
                System.out.println("Bname="+name+" Aname="+A.this.name);
            }
        }
        B b = new B();
        b.show();

    }
}
