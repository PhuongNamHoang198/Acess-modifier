package Bai2;

public class car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }
}
