package com.codeart.Collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import util.Database;
import util.Videogame;

public class CollectorsReduceFunction {
    

    public static void main(String[] args) {
        Stream<Videogame> videojuegos = Database.videogames.stream();
        // promedio(videojuegos);
        // resumenEstadistico(videojuegos);
        unir(videojuegos);
    }

    //Obtener el promedio del precio de toda la coleccion
    static void promedio(Stream<Videogame> flujo){
        Double promedio = flujo
            .collect(Collectors.averagingDouble(Videogame::getPrecio));
        System.out.println("$"+promedio);
    }

    //Obtener un resumen estadistico de algun valor en concreto
    static void resumenEstadistico(Stream<Videogame> flujo){
        IntSummaryStatistics resumenEstadistico = flujo
            .collect(Collectors.summarizingInt(v -> v.getReseñas().size()));

            System.out.println("Contador: " + resumenEstadistico.getCount());
            System.out.println("Sumatoria: " + resumenEstadistico.getSum());
            System.out.println("Max. no. de reseña por titulo: " + resumenEstadistico.getMax());
            System.out.println("Min. no. de reseña por titulo: " + resumenEstadistico.getMin());
            System.out.println("Promedio de reseñas por titutlo: " + resumenEstadistico.getAverage());
    }

    //Concatenar Strings
    static void unir(Stream<Videogame> flujo){
        String contenido = flujo
            .map(Videogame::toString) //Primero transformar a String el Stream
            .collect(Collectors.joining("\n")); //Va a concatenar un salto de linea por cada registro - Videogame

        System.out.println(contenido);
    }

}
