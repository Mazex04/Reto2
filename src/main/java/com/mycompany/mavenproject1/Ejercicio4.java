
package com.mycompany.mavenproject1;

import java.util.Scanner;
 
public class Ejercicio4 {
 
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
         
        
        System.out.println("Escriba una frase");
         
        
        String frase=sc.nextLine(); 
         
        //Creamos un array de caracteres
        char caracteres[]=new char[frase.length()];
         
        //Recorremos la frase y cogemos cada caracter y lo metemos en el array
        for(int i=0;i<frase.length();i++){
            caracteres[i]=frase.charAt(i);
            System.out.println(caracteres[i]);
        }
         
    }
     
}
