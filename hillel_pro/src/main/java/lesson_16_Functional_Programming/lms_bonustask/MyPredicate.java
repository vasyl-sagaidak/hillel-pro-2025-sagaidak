package lesson_16_Functional_Programming.lms_bonustask;

import java.util.function.Predicate;

@FunctionalInterface
public interface MyPredicate<T> extends Predicate<T> {
    default MyPredicate<T> negate() {
        return t -> !test(t);
    }
}
