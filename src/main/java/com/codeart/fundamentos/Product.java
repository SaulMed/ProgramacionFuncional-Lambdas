package com.codeart.fundamentos;

import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data                           //Uso de interfaz generica <>
public class Product implements DataService<Product>{
    
    private String id;
    private String name;
    private Double price;
    @Override
    public Product getById(Long id) {

        Product p = new Product();

        p.setId(UUID.randomUUID().toString());
        p.setName("Keyboard");
        p.setPrice(800.50);
        
        return p;
    }
    
    @Override
    public List<Product> getAllRecords() {
        return null;
    }

}
