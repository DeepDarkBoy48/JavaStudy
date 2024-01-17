public class Homework4XX {
    public static void main(String[] args) {
        int arr[] = { 10, 12, 45, 90 };
        int num = -1;
        int arrNew[] = new int[arr.length + 1];
        int temp;
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = num;
        for (int i = 0; i < arrNew.length; i++) {
            if (num <= arrNew[i]) {
                for (int j = arrNew.length - 1; j > i; j--) {
                    temp = arrNew[j - 1];
                    arrNew[j - 1] = arrNew[j];
                    arrNew[j] = temp;
                }
                break;
            }
        }
        arr = arrNew;
        System.out.println("======插入后，arr数组的元素情况======");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
