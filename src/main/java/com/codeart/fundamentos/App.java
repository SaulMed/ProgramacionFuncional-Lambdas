package com.codeart.fundamentos;

import java.util.List;

// Programación Generica = uso de simbolo <> 
// Una convencion para el llamado de parametros es 
//     E - Elemento (List)
//     K - Llave   (HashMap)
//     N - Numero
//     T - Tipo    (Tipo aleatorio , objetos)
//     V - Valor   (Similar a K)
//     U - Unidad (Usualmente indica el uso de un 2do argumento)


//  CLASE ANONIMA = Es la implementacion de una interfaz o una clase abstracta QUE SOLO SE VA A UTILIZAR UNA VEZ

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Product prd = new Product();

        // System.out.println(emp.getById(25L));
        // System.out.println(prd.getById(85L));

            

            //Implementando una CLASE ANONIMA a traves de una interfaz
            // DataService<String> dataInterface = new DataService<String>() {

            //     @Override
            //     public String getById(Long id) {
            //         return "Test";
            //     }

            //     @Override
            //     public List<String> getAllRecords() {
            //         // TODO Auto-generated method stub
            //         return null;
            //     }
                
            // };

            // System.out.println(dataInterface.getClass().getName());
            // System.out.println(Employee.class.getName());
            // System.out.println(Product.class.getName());
            // System.out.println(String.class.getName());

    }
}
