package homeworkX;

public class Homework1X {
    public static void main(String[] args) {
        A01 p = new A01();
        double[] arr = { 1.2, 3.3, 43.5, 2, 9.4 };
        Double res = p.max(arr);
        if (res != null) {
            System.out.println("arr的最大值：" + p.max(arr));
        } else {
            System.out.println("不正确");
        }
    }
}

class A01 {
    public Double max(double[] arr) {
        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }
        return null;
    }
}
