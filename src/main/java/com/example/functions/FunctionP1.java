package com.example.functions;

import java.util.Comparator;
import java.util.function.*;

public class FunctionP1 {

    public static void main(String[] args) {
//        biFunction();
//        binaryOperator();
//        doubleFunction();
//        doubleToIntFunction();
//        doubleToLongFunction();
//        doubleUnarryOperator();
    }


    private static void doubleUnarryOperator() {
        System.out.println("DoubleUnaryOperator ->");
        DoubleUnaryOperator doubleUnaryOperator = dbl -> dbl * 2.2d;

        double v = doubleUnaryOperator.applyAsDouble(10.5d);
        System.out.println(v);
    }

    private static void doubleToLongFunction() {
        System.out.println("DoubleToLongFunction ->");
        DoubleToLongFunction doubleToLongFunction = dbl -> (long) dbl;

        long l = doubleToLongFunction.applyAsLong(234.32d);
        System.out.println(l);
    }

    private static void doubleToIntFunction() {
        System.out.println("DoubleToIntFunction ->");
        DoubleToIntFunction doubleToIntFunction = dbl -> (int) dbl;

        int i = doubleToIntFunction.applyAsInt(23.3d);
        System.out.println(i);

    }

    private static void doubleFunction() {
        System.out.println("DoubleFunction ->");
        DoubleFunction<String> doubleFunction = dbl -> "Double value is -> " + dbl;

        String result = doubleFunction.apply(23.3d);
        System.out.println(result);
    }

    private static void biFunction() {
        BiFunction<String, String, Person> biFunction = (name, surname) -> new Person(name, surname);
        BiFunction<String, Integer, Person> biFunction2 = (name, age) -> new Person(name, age);

        Person person = biFunction.apply("Jan", "Kowalski");
        Person person2 = biFunction2.apply("Jan", 25);

        System.out.println(person);
        System.out.println(person2);
    }

    private static void binaryOperator() {
        BinaryOperator<String> maxBinaryOperator = BinaryOperator.maxBy(Comparator.comparingInt(String::length));
        BinaryOperator<String> minBinaryOperator = BinaryOperator.minBy(Comparator.comparingInt(String::length));

        String name = maxBinaryOperator.apply("jan", "kowalski");
        String surname = minBinaryOperator.apply("Paweł", "Kot");

        System.out.println("max -> " + name);
        System.out.println("min-> " + surname);
    }


    static class Person {
        private final String name;
        private Integer age;
        private String surname;

        public Person(String name) {
            this(name, "Unknown");
        }

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Person(String name, Integer age) {
            this(name, "Unknown");
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    "surname='" + surname + '\'' +
                    "age='" + age + '\'' +
                    '}';
        }
    }
}
