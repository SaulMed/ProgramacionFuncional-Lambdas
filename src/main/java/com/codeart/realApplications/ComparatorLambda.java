package com.codeart.realApplications;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ComparatorLambda {
    
    public static void main(String[] args) {
        //Lista Numerica
        List<Integer> numeros = Arrays.asList(5,6,3,7,1,9,4,2,6,8);
        numeros.sort((v1,v2) -> v1 -v2);
        System.out.println(numeros);
        
        //Lista Strings
        List<String> nombres = Arrays.asList("Jhon","Paul","Anna","Smith");
        //nombres.sort((v1,v2) -> v1.compareTo(v2));
        nombres.sort(String::compareTo);
        System.out.println(nombres);
        //Invertir lista
        nombres.sort(Comparator.reverseOrder());
        System.out.println(nombres);

        //Lista de objetos personalizados
        List<Person> personas = Arrays.asList(
            new Person("Jose", 13),
            new Person("Megan", 25),
            new Person("Pedro", 41),
            new Person("Mario", 25));

            //Comparacion de personas a traves de su edad usando lambda
        //personas.sort( (a,b) -> a.getEdad() - b.getEdad());

        //Si el nombre conincide entonces comparar por el nombre en sus metodos referenciados correspondientes
        personas.sort(Comparator.comparingInt(Person::getEdad).thenComparing(Person::getNombre));

        System.out.println(personas);

    }


}


@Data
@AllArgsConstructor
class Person{
    private String nombre;
    private Integer edad;
}