package homeworkX;

public class Homework3X {
    public static void main(String[] args) {
        book p = new book("robin", 120.5);
        p.info();
        p.updatePrice();
        p.info();
    }
}

class book {
    String name;
    double price;

    // ¹¹ÔìÆ÷
    public book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
        return this.price;
    }

    public void info() {
        System.out.println("name:" + this.name + " price:" + this.price);
    }
}
