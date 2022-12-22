package com.codeart.lambdas;

import java.util.Arrays;
import java.util.List;

public class CicloFor {

    public static void main(String[] args) {
        

        List<String> games = Arrays.asList("League of legends","Rocket League","Tomb Raider");

            //Programacion tradicional
        for(String g : games){
            System.out.println(g);
        }

        System.out.println("*******************");
            //Programacion Funcional
        games.forEach(g -> System.out.println(g.toUpperCase()));

    }
    
}
