package pl.camp.it.funcyjny;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        calculate(App::pobierzDaneZBazy, App::policz1);

        calculate(App::pobierzDaneZPliku, App::policz2);

        Consumer<Integer> consumer = System.out::println;

        consumer.accept(234);

        Car car = new Car();

        Consumer<Car> consumer1 = Car::jedz;
        consumer1.accept(car);
    }

    public static int policz1(int dane) {
        System.out.println("licze 1 sposobem");
        return dane*1;
    }

    public static int policz2(int dane) {
        System.out.println("licze 2 sposobem");
        return dane*2;
    }

    public static int policz3(int dane) {
        System.out.println("licze 3 sposobem");
        return dane*3;
    }

    public static int pobierzDaneZBazy() {
        System.out.println("pobieram dane z bazy !!");
        return 1;
    }

    public static int pobierzDaneZPliku() {
        System.out.println("pobieram dane z pliku !!");
        return 2;
    }

    public static int calculate1DataFromDB() {
        int dane = pobierzDaneZBazy();
        return policz1(dane);
    }

    public static int calculate(Supplier<Integer> pobieraczDanych,
                                UnaryOperator<Integer> algorytm) {
        return algorytm.apply(pobieraczDanych.get());
    }
}
