package com.codeart.lambdas;

import java.util.UUID;

import com.codeart.fundamentos.Employee;
import com.codeart.fundamentos.Product;

//Uso de interfaz funcional con diferentes objetos y lambdas

public class AppLambda {
    
    public static void main(String[] args) {
        
        IPrint<String> instanciaInterface = content -> System.out.println(content);
        instanciaInterface.imprimir("Hola Mundo");
        
        IPrint<Product> productInstance = product -> System.out.println(product);
        Product p1 = new Product();
        p1.setId(UUID.randomUUID().toString());
        p1.setName("Mouse");
        p1.setPrice(250.65);
        productInstance.imprimir(p1);

        IPrint<Employee> employeeInstance = employee -> System.out.println(employee);
        Employee e1 = new Employee();
        e1.setDni(UUID.randomUUID().toString());
        e1.setName("Felipe");
        e1.setSalary(2580.75);
        employeeInstance.imprimir(e1);

    }

}
