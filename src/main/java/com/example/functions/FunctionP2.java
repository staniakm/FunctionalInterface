package com.example.functions;

import java.util.function.*;

public class FunctionP2 {
    public static void main(String[] args) {

//        intBinaryOperator();
//        intFunction();
//        intToDoubleFunction();
//        intToLongFunction();
//        intUnaryOperator();
//        longBinaryOperator();
    }

    private static void intBinaryOperator() {
        IntBinaryOperator intBinaryOperator = (x, y) -> x + y;

        int sum = intBinaryOperator.applyAsInt(10, 20);
        System.out.println("Sum: " + sum);
    }

    private static void intFunction() {
        IntFunction<String> intFunction = i -> "Int value is -> " + i;

        System.out.println(intFunction.apply(100));

    }

    private static void intToDoubleFunction() {
        IntToDoubleFunction intToDoubleFunction = i -> i * 1.1d;

        double result = intToDoubleFunction.applyAsDouble(100);

        System.out.println(result);
    }

    private static void intToLongFunction() {
        IntToLongFunction intToLongFunction = i -> i * 101L;
        long result = intToLongFunction.applyAsLong(100);
        System.out.println(result);
    }

    private static void intUnaryOperator() {
        IntUnaryOperator intUnaryOperator = i -> i * 2;

        int result = intUnaryOperator.applyAsInt(10);
        System.out.println(result);
    }

    private static void longBinaryOperator() {
        LongBinaryOperator longBinaryOperator = (x, y) -> x * y * 100L;

        long result = longBinaryOperator.applyAsLong(10L, 3L);
        System.out.println(result);
    }
}
