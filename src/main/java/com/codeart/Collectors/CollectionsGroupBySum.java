package com.codeart.Collectors;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import util.Console;
import util.Database;
import util.Videogame;

public class CollectionsGroupBySum {
    
    public static void main(String[] args) {
        
        Stream<Videogame> videojuegos = Database.videogames.stream();
            //Obtener el total , sumatoria Total , promedio y valores Max y Min de cada consola referentes a sus ventas totales
        Map<Console, IntSummaryStatistics> resultado = videojuegos.collect(Collectors.groupingBy(
            Videogame::getConsola,
            Collectors.summarizingInt(Videogame::getVentasTotales)
        ));

        resultado.forEach( (k,v) -> System.out.println(k + " - " + v));

    }

}
