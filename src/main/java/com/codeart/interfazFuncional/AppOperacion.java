package com.codeart.interfazFuncional;

public class AppOperacion{

    public static void main(String[] args) {

        //Clase Anonima = implementacion de Interfaz o Clase Abstracta
        IOperacion op = new IOperacion() {
            @Override
            public Double ejecutar(Double a, Double b) {
                return a + b;
            }
        };
        System.out.println("Clase Anonima - Ejecutar: " + op.ejecutar(5.5,6.3));;
        System.out.println("Clase Anonima, default method: " + op.multiplicar(3.3, 2.2));

            //USO DE LAMBDA
            IOperacion opLambda = (a,b) -> a + b;

            System.out.println("Lambda - Ejecutar: " + opLambda.ejecutar(3.5,3.5));
            System.out.println("Lambda - default method: " + opLambda.multiplicar(1.5, 1.5));
    }

}