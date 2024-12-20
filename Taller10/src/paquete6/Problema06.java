/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {
    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        
        String acumuladora = "";
        
        for(int fila = 0; fila < estudiantes.length; fila++)
            for(int col = 0; col < estudiantes[fila].length; col++){
                if(estudiantes[fila][col].length() == 11){
                    acumuladora = String.format("%s%s\n",
                            acumuladora,
                            estudiantes[fila][col]);
            }
        }
        
        System.out.printf("Los nombres con 11 caracteres son: \n%s",
                acumuladora);
        
        
        
        
        
        
    }
    
}
