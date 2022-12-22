package com.codeart.streamParalelos;

import java.util.List;

public class streamParalelo {
    
    public static void main(String[] args) {
        List<Integer> lista = List.of(1,2,3,4,5);

        //Ejecutados desde el main
        // lista.forEach(num ->     System.out.println( num + " - " + Thread.currentThread().getName()));
        
        //Ejecutados desde Threads diferentes
        lista.parallelStream().forEach( num ->     System.out.println( num + " - " + Thread.currentThread().getName()));

    }

}
