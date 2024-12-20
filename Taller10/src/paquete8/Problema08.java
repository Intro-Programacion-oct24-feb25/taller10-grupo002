/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author CDML
 */
public class Problema08 {
    public static void main(String[] args) {

    int [][] dato1 = {{1, 2, 3}, {6, 8, 9}};
    int [][] dato2 = {{10, 1, 2}, {10, 9, 1}};
    
   
    int [][] resultado = new int [2][3];
    
  
    resultado[0][0] = dato1[0][0]; 
    resultado[0][1] = dato2[0][1]; 
    resultado[0][2] = dato2[0][2]; 
    
    resultado[1][0] = dato1[1][0]; 
    resultado[1][1] = dato1[1][1]; 
    resultado[1][2] = dato2[1][2]; 
    

    System.out.println("Arreglo resultado:");
    for (int fila = 0; fila<resultado.length;fila++) {
        for  (int col = 0; col<resultado[fila].length;col++) {
            System.out.print(resultado[fila][col] + " ");
        }
        System.out.println();
    }
}

}
