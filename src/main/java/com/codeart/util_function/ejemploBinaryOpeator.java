package com.codeart.util_function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

//BinaryOperator = Extiende de BiFunction
public class ejemploBinaryOpeator {
    
    public static void main(String[] args) {
        BiFunction<String,String,String> normalizadorFunc  = (a,b) -> a.toUpperCase() + " - " +b.toLowerCase();
        System.out.println(normalizadorFunc.apply("Hola","Mundo"));

        BinaryOperator<String> normalizador = (a,b) -> a.toUpperCase() +  " - " + b.toLowerCase();
        System.out.println(normalizador.apply("Hola","Mundo"));
    }

}
