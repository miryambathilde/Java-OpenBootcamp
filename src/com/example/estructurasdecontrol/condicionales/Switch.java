package com.example.estructurasdecontrol.condicionales;

public class Switch {
    public static void main(String[] args) {
        String dia = "Jueves";

        switch (dia){
            case "Lunes":
                System.out.println("Ánimo que estamos a lunes");
                break;
            case "Martes":
                System.out.println("Ya estamos a martes, ya queda menos");
                break;
            case "Miercoles":
                System.out.println("Estamos en el meridiano de la semana, es miercoles");
                break;
            case "Jueves":
                System.out.println("Los juernes, son los nuevos viernes!");
                break;
            case "Viernes":
                System.out.println("Ya estamos a viernes!");
                break;
            case "Sabado":
                System.out.println("Este sábado me voy a divertir");
                break;
            case "Domingo":
                System.out.println("Aprovecha al máximo el domingo");
                break;
            default:
                System.out.println("El día introducido no es un día válido");
        }
    }
}
