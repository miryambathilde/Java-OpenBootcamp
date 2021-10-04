package com.example.estructurasdecontrol.condicionales;

public class If {
    public static void main(String[] args) {
        int edad = 17;
        boolean esMayor = edad >=18;

        if(esMayor) {
            System.out.println("Es menor de edad");
        }
        else {
            System.out.println("Es mayor de edad");
        }
    }
}
