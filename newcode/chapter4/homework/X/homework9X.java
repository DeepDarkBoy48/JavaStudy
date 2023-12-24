public class homework9X {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;
        int i, j;
        for (i = 1; i <= 100; i++) {
            for (sum = 0, j = 1; j <= i; j++) {
                sum += j;
            }
            total += sum;
        }
        System.out.println(total);
    }
}
