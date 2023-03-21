
package com.mycompany.mavenproject1;


public class Ejercicio3 {

    
    public static void main(String[] args) {
        
        int[] numeros=new int[20];
         
        //Declaracion de las variables
        int suma=0;
        double media;
         
        //Ciclo for para recorrer el array
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
            suma+=numeros[i];
        }
         
        //Calculo la media y muestro la suma y la media
        System.out.println("La suma es "+suma);
         
        media=(double)suma/numeros.length;
         
        System.out.println("La media es "+media);
    }
    
}
