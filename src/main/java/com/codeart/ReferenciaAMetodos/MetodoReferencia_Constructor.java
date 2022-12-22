package com.codeart.ReferenciaAMetodos;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

import lombok.ToString;

public class MetodoReferencia_Constructor {
    
    public static void main(String[] args) {
        //Trabajado con lambda
        //Supplier<MyObject> myObj = () -> new MyObject();

        //Referencia a Metodo - Constructor
        Supplier<MyObject> myObj = MyObject::new;
        
        System.out.println(myObj.get());
    }

}


@ToString
class MyObject{
    private String id;
    private Integer age;

    public MyObject(){
        this.id = UUID.randomUUID().toString();
        this.age = new Random().nextInt(100);
    }

}