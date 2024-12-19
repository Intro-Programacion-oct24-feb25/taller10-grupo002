/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        char letra;
        String acumuladora = "";
        
        for (int fila = 0; fila < estudiantes.length; fila++)
            for(int col = 0; col < estudiantes[fila].length; col++){
                letra = estudiantes[fila][col].charAt(0);
                if(letra == 'S' || letra == 'P' || letra == 'T'){
                    acumuladora = String.format("%s",
                            estudiantes[fila][col]);
                    
                
                }
            }
        System.out.printf("%s\n",
                acumuladora);
    }
}
