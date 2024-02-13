package homework.homeworkX;

public class Homework02X {

}

class  Frock{
    private static int currentNum = 100000;
    private int serialNumber;
    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }

    public Frock() {
        serialNumber=getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}

class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}
