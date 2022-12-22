package com.codeart.ReferenciaAMetodos;

import java.util.function.BiPredicate;

public class MedodoReferencia_Arbitrario {
    
    public static void main(String[] args) {
        //Trabado con lambdas
        //BiPredicate<String,String> igual = (s1, s2) -> s1.equals(s2);

        //Metodo referenciado - Arbitrario
        BiPredicate<String,String> igual = String::equals;
        
        Boolean esIgual = igual.test("A","A");
        
        System.out.println(esIgual);
    }

}
