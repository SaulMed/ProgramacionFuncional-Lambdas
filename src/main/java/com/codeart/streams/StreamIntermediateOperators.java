package com.codeart.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import util.BasicVideogame;
import util.Database;
import util.Review;
import util.Videogame;

public class StreamIntermediateOperators {
    
    public static void main(String[] args) {
        //Base de datos estatica
        Stream<Videogame> videojuegos = Database.videogames.stream();

        // distinctOperator(videojuegos);
        // limitOperator(videojuegos);
        // skipOperator(videojuegos);
        // filterOperator(videojuegos);
        // mapOperator(videojuegos);
        // flatMapOperator(videojuegos);
        // flatVsMapOperator(videojuegos);
        // peekOperator(videojuegos);
        // sortOperator(videojuegos);
        // takeWhileOperator(videojuegos);
        dropWhileOperator(videojuegos);

    }

    // .distinct = Evita elementos repetidos
    static void distinctOperator(Stream<Videogame> flujo){  
        System.out.println(flujo.distinct().count());
    }

    //  .limit = Establece un limite en la entrega de resultados
    static void limitOperator(Stream<Videogame> flujo){
        List<Videogame> games = flujo
        .limit(3)
        .collect(Collectors.toList());
        games.forEach(System.out::println);
    }

    //  .skip = Omite cierta cantidad de registros de la collection
    static void skipOperator(Stream<Videogame> flujo){
        List<Videogame> games = flujo
        .skip(17)
        .collect(Collectors.toList());
        games.forEach(System.out::println);
    }

//Filter

    static void filterOperator(Stream<Videogame> flujo){
        //Mostrar aquellos titulos que tengan un precio mayor a 5 , que no esten en descuento que en su siito lleven la palabra "forza"
        List<Videogame> games = flujo
        .filter( g ->  g.getPrecio() > 10.0)
        .filter( g -> !g.getEnDescuento())
        .filter( g -> g.getSitioOficial().contains("forza"))
        .collect(Collectors.toList());

        games.forEach(System.out::println);
    }

//Map = Usado para la transformacion de datos, regresar resultados nuevos a traves de ciertas operaciones
    //Transformar una lista de Videogame a BasicVideogame
    static void mapOperator(Stream<Videogame> flujo){
        List<BasicVideogame> games = flujo
            .map(g -> {
                return BasicVideogame.builder()
                    .name(g.getNombre())
                    .price(g.getPrecio())
                    .console(g.getConsola())
                    .build();
            }).collect(Collectors.toList());

        games.forEach(System.out::println); //Mostrar los BasicVideogame

        System.out.println("***********************************");

        List<String> titulos = games.stream()
            .map(BasicVideogame::getName)
            .collect(Collectors.toList());
        
        titulos.forEach(System.out::println);   //Mostrar unicamente los titulos
    }
//.map = Permite el manejo de Listas anidadas
//.flatMap = "Aplana" listas anidadas en una sola

    static void flatMapOperator(Stream<Videogame> flujo){
        //Map = Listas anidadas
    //var resultado = flujo.map(v -> v.getReseñas()).collect(Collectors.toList());
        //flatMap = Lista aplanada
    List<Review> resultado = flujo
    .flatMap( g -> g.getReseñas().stream())
    .collect(Collectors.toList());
        System.out.println(resultado);  
    }

    static void flatVsMapOperator(Stream<Videogame> flujo){
        //Cantidad de titulos que cuentan con reseñas trabajando con .map
        // var totalReviews = flujo.map(r -> r.getReseñas().size()).collect(Collectors.toList());
        // System.out.println(totalReviews.size());
        
        //Cantidad Total de reseñas trabajando con .mapToLong
        // var totalReviews = flujo.mapToLong(r -> r.getReseñas().size()).sum();
        // System.out.println(totalReviews);
        
        //Cantidad Total de reseñas trabajando con .flatMap
        Long totalReviews = flujo
        .flatMap(r -> r.getReseñas().stream())
        .count();
        System.out.println(totalReviews);
    }

//peek = Es un operador intermedio que NO SE EJECUTA hasta que le sigua un operador final
    static void peekOperator(Stream<Videogame> flujo){
        //Agregar el sufijo " - Game" a cada titulo
        flujo
        .peek(v -> v.setNombre(v.getNombre().concat(" - Game")))
        .forEach(System.out::println);
    }

    //Ordenamiento de coleccion en base a la cantidad de reseñas ascendentemente
    static void sortOperator(Stream<Videogame> flujo){
            //Ordenar de acuerdo a la cantidad de reseñas del titulo
        // List<Videogame> countReview = flujo
        // .sorted(Comparator.comparingInt(v -> v.getReseñas().size()))
        // .collect(Collectors.toList());

        // countReview.forEach(System.out::println);

            //Ordenamiento en base a el nombre del titulo
        List<Videogame> titleOrder = flujo
            .sorted(Comparator.comparing(Videogame::getNombre))
            .collect(Collectors.toList());

        titleOrder.forEach(System.out::println);
    }

    //Ordenamiento de Coleccion HASTA QUE los elementos que NO EMPIECEN con la letra M
    static void takeWhileOperator(Stream<Videogame> flujo){
            List<Videogame> takeWhile = flujo
                .sorted(Comparator.comparing(Videogame::getNombre))
    //Los elementos se agregar a la lista, hasta que se cumpla la siguiente condicion , en ese momento se termina el ciclo
                .takeWhile( v -> !v.getNombre().startsWith("M"))
                .collect(Collectors.toList());

            takeWhile.forEach(System.out::println);
    }

    //Ordenamiento de coleccion ELIMINANDO elementos HASTA QUE EMPIECEN con la letra M
    static void dropWhileOperator(Stream<Videogame> flujo){
        List<Videogame> dropWhile = flujo
            .sorted(Comparator.comparing(Videogame::getNombre))
    //Los elementos se van eliminando de la lista, hasta que se cumpla la siguiente condicion, en ese momento se termina el ciclo
            .dropWhile( v -> !v.getNombre().startsWith("M"))
            .collect(Collectors.toList());

        dropWhile.forEach(System.out::println);
    }




}
