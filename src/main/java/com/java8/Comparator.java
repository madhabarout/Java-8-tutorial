package com.java8;

import java.util.Objects;

@FunctionalInterface
public interface Comparator<T> {

    static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (p1, p2) -> {

            U s1 = keyExtractor.apply(p1);
            U s2 = keyExtractor.apply(p2);

            return s1.compareTo(s2);

        };
    }

    int compare(T t1, T t2);

    default Comparator<T> reversed() {

        return (t1, t2) -> this.compare(t2, t1);

    }

    ;

    default Comparator<T> thenComparing(Comparator<T> other) {

        return (t1, t2) -> {

            int compare = this.compare(t1, t2);

            if (compare == 0) {

                return other.compare(t1, t2);
            } else {

                return compare;
            }

        };
    }

    default< U extends Comparable<? super U>> Comparator<T> thenComparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        Comparator<T> other = comparing(keyExtractor);
        return this.thenComparing(other);
    };

}
