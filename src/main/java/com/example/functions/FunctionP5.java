package com.example.functions;

import java.util.function.*;

public class FunctionP5 {
    public static void main(String[] args) {

//        biConsumer();
//        biPredicate();

//        booleanSupplier();
//
//        doubleConsumer();
//        doublePredicate();
//        doubleSupplier();

//        intConsumer();
//        intPredicate();
//        intSupplier();
//
//        longConsumer();
//        longPredicate();
//        longSupplier();
//
        objDoubleConsumer();
        objIntConsumer();
        objLongConsumer();
    }

    private static void biConsumer() {
        BiConsumer<String, Integer> biConsumer = (string, integer) -> System.out.println(integer + ": " + string);

        biConsumer.accept("Jan", 4);
    }

    private static void biPredicate() {
        BiPredicate<String, Integer> biPredicate = (string, integer) -> string.length() > integer;

        boolean result = biPredicate.test("Mariusz", 8);

        System.out.println(result);
    }

    private static void booleanSupplier() {
        BooleanSupplier booleanSupplier = () -> true;

        System.out.println(booleanSupplier.getAsBoolean());
    }

    private static void doubleConsumer() {
        DoubleConsumer doubleConsumer = dbl -> System.out.println("Double: " + dbl);

        doubleConsumer.accept(234d);
    }

    private static void doublePredicate() {
        DoublePredicate doublePredicate = dbl -> dbl > 0.1d;

        System.out.println(doublePredicate.test(0.0d));
        System.out.println(doublePredicate.test(0.2d));
    }

    private static void doubleSupplier() {
        DoubleSupplier doubleSupplier = () -> 10.0d;
        System.out.println(doubleSupplier.getAsDouble());
    }

    private static void intConsumer() {
        IntConsumer intConsumer = integer -> System.out.println("Integer: " + integer);

        intConsumer.accept(234);
    }

    private static void intPredicate() {
        IntPredicate intPredicate = integer -> integer < 0;

        System.out.println(intPredicate.test(1));
        System.out.println(intPredicate.test(-1));
    }

    private static void intSupplier() {
        IntSupplier intSupplier = () -> 42;
        System.out.println(intSupplier.getAsInt());
    }

    private static void longConsumer() {
        LongConsumer longConsumer = l -> System.out.println("Long value: " + l);
    }

    private static void longPredicate() {
        LongPredicate longPredicate = l -> l > 2L;
        System.out.println(longPredicate.test(3L));
        System.out.println(longPredicate.test(-1L));
    }

    private static void longSupplier() {
        LongSupplier longSupplier = () -> 5L;
        System.out.println(longSupplier.getAsLong());
    }

    private static void objDoubleConsumer() {
        ObjDoubleConsumer<String> objDoubleConsumer = (string, dbl) -> System.out.println(string + " " + dbl);

        objDoubleConsumer.accept("Double value is -> ", 3.90d);
    }

    private static void objIntConsumer() {
        ObjIntConsumer<String> objIntConsumer = (string, i) -> System.out.println(string + " " + i);

        objIntConsumer.accept("Integer value is -> ", 123);
    }

    private static void objLongConsumer() {
        ObjLongConsumer<String> objLongConsumer = (string, l) -> System.out.println(string + " " + l);

        objLongConsumer.accept("Long value is -> ", 3234L);

    }
}
