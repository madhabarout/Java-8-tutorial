package com.java8;

public class ConsumerTest {

    public static void main(String[] args) {

        //Initialization and impl class declaration
        Consumer<String> consumer1 = str -> System.out.println("Hello World ::" +str);

        Consumer<String> consumer2 = str -> System.out.println("Bye ::" +str);

        Consumer<String> consumer3 = consumer1.andThen(consumer2);

        consumer3.accept("Madhaba");

    }
}
