package com.java8;

public class ComparatorTest {

    public static void main(String[] args) {

        Person Bish = new Person("Bish", 30);
        Person NewBish = new Person("Bish", 37);

        Comparator<Person> cmp = Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge);

        System.out.println(cmp.compare(Bish, NewBish) > 0);

    }

}
