public class homework8X {
    public static void main(String[] args) {
        double num1 = 1;
        double num2 = 1;
        double sum = 0;
        for (; num2 <= 100; num2++) {
            if (num2 % 2 == 0) {
                sum -= num1 / num2;
            } else {
                sum += num1 / num2;
            }
        }
        System.out.println(sum);

    }

}
