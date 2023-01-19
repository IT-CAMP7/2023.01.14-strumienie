package pl.camp.it.niemutowalne;

public class Car {
    private final int id;
    private final String brand;
    private final String model;


    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
