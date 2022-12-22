package com.codeart.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import util.Console;
import util.Database;
import util.Videogame;

public class CollectionsGroupBy {
 
    public static void main(String[] args) {
        Stream<Videogame> videojuegos = Database.videogames.stream();

        //Realizar una busqueda atraves de los titulos que pertenecen a cierta consola
        Map<Console, List<Videogame>> resultado = videojuegos
                    .collect(Collectors.groupingBy(Videogame::getConsola));

        resultado.forEach( (k,v) -> System.out.println(k + " - " + v));
    }

}
