/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

/**
 *
 * @author CDML
 */
public class Problema07 {
    
    public static void main(String[] args) {
        
        double suma1 = 0;
        double suma2 = 0;
        double[][] arreglo1 = {{0, 2, 0},{1, 0, 0}};
        double[][] arreglo2 = {{0, 0, 0},{0, 0, 0}};
        
        for (int fila = 0;fila < arreglo1.length;fila++){
            for (int col = 0;col < arreglo1[fila].length;col++){
                suma1 = suma1 + arreglo1[fila][col];
                suma2 = suma2 + arreglo2[fila][col];
                
            }
        } 
        
        if (suma1 == 0){
            System.out.println("El arreglo 1 es NULO\n");
        } else {
            System.out.printf("La suma del los valores del arreglo 1 es de: %s\n",suma1);
        }
        if (suma2 == 0){
            System.out.println("El arreglo 2 es NULO");
        } else {
            System.out.printf("La suma del los valores del arreglo 2 es de: %s\n",suma2);
        }
        
        
    
    }
}
