package pl.camp.it.niemutowalne;

public class Main {
    public static void main(String[] args) {
        String s = "ABC";

        Car c = new Car(1, "BMW", "3");
        System.out.println(c.getBrand());
    }
}
