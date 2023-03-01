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

        int n1,n2,n3,n4;

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


    }
}