package L4_Assignment;

public class Circle {
    public final static double pi = 3.142;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public double getArea() {
        return Circle.pi * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2 * Circle.pi * this.radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Circle c = new Circle(3);
        System.out.println(c);
        System.out.printf("Area of the circle is : %f", c.getArea());
        System.out.println("");
        System.out.printf("Circumference of the circle is : %f", c.getCircumference());
    }
}

