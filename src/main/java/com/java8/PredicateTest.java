package com.java8;

public class PredicateTest {

    public static void main(String[] args) {

        Predicate<String> emptyCheck = s -> ( !s.isEmpty() );

        Predicate<String> nullCheck = s -> ( s != null );

        Predicate<String> emptyAndNullCheck = emptyCheck.and(nullCheck);

        System.out.println(emptyAndNullCheck.test("Hello"));


    }
}
