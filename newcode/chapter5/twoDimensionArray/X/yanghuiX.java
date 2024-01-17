public class yanghuiX {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        int i, j;
        for (i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (j = 0; j < arr[i].length; j++) {
                if (i > 1 && j != 0 && j != arr[i].length - 1) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                } else {
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println("arr");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
