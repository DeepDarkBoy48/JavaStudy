package homeworkX;

public class Homework2X {
    public static void main(String[] args) {
        A02 p = new A02();
        String[] strs = { "tom", "robin", "john" };
        int index = p.find("john", strs);
        System.out.println(index);
    }
}

class A02 {
    public int find(String findStr, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            if (findStr.equals(strs[i])) {
                return i;
            }
        }
        return -1;
    }
}
