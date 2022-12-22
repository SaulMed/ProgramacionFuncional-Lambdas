package com.codeart.util_function;

import java.util.function.Function;

//Function<T,R> = Espera un argumento y muestra un resultado
// Su metodo .andThen = Ejecuta un metodo en seguida de otro
// Su metodo .compose = Se encarga de unir ambos metodos

public class ejemploFunction {
    
    static Function<Integer, Integer> suma = n -> n + 10;
    static Function<Integer, Integer> multiplicacion = n -> n * 10;

    static Function<Integer, Integer> andThenSuma = suma.andThen(multiplicacion);

    //Compose = Ejecuta primero el ULTIMO metodo y despues el PRIMER metodo, 
    // ejemplo de funcionamiento compose =  ultimo.compose(primero)
    // primero se multiplica 5 * 10 = 50
    // al final se suman esos 50 + 10 = 60
    static Function<Integer, Integer> composeSuma = suma.compose(multiplicacion);


    public static void main(String[] args) {
        System.out.println("Suma con Function: "+suma.apply(5));
        System.out.println("Multiplicación con Function: "+multiplicacion.apply(5));
        System.out.println("****************");
        System.out.println("Metodo .andThenSuma: "+andThenSuma.apply(5));
        System.out.println("Metodo .composeSuma: "+composeSuma.apply(5));
    }


}
