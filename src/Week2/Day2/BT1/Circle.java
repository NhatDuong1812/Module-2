package Week2.Day2.BT1;

public class Circle {
    private double radius = 1.0;
    private String color = "black";

    public Circle(double v, String indigo, boolean b) {
    }

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
        Week1.Day5.Circle circle = new Week1.Day5.Circle(3.5, "indigo", false);
        System.out.println(circle);

        circle = new Week1.Day5.Circle(5.3);
        System.out.println(circle);
    }
}