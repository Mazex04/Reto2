
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
public class Ejercicio2 {
 
    public static void main(String[] args) {
 
        //Indicamos el tamaño.
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[]=new int[Integer.parseInt(texto)];
 
        //Invocamos las funciones
        rellenarNumAleatorioArray(num, 10, 20);
 
        mostrarArray(num);
    }
    //Ejecutamos una clase.
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
    //Ejecutamos una clase.
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}
