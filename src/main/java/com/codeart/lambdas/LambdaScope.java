package com.codeart.lambdas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class LambdaScope {
    
    public static void main(String[] args) {
        
        //NO SE PUEDE ALTERAR VARIABLES FUERA DEL LAMBDA

        //Este int , se encuentra fuera del Scope de la lambda
        int num = 5;
        AtomicInteger numero = new AtomicInteger();

        //IntStream.range(1, 11).forEach(e -> num = num + e);
        IntStream.range(0, 11).forEach( e -> numero.set(numero.get() + e));

        System.out.println(numero.get());
    }

}
