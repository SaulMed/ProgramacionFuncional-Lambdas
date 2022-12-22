package com.codeart.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import util.Database;
import util.Videogame;

public class StreamFinalOperators {
    
    public static void main(String[] args) {
        //Base de datos estatica
        Stream<Videogame> videojuegos = Database.videogames.stream();

        // countOperator(videojuegos);
        // allMatchOperator(videojuegos);
        // anyMatchOperator(videojuegos);
        // noneMatchOperator(videojuegos);
        // findFirstOperator(videojuegos);
        // findAnyOperator(videojuegos);
        // reduceOperator(videojuegos);
        // minOperator(videojuegos);
        maxOperator(videojuegos);
    }

//Mostrar registros totales de la collection
    static void countOperator(Stream<Videogame> flujo){
        System.out.println(flujo.count() + " registros en total.");
    }

//Realizar emparejamientos    
    static void allMatchOperator(Stream<Videogame> flujo){  //True si TODOS cumplen la condicion
        System.out.println(flujo.allMatch(v -> v.getVentasTotales() > 100));
    }

    static void anyMatchOperator(Stream<Videogame> flujo){  //True si almenos 1 cumple la condicion
        System.out.println(flujo.anyMatch(v -> v.getVentasTotales() > 100));
    }

    static void noneMatchOperator(Stream<Videogame> flujo){ //False si almenos 1 NO cumple la condicion
        System.out.println(flujo.noneMatch(v -> v.getReseñas().isEmpty() ));
    }

//Busqueda dentro de Stream
    static void findFirstOperator(Stream<Videogame> flujo){
        //Si la lista es vacia , nos retorna un Optional.empty
        Optional<Videogame> juego = flujo.findFirst();
        System.out.println(juego);
    }

    static void findAnyOperator(Stream<Videogame> flujo){   //Realiza la busqueda de cualquier registro, normalmente regresa el 1ro
        Optional<Videogame> juego = flujo.findAny();
        System.out.println(juego);
    }

//Reduce = Muy utilizado para ACUMULAR datos y entregar un resultado en concreto

    static void reduceOperator(Stream<Videogame> flujo){
        Optional<Integer> resultado = flujo //Pipeline para obtener el total de ventas en los juegos que tienen descuento
            //Lambdas
        // .filter(v -> v.getEnDescuento())
        // .map(v -> v.getVentasTotales())
        // .reduce((v1,v2) -> v1 +v2);
        // System.out.println("Lambdas - Ventas Totales de Juegos con Descuento: "+resultado);

            //Referencia a Metodos
        .filter(Videogame::getEnDescuento)  //Filtrar solo juegos que tienen descuento
        .map(Videogame::getVentasTotales)   //Enfocarse en un unico campo , ventasTotales
        .reduce(Integer::sum);  //Apoyarse de la Clase Integer para utilizar su metodo suma
        System.out.println("Referencia a Metodos - Ventas Totales de Juegos con Descuento: "+resultado);
    }

    static void minOperator(Stream<Videogame> flujo){   //Muestra el titulo con el nombre mas cercano a la A / ventas totales
            //Comparar alfabeticamente
        // Optional<Videogame> minNombre = flujo.min(Comparator.comparing(Videogame::getNombre));
        // System.out.println(minNombre.get().getNombre());

            //Obtener el titulo que menos se ha vendido
        Optional<Videogame> minVentas = flujo.min(Comparator.comparing(Videogame::getVentasTotales));
        System.out.println(minVentas.get().getVentasTotales());

    }

    static void maxOperator(Stream<Videogame> flujo){   //Muestra el titulo con el nombre mas alejado de la A
            //Comparar alfabeticamente
        // Optional<Videogame> maxNombre = flujo.max(Comparator.comparing(Videogame::getNombre));
        // System.out.println(maxNombre.get().getNombre());

            //Obtener el titulo que mas se ha vendido
        Optional<Videogame> maxVentas = flujo.max(Comparator.comparing(Videogame::getVentasTotales));
        System.out.println(maxVentas.get().getVentasTotales());
    }

}
