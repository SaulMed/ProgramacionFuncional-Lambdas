package com.codeart.streamParalelos;

import java.util.stream.IntStream;

public class streamTime {

    // Stream normal = Es muy eficiente en PEQUEÑAS CANTIDADES DE DATOS
    // Stream Paralelizado = Presenta una mayor eficiencia con GRANDES CANTIDADES DE DATOS

    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();
        //Stream Normal
        // IntStream.range(1, 200000000).reduce(Integer::sum);

        // Stream Paralelizado
        IntStream.range(1, 200000000).parallel().reduce(Integer::sum);

        long endTime = System.currentTimeMillis();

        System.out.println("Resultado: "+ (endTime - startTime));


    }
    
}
