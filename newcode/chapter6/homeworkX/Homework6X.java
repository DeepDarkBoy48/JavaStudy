package homeworkX;

public class Homework6X {
    public static void main(String[] args) {
        Cale cale = new Cale(2, 0);
        System.out.println(cale.sum());
        System.out.println(cale.minus());
        System.out.println(cale.mul());
        Double divres = cale.div();
        if (divres != null) {
            System.out.println(cale.div());
        }
    }
}

class Cale {
    double num1;
    double num2;

    public Cale(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum() {
        return this.num1 + this.num2;
    }

    public double minus() {
        return this.num1 - this.num2;
    }

    public double mul() {
        return this.num1 * this.num2;
    }

    public Double div() {
        if (this.num2 == 0) {
            System.out.println("²»ÄÜÎª0");
            return null;
        } else {
            return this.num1 / this.num2;
        }
    }
}
