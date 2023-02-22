package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        System.out.println("Mario Montero Ramirez");
        int miEntero = 10;
        float miPuntoFlotante = 0.5f;
        double miDecimal = 22.5;
        String miTexto = "Hola soy un texto en Java";
        char miCaracter = 'a';


        Scanner scanner = new Scanner(System.in);

        int numero;
        numero = scanner.nextInt();
        System.out.println("Mi numero que acabo de ingresar es:"+ numero);*/

        //Desarrollar un Programa Java que lea dos numeros los sume y me muestre elresultado
        /*Scanner scanner = new Scanner(System.in);

        int numero;
        int numero2;

        System.out.println("Ingrese el numero 1");
        numero = scanner.nextInt();
        System.out.println("ingrese el numero 2");
        numero2 = scanner.nextInt();
        int Suma = numero + numero2;
        System.out.println("La suma de los dos numeros es:"+ Suma);*/


        //nombre, edad , peso , altura y calcular imc
        // imc peso/ altura x altura

       /* int miEntero = 10;
        float miPuntoFlotante = 0.5f;
        double miDecimal = 22.5;
        String miTexto = "Hola soy un texto en Java";
        char miCaracter = 'a';*/

        Scanner scanner = new Scanner(System.in);

        String nombre;
        System.out.println("Ingrese su nombre completo");
        nombre = scanner.nextLine();
        int edad;
        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();
        double peso;
        System.out.println("Ingrese su peso");
        peso = scanner.nextDouble();
        double altura;
        System.out.println("Ingrese su altura");
        altura = scanner.nextDouble();
        double imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);
        System.out.println("Su Nombre  es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su peso es:" + peso);
        System.out.println("Su altura es:" + altura);
    }
}