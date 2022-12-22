package com.codeart.streams;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import util.Database;
import util.Videogame;
//Streams = Son utilizados en todas las collections de java 
public class Constructors {
    
    public static void main(String[] args) {
        //Base de datos estatica
        Stream<Videogame> myStream = Database.videogames.stream();
        myStream.forEach( System.out::println);

        System.out.println("*******************");

        Integer[] myNumberArray = {1,2,3,4,5,6,7,8,9,10}; 
        Stream<Integer> intStream = Arrays.stream(myNumberArray);
        intStream.forEach(System.out::println);

        System.out.println("*******************");

        Stream.of("Hola","Mundo").forEach(System.out::println);

        System.out.println("*******************");

        DoubleStream myDoubleStream = DoubleStream.of(25.5,32.5,12.7,21.8);
        myDoubleStream.forEach(System.out::println);
        

    }

}
