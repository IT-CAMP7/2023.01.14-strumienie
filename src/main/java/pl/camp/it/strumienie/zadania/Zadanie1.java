package pl.camp.it.strumienie.zadania;

import java.util.*;
import java.util.function.Supplier;

public class Zadanie1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("asdfasd");
        strings.add("asdfSDF");
        strings.add("asdffjkhlhjkhjhewrwe");
        strings.add("asdf fewrwe");
        strings.add("asdf fewSDFwA");
        strings.add("asdsdfgff.ewr.we");
        strings.add("asd ffewr.we");
        strings.add("asASDFASfAewr.we");
        strings.add("asdff,ewrhdfghwe");
        strings.add("asdhdfffffff,ew.rwe");
        strings.add("asd.ff,ewASDFrwe");
        strings.add("asd.ff,ew rwe");
        strings.add("asd.ff,ew rDFGwe");

        strings.stream()
                .filter(s -> s.equals(s.toLowerCase()))
                .filter(s -> !s.contains(" "))
                .map(s -> s.replaceAll("\\.", ""))
                .map(s -> s.replaceAll(",", ""))
                .mapToInt(String::length)
                .average()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("nie ma stringow spelniajacych warunki !!"));

        /*Supplier<String> defaultStringSupplier = () -> "superAdmin";
        Optional<String> stringBox = Optional.empty();
        String s = stringBox.orElseThrow(BrakStringaException::new);
        System.out.println(s);*/
    }
}
