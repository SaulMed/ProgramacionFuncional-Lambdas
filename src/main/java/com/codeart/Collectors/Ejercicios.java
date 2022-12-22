package com.codeart.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import util.Console;
import util.Database;
import util.Review;
import util.Videogame;

public class Ejercicios {
    
    public static void main(String[] args) {
        Stream<Videogame> videojuegos = Database.videogames.stream();

        // listaReview(videojuegos).forEach(System.out::println);
        // listaWebSite(videojuegos).forEach((k,v) -> System.out.println(k + " - " + v));
        consoleAvg(videojuegos).forEach((k,v) -> System.out.println(k + " - " + v ));
    }
    
//Regresar una lista inmutable con todos los reviews del Stream
static List<Review> listaReview(Stream<Videogame> flujo){
    return flujo
        .flatMap(g -> g.getReseñas().stream())  //Aplanar todas las reseñas 
        .collect(Collectors.toUnmodifiableList());  //Generar lista inmutable
}

//Regresar un mapa true con todos los videojuegos que tengan url con una longitud < 15 , si no regresar false
static Map<Boolean, List<Videogame>> listaWebSite(Stream<Videogame> flujo){
    return flujo
        .collect(Collectors.partitioningBy(
            g -> g.getSitioOficial().length() < 15
        ));
}

//Regresar un mapa trabajando con el promedio de las ventas de las consolas 
// Su Key sera la consola y su Value el promedio

static Map<Console,Double> consoleAvg(Stream<Videogame> flujo){
    return flujo
        .collect(Collectors.groupingBy(
            Videogame::getConsola,  //Asignar K
            Collectors.averagingDouble(Videogame::getVentasTotales) //Asignar Valor 
        ));
}

}

