package homework.homeworkX;

public class Homework04X {
    public static void main(String[] args) {
        cellphone cellphone = new cellphone();
        cellphone.testWork(new Calculate() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8);
        cellphone.testWork(new Calculate() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },20,5);
    }
}

interface Calculate{
    public double work(double n1, double n2);
}

class cellphone {
    public void testWork(Calculate calculate,double n1,double n2){
        double result = calculate.work(n1,n2);
        System.out.println("result="+result);
    }
}
