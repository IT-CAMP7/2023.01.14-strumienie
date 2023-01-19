package pl.camp.it.strumienie;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,9,3,2,6,4,5,5,4,6,7,8,9);

        /*Set<Integer> unique = new HashSet<>();
        for(int element : list) {
            if(element > 3 && element < 7) {
                unique.add(element);
            }
        }

        for(int uniqueElement : unique) {
            System.out.println("Liczba: " + uniqueElement);
        }*/
        /*list.stream()
                .peek(System.out::println)
                .filter(x -> x > 3)
                .filter(x -> x < 7)
                .distinct()
                .map(x -> "Liczba: " + x)
                .skip(1)
                .limit(1)
                .forEach(System.out::println);*/

        OptionalDouble sredniaBox = list.stream()
                .mapToInt(x -> x)
                ///
                ///
                //.boxed()
                .average();

        System.out.println(sredniaBox.getAsDouble());

        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = list.stream();

        int a = 3;

        Predicate<Integer> p = x -> {
            int c = 5;
            return x > c;
        };

        //a = 5;
        s1.filter(p).forEach(System.out::println);
        s2.filter(x -> x > 3).forEach(System.out::println);
    }
}
