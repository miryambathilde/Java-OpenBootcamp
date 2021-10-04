package com.example.tiposdedatos;

public class Operadores {
    public static void main(String[] args) {
        // aritmeticos

        // suma
        int numero1 = 10;
        int numero2 = 20;
        int resultadoSuma = numero1 + numero2;
        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.77);

        // resta
        int resultadoResta = numero1 - numero2;
        System.out.println("resultadoResta = " + resultadoResta);

        // comparación
        /*  < menor que,
            > mayor que,
            >= mayor o igual que,
            <= menor o igual que
            == igual que
            === NO EXISTE EN JAVA
         */

        boolean resultado1 = numero1 > numero2;
        System.out.println("resultado1 = " + resultado1);
        boolean resultado2 = numero1 < numero2;
        System.out.println("resultado2 = " + resultado2);

        /*
        Lógicos: and &&, or ||
        */
        boolean resultado3 = numero1 > 5 && numero1 < 30;

        int edad = 17;
        boolean carnetJoven = edad >= 15 && edad <=26;

        // operadores de incremento ++
        // operadores de decremento ++
    }
}
