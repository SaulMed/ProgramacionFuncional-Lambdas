package com.codeart.lambdas;

//Interfaz Funcional = Cuenta con un unico metodo abstracto

@FunctionalInterface
public interface IPrint<T> {
    
    void imprimir(T objectToPrint );

}
