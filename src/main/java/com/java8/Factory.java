package com.java8;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface Factory<T> extends Supplier<T> {

    default T newInstance(){
        return get();
    }

    default List<T> get5Circle(){
         return IntStream.range(0,5)
                 .mapToObj(x -> newInstance())
                 .collect(Collectors.toList());
    }
}
