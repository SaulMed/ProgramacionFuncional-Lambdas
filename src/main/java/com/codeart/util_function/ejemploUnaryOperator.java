package com.codeart.util_function;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

//Extiende de Function
//Simplifica la interfaz Function = Function<String,String> to UnaryOperator<String>
//Si los TIPOS de argumentos de entrada son los mismos tipos de salida , trabajar con UnaryOperator
public class ejemploUnaryOperator {
    //static Function<String, String> functionToUpper = s -> s.toUpperCase;
    static Function<String, String> functionToUpper = String::toUpperCase;

    static UnaryOperator<String> unaryToUpper = String::toUpperCase;

    static UnaryOperator<Integer> num1 = n -> n * n;
    static IntUnaryOperator num2 = n -> n * n;

    public static void main(String[] args) {
        String txt = "Hola soy prueba";

        System.out.println("Function: "+ functionToUpper.apply(txt));
        System.out.println("Unary Operator<String>: "+unaryToUpper.apply(txt));

        System.out.println("UnaryOperator<Integer>: "+num1.apply(5));
        System.out.println("IntUnaryOperator: " + num2.applyAsInt(3));
    }

}
