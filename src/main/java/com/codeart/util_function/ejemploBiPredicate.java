package com.codeart.util_function;

import java.util.function.BiPredicate;

public class ejemploBiPredicate {
    
    static BiPredicate<String, String> customEquals = (s1, s2) -> s1.concat(s2).equals("Hola Mundo");

    public static void main(String[] args) {
        String s1 = "Hola M";
        String s2 = "undo";

        System.out.println(customEquals.test(s1, s2));

    }

}
