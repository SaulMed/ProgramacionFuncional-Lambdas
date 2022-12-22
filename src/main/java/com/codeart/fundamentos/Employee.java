package com.codeart.fundamentos;

import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data                           //Uso de interfaz generica <>
public class Employee implements DataService<Employee>{
    
    private String dni;
    private String name;
    private Double salary;

    @Override
    public Employee getById(Long id) {

        Employee e = new Employee();

        e.setDni(id.toString());
        e.setName("Ramon");
        e.setSalary(200.80);

        return e;
    }
    @Override
    public List<Employee> getAllRecords() {
        // TODO Auto-generated method stub
        return null;
    }

}
