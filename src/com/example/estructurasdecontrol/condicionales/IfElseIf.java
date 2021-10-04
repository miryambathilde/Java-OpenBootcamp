package com.example.estructurasdecontrol.condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        String dia = "Jueves";

        // ejemplos comparar
        boolean resultadoCompararNum = 5 == 5;
        // para comparar string METODO EQUALS
        boolean resultado = dia.equals("Martes");

        // if else if
        if(dia.equals("Lunes")){
            System.out.println("Ánimo que estamos a lunes");
        }
        else if (dia.equals("Martes")){
            System.out.println("Ya estamos a martes, ya queda menos");
        }
        else if (dia.equals("Miercoles")){
            System.out.println("Estamos en el meridiano de la semana, es miercoles");
        }
        else if (dia.equals("Jueves")){
            System.out.println("Los juernes, son los nuevos viernes!");
        }
        else if (dia.equals("Viernes")){
            System.out.println("Ya estamos a viernes!");
        }
        else if (dia.equals("Sábado")){
            System.out.println("Este sábado me voy a divertir");
        }
        else if (dia.equals("Domingo")){
            System.out.println("Aprovecha al máximo el domingo");
        }
        else {
            System.out.println("El día seleccionado no es un día válido");
        }
    }
}
