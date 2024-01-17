package homeworkX;

public class Homework5X {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.area());
        System.out.println(circle.len());
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double len() {
        return 2 * Math.PI * radius;
    }

}
