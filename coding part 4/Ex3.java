class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double findArea() {
        return Math.PI * radius * radius;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);

        double area = c1.findArea();

        System.out.println("Radius: " + c1.radius);
        System.out.println("Area: " + area);
    }
}