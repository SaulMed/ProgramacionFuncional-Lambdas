package com.codeart.realApplications;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

public class StrategyLambdas {
    
    public static void main(String[] args) {
        //Generar Productos
        var producto1 = Product.builder().id(1).nombre("Keyboard").precio(150.00).tipoUsuario("BASIC").build();
        var producto2 = Product.builder().id(2).nombre("Mouse").precio(150.00).tipoUsuario("PLUS").build();
        var producto3 = Product.builder().id(3).nombre("Monitor").precio(150.00).tipoUsuario("PREMIUM").build();
        var productos = List.of(producto1, producto2, producto3);

        //Aplicar descuentos
        productos.forEach( p -> {
            switch(p.getTipoUsuario()){
                case "BASIC": p.setAplicarDescuento(Strategias.descuentoBasico); break;
                case "PLUS": p.setAplicarDescuento(Strategias.descuentoPlus); break;
                case "PREMIUM": p.setAplicarDescuento(Strategias.descuentoPremium); break;
            }
        });

        //Mostrar resultados
        productos.forEach(p -> {
            System.out.println(
            ", Producto: "+p.getNombre()+
            "Precio: " + p.getPrecio() + 
            ", Tipo Usuario: "+p.getTipoUsuario() +
            ", Descuento:" + p.getAplicarDescuento().obtenerDescuento(p.getPrecio()));
        });
    }
}


@FunctionalInterface
interface AplicarDescuento {
    Double obtenerDescuento(Double precioProducto);
}

class Strategias{
    static AplicarDescuento descuentoBasico = p -> p * .02;
    static AplicarDescuento descuentoPlus = p -> p * .05;
    static AplicarDescuento descuentoPremium = p -> p *.08;
}

@Data
@Builder
class Product{
    private long id;
    private String tipoUsuario;
    private String nombre;
    private Double precio;
    private AplicarDescuento aplicarDescuento;
}