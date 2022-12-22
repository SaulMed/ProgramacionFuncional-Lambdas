package com.codeart.util_function;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


//Consumer = Recibe y trabaja con cierta data(argumentos) pero NO REGRESA NINGUN RESULTADO
public class ejemploConsumer {
    
    public static void main(String[] args) {
        
        Set<Integer> numeros = Set.of(1,2,3,4,5);
        List<Integer> cuadrados = new LinkedList<>();

        //Consumer = 1 unico argumento
        numeros.forEach(n -> cuadrados.add(n*n));

        System.out.println(numeros);
        System.out.println(cuadrados);

        //BiConsumer = 2 entradas 
        Map<Boolean, String> map  = Map.of(true, "This is the truth", false, "This is the lie");

        map.forEach((k,v) -> System.out.println(k + ": " + v));

    }

}
