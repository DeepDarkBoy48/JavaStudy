public class ninenineTable {
    public static void main(String[] args) {
        int num1;
        int num2;
        for (num1 = 1; num1 <= 9; num1++) {
            for (num2 = 1; num2 <= num1; num2++) {
                System.out.print(num2 + " * " + num1 + " = " + (num1 * num2) + "\t");
            }
            System.out.println();
        }
    }
}
