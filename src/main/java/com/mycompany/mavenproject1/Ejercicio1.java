
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
public class Ejercicio1 {

    public static void main(String[] args) {
        final int tamaño=5;
 
        int num[]=new int[tamaño];
 
        //Funciones.
        rellenarArray(num);
 
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        //Inicio del ciclo for para dar pie al funcionamiento del codigo
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}
