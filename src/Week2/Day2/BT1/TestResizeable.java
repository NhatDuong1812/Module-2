package Week2.Day2.BT1;

import Week2.Day2.BT1.Circle;

public class TestResizeable {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        System.out.println(circle);
        Resizeable resizeable = (Resizeable) circle;
        resizeable.resize(6);
        System.out.println(circle);
    }
}
