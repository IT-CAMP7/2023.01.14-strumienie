package pl.camp.it.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Janusz");
        lista.add("Artur");
        lista.add("Zbyszek");
        lista.add("Karol");
        lista.add("Bogdan");

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "3", 234));
        cars.add(new Car("Audi", "A3", 200));
        cars.add(new Car("Toyota", "Corolla", 150));
        cars.add(new Car("KIA", "Ceed", 180));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });

        System.out.println(cars);

        Comparator<Car> c1 = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        };
        Collections.sort(cars, c1);

        System.out.println(cars);

        Interfejs i = new Interfejs() {
            public void d() {
                System.out.println("jestem d !!!");
            }
            @Override
            public void a() {
                System.out.println("jestem a !!!");
            }

            @Override
            public void b() {
                System.out.println("jestem b !!!");
            }

            @Override
            public void c() {
                System.out.println("jestem c !!!");
            }
        };

        i.a();
        i.b();
        i.c();
        //i.d();
    }
}
