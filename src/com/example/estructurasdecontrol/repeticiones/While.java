package com.example.estructurasdecontrol.repeticiones;

public class While {

    /**
     * Crear un bucle que permita concatenar textos y reimprima el resultado final por consola.
     * Los texto pueden venir de un array de String / String[] nombre = {"", "", ""}
     */

    public static void main(String[] args) {

        int contador = 0;

        while(contador < 10){
            contador++;
            if(contador == 5){
                //break; // imprime del 1 a 4
                //continue; // imprimer del 1 al 10 excepto el numero 5, es decir para excluir el numero 5
            }
            System.out.println("Valor de contador: " + contador); // imprime del 1 al 10 incluidos
        }
    }
}
