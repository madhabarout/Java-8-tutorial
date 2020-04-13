package com.java8;

public class ComparatorTest {

    public static void main(String[] args) {

        Person Ash = new Person("Ash", 34);
        Person Bish = new Person("Bish", 30);
        Person NewBish = new Person("Bish", 37);

        Function<Person , String> getName = p1 -> p1.getName();
        Function<Person , Integer> getAge = p1 -> p1.getAge();

        Comparator<Person> cmpName = Comparator.comparing(getName);
        Comparator<Person> cmpAge = Comparator.comparing(getAge);

        Comparator<Person> cmp = cmpName.thenComparing(cmpAge);

        System.out.println(cmp.compare(Bish, NewBish) > 0);

    }

}
