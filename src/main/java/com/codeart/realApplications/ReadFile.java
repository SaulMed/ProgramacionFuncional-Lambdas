package com.codeart.realApplications;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {
    
    public static void main(String[] args) {
        //Definir la ruta del archivo a leer
        Path filePath = Paths.get("src/main/java/resources/lambda.txt");
        //Preparar un flujo de datos tipo String
        //Se carga el archivo a la clase Files en su metodo lines para que realice la lectura correspondiente de cada linea en el archivo
        //Posterior a ello se trabaja con .onClose , un tipo callback para ejecutar un Runnable una ves terminada la lectura.
        try(Stream<String> lineas = Files.lines(filePath).onClose( () -> System.out.println("Lector Terminado."))){
        //Por cada linea se ejecuta el metodo referenciado println
            lineas.forEach(System.out::println);
        }catch(IOException iex){
            iex.printStackTrace();
        }

    }

}
