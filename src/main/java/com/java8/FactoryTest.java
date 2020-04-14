package com.java8;
import java.util.List;

public class FactoryTest {

    public static void main(String[] args) {

        Factory<Circle> circleFactory = Circle::new;

        System.out.println(circleFactory.newInstance());

        List<Circle> circleList = circleFactory.get5Circle();

        System.out.println(circleList);

    }
}
