package Week1.Day5;

public class Circle {
    private double radius = 1.0;
    private String color = "black";

    public Circle(double v, String indigo, boolean b){}

    public Circle(double radius) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override

    public String toString() {
        return "Đây là hình tròn có bán kính là: " + getRadius() + ", màu: " + getColor() + " và có diện tích: " + getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        circle = new Circle(5.3);
        System.out.println(circle);
    }
}