package com.codeart.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import util.Database;
import util.Videogame;

public class CollectionsPartitions {

    public static void main(String[] args) {
        Stream<Videogame> videojuegos = Database.videogames.stream();

        Map<Boolean, List<Videogame>> result = videojuegos
        //Genera un Map Booleano generando 2 listas de Videogame que cumplen o NO cumplen con la condicion
            .collect(Collectors.partitioningBy(
                v -> v.getPrecio() > 15 
            ));

        result.forEach((k,v) -> System.out.println(k + " - " + v));

    }

    
}
