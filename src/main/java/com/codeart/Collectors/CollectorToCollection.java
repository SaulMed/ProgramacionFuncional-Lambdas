package com.codeart.Collectors;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import util.Database;
import util.Videogame;

public class CollectorToCollection {
    
    public static void main(String[] args) {
        Stream<Videogame> videojuegos = Database.videogames.stream();
            //Mostrar el tipo de collection
        // System.out.println(streamToCollection(videojuegos, "LIST").getClass().getName());
            //Mostrar resultados de la coleccion
        // streamToCollection(videojuegos, "LIST").forEach(System.out::println);
            //Mostrar el titulo y precio de cada titulo
        streamToMap(videojuegos).forEach((k,v) -> System.out.println(k + " - "+ v));

    }

    static Collection<Videogame> streamToCollection(Stream<Videogame> flujo, String type){
        //Transformar stream a List o Set dependiendo el "type"
        return (type.equals("LIST")) ? flujo.collect(Collectors.toList()) : flujo.collect(Collectors.toSet());
    }

    //Con Map siempre se trabaja con <K, V> y se requieren valores NO REPETIDOS
    static Map<String, Double> streamToMap(Stream<Videogame> flujo){
        //Con Map no se permiten elementos duplicados
        return flujo.distinct().collect(Collectors.toMap(Videogame::getNombre, Videogame::getPrecio));
    }


}
