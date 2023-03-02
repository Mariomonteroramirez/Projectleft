package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*if(edad > 18 && edad <= 69  "Los simbolos de &&se utilizan como and"){
          //se ejecuta una operacion si se cumple la condicion
     }else{
       //De lo contrario manda lo que este en else   System.out.println("Error");
     }*/

        //Desarrolaun programa que pregunte al usuario 3 numeros y decirle cual es mayor

        Scanner scanner = new Scanner(System.in);

        /*int n1,n2,n3,n4;

        System.out.println("Ingrese numero 1: ");
        n1 = scanner.nextInt();
        System.out.println("Ingrese numero 2: ");
        n2 = scanner.nextInt();
        System.out.println("Ingrese numero 3: ");
        n3 = scanner.nextInt();
        System.out.println("Ingrese numero 4: ");
        n4 = scanner.nextInt();

        if (n1 > n2 && n1 > n3 && n1 > n4){
            System.out.println("El numero mas grande es: "+ n1);
        } else if (n2 > n1 && n2 > n3 && n2 > n4) {
            System.out.println("El numero mas grande es: " + n2);
        }else if(n3> n1 && n3 > n2 && n3 > n4){
            System.out.println("El numero mas grande es: " + n3);
        }else if(n4> n1 && n4 > n2 && n4 > n3){
            System.out.println("El numero mas grande es: " + n4);
        }
        else{
            System.out.println("Los numeros son iguales");
        }
        */

       /*
        String nombre;
        for(int i = 0; i < 5 ; i++){
            System.out.println("Ingrese su nombre: ");
            nombre = scanner.nextLine();
            System.out.println("Te llamas:"+nombre);

        }
        */

        /*
        int numero,result;
        for ( int i = 0; i < 3; i++){
             System.out.println("ingresa un numero");
             numero = scanner.nextInt();
             result = numero * numero ;
             System.out.println("El resultado es: "+result);
         }
         */



         //ingresa num1 num2 suma reite 6

        /*
        int num1,num2,suma;
        for(int i = 0; i < 6; i++){
             System.out.println("Ingrese Numero 1: ");
             num1 = scanner.nextInt();
             System.out.println("Ingrese Numero 2: ");
             num2 = scanner.nextInt();
             suma = num1 + num2 ;
             System.out.println("El resultado de la suma es: "+suma);
         }
         */

        //ingre su edad

       /*
        int edad;
         for(int i = 0; i < 4; i++){
             System.out.println( "Ingresa tu edad:");
             edad = scanner.nextInt();
             if ( edad > 17){
                 System.out.println("Usted es mayor de edad");
             }else{
                 System.out.println("Usted es menor de edad");
             }
         }
        */

        double miArrayDouble[] = new double[7];

        for(int i = 0 ; i < 7; i++){
            miArrayDouble[i] = scanner.nextInt();
        }






    }
}