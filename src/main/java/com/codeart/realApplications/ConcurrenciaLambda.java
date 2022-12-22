package com.codeart.realApplications;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

//Trabajando con hilos = Procesos en 2do plano
public class ConcurrenciaLambda {
    
    //La interfaz Runnable NO REGRESA NINGUN VALOR
    static Runnable printerSum = ()->{
        long r = 0;
        //Mostrar hilo secundario
        System.out.println("Runnable Thread: " + Thread.currentThread().getName());
        //Realizar esta iteracion EN SEGUNDO PLANO (Fuera del hilo principal)
        for(int i = 0 ; i < 100000 ; i++){
            r += i;
        }
        System.out.println("Resultado Runnable: "+r);
    };

    //La interfaz generica Callable SI REGRESA UN VALOR, recomendada para el uso de consumo de apis
    static Callable<Long> returnSum = ()->{
        long r = 0;
        System.out.println("Callable Thread: " + Thread.currentThread().getName());
        for(int i = 0 ; i < 100000 ; i ++){
            r += i;
        }
        return r;
    };

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Main Thread: "+Thread.currentThread().getName());

        var exec = Executors.newSingleThreadExecutor();

        exec.submit(printerSum);

        var callable = exec.submit(returnSum);
        System.out.println("Resultado Callable: " + callable.get());

        //Terminar recursos
        exec.shutdown();

    }

}
