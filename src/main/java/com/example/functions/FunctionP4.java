package com.example.functions;

import java.util.function.*;

public class FunctionP4 {
    public static void main(String[] args) {

//        toDoubleBiFunction();
//        toDoubleFunction();
//        toIntBiFunction();
//        toIntFunction();
//        toLongBiFunction();
//        toLongFunction();
    }

    private static void toDoubleBiFunction() {
        ToDoubleBiFunction<String, Integer> toDoubleBiFunction = (string, intVal) -> (double) (string.length() * intVal);
        double result = toDoubleBiFunction.applyAsDouble("Jan", 5);
        System.out.println(result);
    }

    private static void toDoubleFunction() {
        ToDoubleFunction<String> toDoubleFunction = input -> (double) input.length();

        double result = toDoubleFunction.applyAsDouble("Test value");

        System.out.println(result);
    }

    private static void toIntBiFunction() {
        ToIntBiFunction<String, Integer> toIntBiFunction = (string, integer) -> string.length() * integer;

        int result = toIntBiFunction.applyAsInt("Test", 6);
        System.out.println(result);
    }

    private static void toIntFunction() {
        ToIntFunction<String> toIntFunction = string -> string.length() * 2;

        int result = toIntFunction.applyAsInt("Test");
        System.out.println(result);
    }

    private static void toLongBiFunction() {
        ToLongBiFunction<String, Integer> toLongBiFunction = (string, integer) -> (long) (string.length() * integer);

        long result = toLongBiFunction.applyAsLong("test value", 5);
        System.out.println(result);
    }

    private static void toLongFunction() {
        ToLongFunction<String> toLongFunction = string -> (long) (string.length());

        long result = toLongFunction.applyAsLong("test value");
        System.out.println(result);
    }
}
