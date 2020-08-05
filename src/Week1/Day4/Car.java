package Week1.Day4;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine){

        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return super.toString();

    }

    public static void main(String[] args) {
        Car car1 = new Car("mazda 3" , "ok la 1");
//        car1.setEngine("xe 1");
//        car1.setName("mazda");
        System.out.println(Car.numberOfCars + ":" + car1.getName() + car1.getEngine());
//        System.out.println(car1.getName());
//        System.out.println(car1.getEngine());
//        Car car2 = n ew Car("mazda 4" , "ok la 2");
//        System.out.println(Car.numberOfCars);
//        Car car3 = new Car("mazda 5" , "ok la 3");
//        System.out.println(Car.numberOfCars);

    }
}


