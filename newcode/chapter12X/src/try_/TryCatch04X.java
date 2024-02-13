package try_;

import java.util.Scanner;
//recursion
public class TryCatch04X {
    public static void main(String[] args) {
        TryCatch04X tryCatch04X = new TryCatch04X();
        System.out.println("the input number is: "+tryCatch04X.input());
    }

    Scanner scanner = new Scanner(System.in);

    public int input() {
        int num;
        String inputStr = "";
        System.out.println("input a integer");
        inputStr = scanner.next();
        try {
            num = Integer.parseInt(inputStr);
            return num;
        } catch (NumberFormatException e) {
            System.out.println("input is not a integer");
            return input();
        }
    }
}


