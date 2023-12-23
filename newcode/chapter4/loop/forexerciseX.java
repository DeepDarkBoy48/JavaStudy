public class forexerciseX {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 10;
        int temp = num2;
        for (; num1 <= temp; num1++, num2--) {
            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        }
    }
}
