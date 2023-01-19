package pl.camp.it.funcyjny;

import pl.camp.it.SuperFunkcja;
import pl.camp.it.anonimowe.Car;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> f = x -> "Liczba: " + x;

        String s = f.apply(5);
        System.out.println(s);

        System.out.println(f.apply(10));

        BiFunction<Integer, Double, String> biFunction = (i, d) -> "Wyliczona wartosc: " + i*d;

        System.out.println(biFunction.apply(4, 5.7));

        UnaryOperator<Integer> unaryOperator = x -> x*10;

        System.out.println(unaryOperator.apply(15));
        System.out.println(unaryOperator.apply(4));
        System.out.println(unaryOperator.apply(7));

        Predicate<String> predicate = str -> {
            if(str.contains("a")) {
                return true;
            } else if (!str.contains("a") && str.contains("b")) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("axc"));
        System.out.println(predicate.test("zzz"));

        Supplier<Car> supplier = () -> new Car("default", "default", 100);

        System.out.println(supplier.get());

        Consumer<Car> consumer = c -> {
            System.out.println("zjadam auto !!!");
            System.out.println(c);
        };

        consumer.accept(new Car("asdfasd", "Asdfasdfas", 123));

        consumer.accept(supplier.get());

        SuperFunkcja superFunkcja = () -> System.out.println("super funkcja działa !!");

        SuperFunkcja superFunkcja2 = new SuperFunkcja() {
            @Override
            public void a() {
                System.out.println("super funkcja działa !!");
            }
        };
    }
}
