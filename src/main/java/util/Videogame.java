package util;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Videogame {
    private String nombre;
    private Double precio;
    private Console consola;
    private List<Review> reseñas;
    private String sitioOficial;
    private Boolean enDescuento;
    private Integer ventasTotales;

    @Override   // La libreria com.fasterxml.jackson.core nos permitir trabajar con formato JSON
    public String toString(){
        ObjectMapper mapper = new ObjectMapper();
        try{
            return mapper.writeValueAsString(this);
        }catch(JsonProcessingException e){
            throw new RuntimeException("No se puede escribir el valor en formato JSON.");
        }
    }
}
