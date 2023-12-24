public class homework1X {
    public static void main(String[] args) {
        double money = 100000;
        int chance = 0;
        while (true) {
            if (money > 50000) {
                money -= money * 0.05;
                chance++;
            } else if (money <= 50000 && money >= 1000) {
                money -= 1000;
                chance++;
            } else {
                break;
            }
        }
        System.out.println(chance);
        System.out.println(money);
    }
}
