package com.codeart.util_function;

import java.util.Random;
import java.util.function.Supplier;

import lombok.AllArgsConstructor;
import lombok.ToString;

//Esta interfaz es lo contraro a Consumer
//Supplier = No recibe argumentos , se encarga de REGRESA UN RESULTADO

public class ejemploSupplier {

    //Supplier de tipo entero
    static Supplier<Integer> aleatorio = () -> new Random().nextInt(50);
    
    //Supplier de tipo producto
    static Supplier<Product> productoSupplier = () -> new Product(500,"Keyboard");

    public static void main(String[] args) {
        System.out.println(aleatorio.get());
        System.out.println(aleatorio.get());
        System.out.println(aleatorio.get());

        System.out.println(productoSupplier.get());
    }
    
}

@ToString
@AllArgsConstructor
class Product{
    private Integer precio;
    private String nombre;
}