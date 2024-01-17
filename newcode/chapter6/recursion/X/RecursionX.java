public class RecursionX {
    public static void main(String[] args) {
        Febonacci F = new Febonacci();
        int fNum = F.fNum(4);
    }
}

class Febonacci {
    public int fNum(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return fNum(num - 1) + fNum(num - 2);
        }
    }
}