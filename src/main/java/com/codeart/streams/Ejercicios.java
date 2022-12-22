package com.codeart.streams;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import util.Console;
import util.Database;
import util.Review;
import util.Videogame;

public class Ejercicios {
    public static void main(String[] args) {
        //Base de datos estatica
        Stream<Videogame> videogames = Database.videogames.stream();
        // System.out.println(exercise1(videogames));
        // exercise2(videogames).forEach(System.out::println);
        // System.out.println(exercise3(videogames));
        // exercise4(videogames).forEach(System.out::println);
        exercise5(videogames).forEach(System.out::println);
    }

    /*
    *Regresar true si el stream contiene al menos un videojuego con número de ventas mayor a 10
    * y no este en descuento o su precio sea mayor a 9.99 de lo contrario regresar false.
     */
    static Boolean exercise1(Stream<Videogame> flujo) {
      return flujo.anyMatch(g -> g.getVentasTotales() > 10 && (!g.getEnDescuento() || g.getPrecio() > 9.99));
    }

    /*
     *Regresar un Stream unicamente con los titulos de todas las consolas que sean de XBOX
     * durante el proceso imprimir los resultados ignorando los repetidos.
     */
    static Stream<String> exercise2(Stream<Videogame> flujo) {
            return flujo
                .distinct() //Evitar duplicados del stream
                .filter(g -> g.getConsola().equals(Console.XBOX))   //Obtener unicamente los titulos de la consola XBOX
                .map(Videogame::getNombre); //
    }

    /*
     *Regresar el videojuego con el mayor número de ventas
     * unicamente contemplando los primers 10 elementos del stream.
     */
    static Videogame exercise3(Stream<Videogame> flujo) {
        return flujo
            .limit(10)  //Limitar a los primeros 10 registros
            .max(Comparator.comparing(Videogame::getVentasTotales))     //Comparacion del campo ventas totales
            .orElseThrow(NoSuchElementException::new);  //En caso de ser null regresar una exception
    }

    /*
     *Regresar un stream con todos los comentarios del cada review de todos los videojuegos del stream.
     */
    static Stream<String> exercise4(Stream<Videogame> flujo) {
        return flujo
            .flatMap(g -> g.getReseñas().stream().map(Review::getReview));
    }

    /*
     *Regresar un stream con los todos los videojuegos con precio menores a 20.0
     * sin utilizar el operador filter().
     */
    static Stream<Double> exercise5(Stream<Videogame> flujo) {
        return flujo
            .sorted(Comparator.comparing(Videogame::getPrecio))
            .takeWhile(g -> g.getPrecio() < 20.0)
            .map(Videogame::getPrecio);
    }
}
