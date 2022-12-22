package com.codeart.ReferenciaAMetodos;

import java.util.UUID;
import java.util.function.Supplier;

public class MetodoReferencia_Static {
    
    public static void main(String[] args) {
            //Metodo manejado con lambda
        //Supplier<UUID> aleatorio = () -> UUID.randomUUID();

            //Metodo Referenciado de manera static (randomUUID)
        Supplier<UUID> aleatorio = UUID::randomUUID;
        
        System.out.println(aleatorio.get());
    }

}
