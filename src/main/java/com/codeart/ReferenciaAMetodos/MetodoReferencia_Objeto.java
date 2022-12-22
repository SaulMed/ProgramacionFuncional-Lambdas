package com.codeart.ReferenciaAMetodos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

// La referencia a metodos es utilizada cuando la expresion lambda  tiene como unica instruccion 
// llamar a un metodo cuyos parametros son la entrada de la expression SIN MODIFICACIONES

public class MetodoReferencia_Objeto{

    public static void main(String[] args) {
        //Declarar la Lista
        List<Integer> listaNumeros = new ArrayList<>();

        //Establecer los limites del ciclo
        IntStream ciclo = IntStream.range(1, 11);
        //Comenzar el llenado de la lista en base a los limites del ciclo con lambda

        //ciclo.forEach(n -> listaNumeros.add(n));

        //Comenzar el llenado de la lista en base a los limites del ciclo con Referencia a Metodos
        ciclo.forEach(listaNumeros::add);
        
        //Mostrar Lista
        System.out.println(listaNumeros);

    }

}