package com.example.functions;

import java.util.function.*;

public class FunctionP3 {
    public static void main(String[] args) {

//        longFunction();
//        longToDoubleFunction();
//        longToIntFunction();
//        longUnaryOperator();
        unaryOperator();
    }

    private static void longFunction() {
        LongFunction<String> longFunction = l -> "Long value is: " + l;

        String result = longFunction.apply(101L);
        System.out.println(result);
    }

    private static void longToDoubleFunction() {
        LongToDoubleFunction longToDoubleFunction = l -> (double) l;

        double result = longToDoubleFunction.applyAsDouble(10L);
        System.out.println(result);
    }

    private static void longToIntFunction() {
        LongToIntFunction longToIntFunction = l -> (int) l;

        int result = longToIntFunction.applyAsInt(100L);

        System.out.println(result);
    }

    private static void longUnaryOperator() {
        LongUnaryOperator longUnaryOperator = l -> l * 3;

        long result = longUnaryOperator.applyAsLong(101L);
        System.out.println(result);
    }

    private static void unaryOperator() {
        Function<String, String> function = input -> input.toUpperCase();
        UnaryOperator<String> unaryOperator = input -> input.toUpperCase();

        String result = function.apply("test value");
        System.out.println(result);
    }
}
