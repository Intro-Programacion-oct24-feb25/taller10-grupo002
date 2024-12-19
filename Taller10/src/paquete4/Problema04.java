/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double datos[][] = new double [2][2];
            int contador = 0;
            for(int fila = 0; fila < datos.length; fila++){
                for(int col = 0; col < datos[fila].length; col++){
                    System.out.println("Ingrese un valor: ");
                    datos[fila][col] = entrada.nextDouble();
                    if(datos[fila][col] <= 1000 || datos[fila][col] >= 1199){
                        datos[fila][col] = 10;
                        contador = contador + 1;
                    }
                }
            }
            for(int fila = 0; fila < datos.length; fila++){
                for(int col = 0; col < datos[fila].length; col++){
                    System.out.printf("datos[%d][%d] = %.2f\n",
                            fila,
                            col,
                            datos[fila][col]);
                }
            }
            System.out.printf("Las veces que se ingreso valores fuera de rango: %d\n",
                    contador);
            
    }
}
