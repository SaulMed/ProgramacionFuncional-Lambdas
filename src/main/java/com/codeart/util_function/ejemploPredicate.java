package com.codeart.util_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Predicate = Representa un Boleano
public class ejemploPredicate {
    
    public static void main(String[] args) {
        //List<Integer> numeros = Arrays.asList(2,40,6,8,10,25);
        List<Integer> numeros = new ArrayList<>( Arrays.asList(12,7,60,5,41,13,29,30));
            //Todas los datos de tipo collection , cuentan con el metodo removeIf , que espera un predicate
        numeros.removeIf(entre20y50);
        // numeros.removeIf(entre20y50Negate);

        System.out.println(numeros);
    }


    static Predicate<Integer> mayorA50 = n -> n > 50;
    static Predicate<Integer> menorA20 = n -> n < 20;
    static Predicate<Integer> entre20y50 = mayorA50.or(menorA20);
    static Predicate<Integer> entre20y50Negate = mayorA50.or(menorA20).negate();

}
