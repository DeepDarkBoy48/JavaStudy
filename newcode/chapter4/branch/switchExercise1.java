import java.util.Scanner;

public class switchExercise1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("input word: ");
        int word = myScanner.nextInt();
        if (word <= 12 && word > 0) {

            switch (word) {
                case 2:
                case 3:
                case 4:
                    System.out.println("spring");
                    break;
                case 5:
                case 6:
                case 7:
                    System.out.println("summer");
                    break;
                case 8:
                case 9:
                case 10:
                    System.out.println("fall");
                    break;
                default:
                    System.out.println("winter");
                    break;
            }
        }
    }
}
