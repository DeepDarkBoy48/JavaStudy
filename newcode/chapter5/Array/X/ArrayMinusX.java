import java.util.Scanner;

public class ArrayMinusX {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        while (true) {
            if (arr.length == 0) {
                break;
            }
            int arrNew[] = new int[arr.length - 1];
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            System.out.println("====arr减少后元素情况====");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("y/n");
            char key = myScanner.next().charAt(0);
            if (key == 'n') {
                break;
            }
        }

    }
}
