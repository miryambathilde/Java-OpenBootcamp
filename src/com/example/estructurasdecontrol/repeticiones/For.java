package com.example.estructurasdecontrol.repeticiones;

public class For {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            System.out.println("El valor de i es: " + i);
        }

        String[] nombres = {"Pepe", "Juanito", "Ruperta"}; // length 3

        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        int suma = 0;
        int[] numeros = {5,7,6}; // length 3
        for(int i = 0; i < numeros.length; i++){
            //suma = suma + numeros[i];
            suma += numeros[i];
            System.out.println(suma);
        }

    }
}
