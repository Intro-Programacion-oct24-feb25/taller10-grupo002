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
        // 0 - 5.9 Bueno
        // 6 - 8.9 Muy Bueno
        // 9 - 10 Sobresaliente
                    
        double suma;
        
        for (int i = 0; i < notas.length; i++) { // 0<3
            suma = 0; // 0
            for (int j = 0; j < notas[i].length; j++) { // 0<notas[0].length
                                                        // 0<4 // 1<4 // 2<4 // 3<4 // 4<4
                suma = suma + notas[i][j];
                     // 0 + notas[0][0] // 0 + 9 // 9
                     // 9 + notas[0][1] // 9 + 10 // 19
                     // 19 + notas[0][2] // 19 + 7 // 26
                     // 26 + notas[0][3] // 26 + 8 // 34
            }
            sumaNotas[i] = suma; //
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
        // Presentación de resultados
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("El promedio es: %.2f y su valor cualitativo es: %s\n",
                    promedio[i],
                    promedioNotasCualitativas[i]);
        }
    }
}

