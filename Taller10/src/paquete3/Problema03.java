/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {
    public static void main(String[] args) {
        double[][] notas = {{7.1, 8, 10}, 
                            {3, 7, 9}, 
                            {10, 9, 2.1}};
        double[] sumaNotas = new double[3];
        String[] promedioNotasCualitativas = new String[3];
        double promedio[] = new double[5];
        double suma;
        
        for (int i = 0; i < notas.length; i++) { 
            suma = 0; // 0
            for (int j = 0; j < notas[i].length; j++) {
                suma = suma + notas[i][j];
                    
            }
            sumaNotas[i] = suma; 
            promedio[i] = sumaNotas[i]/4;

            if(promedio[i] >= 0 && promedio[i] <= 2.9){
                promedioNotasCualitativas[i]= "Insuficiente";
            }else{
                if(promedio[i] >= 3 && promedio[i] <= 4.9){
                    promedioNotasCualitativas[i]= "Regular";
                }else{
                    if(promedio[i] >= 5 && promedio[i] <= 7.9){
                        promedioNotasCualitativas[i]= "Bueno";
                    }else{
                        if(promedio[i] >= 8 && promedio[i] <= 9.5){
                            promedioNotasCualitativas[i]= " Muy Bueno";
                        }else{
                            if(promedio[i] >= 9.6 && promedio[i] <= 10){
                                promedioNotasCualitativas[i]= "Sobresaliente";
                            }
                        }
                    }
                }
            }
            
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("El promedio es: %.2f y su valor cualitativo es: %s\n",
                    promedio[i],
                    promedioNotasCualitativas[i]);
        }
    }
}

