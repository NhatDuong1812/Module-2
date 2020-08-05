package Week1.Day4;

public class Method {
    public static void main(String[] args) {
        TestCircle area = new TestCircle(1 , "red");
        area.setRadius(1);
        System.out.println(area.getRadius());
        TestCircle Radius = new TestCircle( 2, "red");
        Radius.setColor("yellow");
        System.out.println(Radius.getColor());
    }
}
