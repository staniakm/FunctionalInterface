package com.example.functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FunctionP0 {
    private static final Stream<String> names = Stream.of("Joihn", "Jan", "Paul");

    public static void main(String[] args) {
//        function();
//        predicate();
//        consumer();
//        supplier();

        Supplier<Stream<String>> supplierList = () -> Stream.of("John", "Jan", "Paul");
        Predicate<String> predicate = name -> name.length() > 3;
        Function<String, Person> function = nazwa -> new Person(nazwa);
        Consumer<Person> personConsumer = person -> System.out.println("Hello " + person.name.toUpperCase());

        supplierList.get()
                .filter(predicate)
                .map(function)
                .forEach(personConsumer);

    }


    private static void function() {
        Function<String, Person> function = nazwa -> new Person(nazwa);

        Person person = function.apply("Mariusz");

        System.out.println(person);
    }

    private static void predicate() {
        Predicate<String> predicate = name -> name.length() > 3;
        boolean bool = predicate.test("Kot");
        System.out.println(bool);
    }

    private static void consumer() {
        Consumer<String> consumer = name -> System.out.println("Hello " + name);
        Consumer<Person> personConsumer = person -> System.out.println("Hello " + person.name.toUpperCase());

        consumer.accept("Mariusz");

        Person p = new Person("Mario");
        personConsumer.accept(p);

    }

    private static void supplier() {
        Supplier<Stream<String>> supplierList = () -> Stream.of("John", "Jan", "Paul");

        supplierList.get()
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
