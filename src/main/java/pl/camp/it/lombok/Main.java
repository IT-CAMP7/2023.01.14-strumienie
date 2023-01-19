package pl.camp.it.lombok;

public class Main {
    public static void main(String[] args) {
        //Car car = new Car();
        /*car.setId(5);
        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setYear(1234);
        car.setPlate("KR1111");

        car.getBrand();*/
        Car car = new Car().id(5).brand("Kia").model("Ceed").plate("KR876").year(12345);

        System.out.println(car.id());

        System.out.println(car);

        Car car2 = new Car(4, "BMW", "5", "KR444", 1234);
        Car car3 = new Car(4, "BMW", "5", "KR444", 1234);

        System.out.println(car2);

        System.out.println(car2.equals(car3));

        Car.CarBuilder carBuilder = new Car.CarBuilder();
        Car car4 = carBuilder
                .id(5)
                .brand("Audi")
                .model("A5")
                .plate("KR5555")
                .year(2020)
                .build();

        System.out.println(car4);
    }
}
