package pl.camp.it.strumienie;

import java.util.function.Predicate;

public class Predykat implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer > 3;
    }
}
