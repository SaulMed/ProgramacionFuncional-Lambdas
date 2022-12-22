package com.codeart.util_function;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

//Utilizando interfaz Function para trabajar con la serializacion y deserializacion de un objeto Persona

public class ejemploFunctionSerialized {

    static Function<Persona, ByteArrayOutputStream> serializer = p -> {
        //Se define el espacio de los binarios a guardar en memoria
        ByteArrayOutputStream memoryBytes = new ByteArrayOutputStream();

        //outputStream = Es el objeto que nos ayuda a transmitir el flujo de binarios
        try(ObjectOutputStream outputStream = new ObjectOutputStream(memoryBytes)){
            //Proceso de serializacoin
            outputStream.writeObject(p);
            outputStream.flush();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return memoryBytes;
    };

    static Function<ByteArrayInputStream, Persona> deserialized = bais -> {
        try(ObjectInputStream inputStream = new ObjectInputStream(bais)){
            return (Persona) inputStream.readObject();
        }catch(IOException | ClassNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }
    };

    public static void main(String[] args) {
        //Proceso de Serializacion
        ByteArrayOutputStream objetoSerializado = serializer.apply(new Persona("Saul", 25));
        System.out.println("Objeto Serializado:");
        System.out.println(Arrays.toString(objetoSerializado.toByteArray()));

        //Proceso de Deserializacion
        Persona objetoDeserializado = deserialized.apply( new ByteArrayInputStream(objetoSerializado.toByteArray()) );
        System.out.println("Objeto Deserializado:");
        System.out.println(objetoDeserializado);

    }
    
}


@ToString
@Data
@AllArgsConstructor
//La interfaz serializable es utilizada para el manejo de binarios
class Persona implements Serializable{

    private String nombre;
    private Integer edad;

}