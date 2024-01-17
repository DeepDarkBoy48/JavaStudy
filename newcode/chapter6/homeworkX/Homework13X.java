public class Homework13X {
    public static void main(String[] args) {
        PassObject p1 = new PassObject();
        Circle c1 = new Circle();
        p1.printAreas(c1, 8);
    }
}

class Circle {
    double radius;

    public double findArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    public void printAreas(Circle c, int times) {
        System.out.println("Radius" + "\t" + "Area");
        for (double i = 1; i <= times; i++) {
            c.setRadius(i);
            double area = c.findArea();
            System.out.println(i + "\t" + area);
        }
    }
}
