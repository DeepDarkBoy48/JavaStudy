package homeworkX;

public class Homework4X {
    public static void main(String[] args) {
        int[] oldArr = { 1, 4, 2 };
        A03 arr = new A03();
        int[] newArr = arr.copyArr(oldArr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}

class A03 {
    public int[] copyArr(int[] oldArr) {
        int[] newArr = new int[oldArr.length];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}