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

        /*
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
        System.out.println("Su altura es:" + altura);*/

        //Desarrollar un programa que pida nombre apellido domicilio cuanto cotizo en 2022 y cunto impuesto va a pagar declarar constante de isr de 12%

      /*  final double ISR = 0.12;

        String nombre;
        String apellido;
        String domi;
        double coti;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese apellidos: ");
        apellido = scanner.nextLine();

        System.out.println("Ingresar Domicilio: ");
        domi = scanner.nextLine();

        System.out.println("Ingrese la cantidad a Cotizar: ");
        coti = scanner.nextDouble();

        double result = coti * ISR;

        System.out.println("Su nombre es: " + nombre);
        System.out.println("Sus apellidos son: " + apellido);
        System.out.println("Su domicilio es: " + domi);
        System.out.println("El ISR es de: "+ result);

       */

        /*
        1 Nombre Apellido domicilio precio de su carro
        2-. Calcular elimpusesto de tenecia = precio del carro  1.3 %
         */

       /*
        Scanner scanner = new Scanner(System.in);

        final double  tenencia= 0.013 ;

         String nombre;
         String apelli;
         String domi;
         double precar;

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese sus Apellidos:");
        apelli = scanner.nextLine();

        System.out.println("ingrese domicilio: ");
        domi = scanner.nextLine();

        System.out.println("ingrese el precio de su carro: ");
        precar = scanner.nextDouble();

         double resulta = precar *  tenencia;

        System.out.println("El nombre es: "+ nombre);
        System.out.println("Sus apellidos son: "+apelli);
        System.out.println("Su domicilio es: "+ domi);
        System.out.println("Su tenencia es:"+ resulta);
        */

        int a = 20;
        int b = 5;
        int c = 3;

        if(a>b){
            System.out.println("a es mayor que b");
        }else{
            System.out.println("a no es mayor que b");
        }


    }
}