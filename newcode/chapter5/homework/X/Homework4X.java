import java.util.Scanner;

public class Homework4X {
    public static void main(String[] args) {
        int arr[] = { 10, 12, 45, 90 };
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.print("input num: ");
            int num = myScanner.nextInt();
            int arrNew[] = new int[arr.length + 1];
            int temp;
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arrNew[arrNew.length - 1] = num;
            for (int i = 0; i < arrNew.length; i++) {
                if (num <= arrNew[i]) {
                    for (int j = arrNew.length - 1; j > i; j--) {
                        temp = arrNew[j - 1];
                        arrNew[j - 1] = arrNew[j];
                        arrNew[j] = temp;
                    }
                    break;
                }
            }
            arr = arrNew;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("y/n");
            char word = myScanner.next().charAt(0);
            if (word == 'n') {
                break;
            }
        }
    }
}
