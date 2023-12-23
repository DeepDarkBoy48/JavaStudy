public class StarsX {
    public static void main(String[] arg) {
        int layer = 20;
        for (int i = 0; i <= layer; i++) {
            for (int j = 0; j <= 2 * layer; j++) {
                if (i != layer) {
                    if (j == layer - i || j == layer + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}