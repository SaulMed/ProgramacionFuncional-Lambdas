package com.codeart.interfazFuncional;

// Interfaz Funcional = debe tener UN UNICO METODO ABSTRACTO
// Metodo Abstracto =  Es un método de una clase/Interfaz que no tiene implementación (es decir, sólo tiene declaración).

@FunctionalInterface
public interface IOperacion {
    
    Double ejecutar(Double a ,Double b);

    default Double multiplicar(Double a , Double b){return a * b; }


}
