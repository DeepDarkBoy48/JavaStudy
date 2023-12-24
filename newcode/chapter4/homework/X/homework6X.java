public class homework6X {
    public static void main(String[] args) {
        int i = 1;
        int shift = 0;
        for (; i <= 100; i++) {
            if (i % 5 != 0) {
                shift++;
                if (shift == 6) {
                    shift = 1;
                    System.out.println();
                }
                System.out.print(i + "\t");
            }
        }
    }
}
