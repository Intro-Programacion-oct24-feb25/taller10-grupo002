/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double ventas[][] = new double[2][5];
        String vendedores[] = {"Jessica Cole", "Robert Wallace"};
        double ventasT = 0;
        for(int fila = 0; fila < vendedores.length; fila++){
            for(int col = 0; col < ventas[fila].length; col++){
                System.out.println("Ingrese las ventas de el dia: ");
                ventas[fila][col] = entrada.nextDouble();
                ventasT = ventasT + ventas[fila][col];    
            }
        }
        for(int fila = 0; fila < vendedores.length; fila++){
                System.out.printf("Vendedor(a) %s\n",
                        vendedores[fila]);
            }
        System.out.printf("Han realizado un total de %s en ventas\n",
                ventasT);
    }
}
