package Week1.Day5;

public class BTCylinder extends Circle {
    private double height = 1.0;

    public BTCylinder() {
        super(3.5, "indigo", false);
    }

    public BTCylinder(double height) {
        super(3.5, "indigo", false);
        this.height = height;
    }

    public BTCylinder(double height, double radius, String color) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Đây là hình trụ có chiều cao: " + getHeight() + " với thể tích là: " + getVolume() + " kế thừa từ lớp hình tròn: " + super.toString();
    }

    public static void main(String[] args) {
        Circle btCylinder = new BTCylinder();
        System.out.println(btCylinder.toString());

        btCylinder = new BTCylinder(4.2, 4, "Yellow");
        System.out.println(btCylinder.toString());

        btCylinder = new BTCylinder(4.2, 2.4, "pink");
        System.out.println(btCylinder.toString());
    }
}
