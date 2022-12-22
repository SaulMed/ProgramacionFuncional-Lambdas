package com.codeart.util_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

//Ampliamente utilizada como contador/acumulador, en este caso combina 2 listas

public class ejemploBiFunction {

    public static void main(String[] args) {
        List<String> letras = Arrays.asList("A","B","C");
        List<Integer> numeros = Arrays.asList(1,2,3);

        //Realizar concatenacion de ambas listas, apoyandonos en la funcion lambda
        List<String> resultado = listaCombinadora(letras, numeros, (l1,l2)-> l1 + l2);

        System.out.println(resultado);

    }
    
    //Cargar un metodo estatico a la clase que permita cargar 2 listas y una interfaz BiFunction
    //BiFunction<T,U,R> = Trabaja un un tipo de Objeto , otra Unidad y arroja un Resultado
    private static <T,U,R> List<R> listaCombinadora(
        List<T> list1,
        List<U> list2,
        BiFunction<T,U,R> combinador
    ){
        List<R> resultado = new ArrayList<>();

        //Ambas listas deben de tener el mismo tamaño para trabajar correctamente
        for(int i = 0 ; i < list1.size() ;i++){
            //Agregar al cominador ambos elementos del recorrido actual, para ser trabajados en la funcion lambda  
            //Por cada recorrido se usa su metodo apply de la BiFunction          
            resultado.add(combinador.apply(list1.get(i),list2.get(i)));
        }
        return resultado;
    }

}
