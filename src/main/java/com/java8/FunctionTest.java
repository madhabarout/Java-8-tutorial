package com.java8;

public class FunctionTest {

    public static void main(String[] args) {

        Mateo mateo = new Mateo(20);

        Function<Mateo, Integer> readCelsius = m -> m.getTemperature();
        Function<Integer, Double> celsiusToFahrenheit = t -> t*9d/5d +32d;

        //Function<Mateo , Double> readFahrenheit = readCelsius.andThen(celsiusToFahrenheit);

        Function<Mateo , Double> readFahrenheit = celsiusToFahrenheit.composing(readCelsius);




    }
}
