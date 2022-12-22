package com.codeart.fundamentos;

import java.util.List;

                //Uso de programacion GENERICA <>
public interface DataService<T>{

    T getById(Long id);
    List<T> getAllRecords();

}