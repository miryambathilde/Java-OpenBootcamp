package com.example.funciones;

import java.util.Arrays;

/*
Crear una función que reciba un precio y devuelva el precio con el IVA incluido
*/

public class Funciones {
    public static void main(String[] args) {

        // opcion 1: funcion sin parametros y sin tipo de retorno (void)
        showMenu();

        // opcion 2: funcion sin parametros y tipo de retorno
        String menu = getMenu();
        // lo podemos imprimir despues de guardar en una variable así:
        System.out.println(menu);
        // o directamente con la funcion invocada
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(getPrice());

        // opción 3: funcion con parametros y sin tipo de retorno
        imprimirSaludo("OpenBootcamp");

        // opción 4: funcion con paramtros y con tipo de retorno
        String nombre = "Miryam";
        String apellido = "Bathilde";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma = suma (50, 200);
        System.out.println(resultadoSuma);
    }

    static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    /*
    La sobrecarga permite duplicar un método SIEMPRE y cuando tengan diferentes numero/tipo de parametros
     */
    static double suma(double numero1, double numero2){
        return numero1 + numero2;
    }

    static String obtenerSaludo(String nombre, String apellido){
        return "Buenas tardes " + nombre + " " + apellido;
    }

    static void imprimirSaludo(String nombre) {
       System.out.println("Buenas tardes " + nombre);
    }

    static double getPrice() {
        return 100.99;
    }

    // una función siempre tiene que llevar delante lo que devuelve
    // para poder invocar una función hay que poner static porque está dentro de un contexto static
    // void indica que no devuelve nada
    static void showMenu(){
        System.out.println("Bienvenidos al E-commerce de zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }

    // devuelve un string: una cadena de texto
    static String getMenu(){
        return "Bienvenidos al E-comerce de zapatillas: \n 1- Ver zapatillas";
    }
}
