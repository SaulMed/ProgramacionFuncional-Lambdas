package com.codeart.lambdas;

public class SwitchLambda {

    public static void main(String[] args) {
        //Esta caracteristica unicamente es soportada apartir del JDK 17

        var result = switch("UNO"){
            case "UNO" -> 1;
            case "DOS" -> 2;
            case "TRES" -> 3;
            default -> 0;
        };
        System.out.println(result);

    }
    
}
