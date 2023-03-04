/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_17_sobrecargas_areas;

/**
 *
 * @author eduar
 */
public class EVA1_17_SOBRECARGAS_AREAS {

    public static void main(String[] args) {
        System.out.println("El área del círculo es: " +circulo(5));
        System.out.println("El área del triángulo es: "+triangulo(5,5));
        System.out.println("El área del trapecio es: "+trapecio(5,5,5));
    }
    //calcular el área de un círculo
    public static double circulo(double radio){
        return Math.PI * Math.pow(radio, 2);
        
    }
    //calcular el área de un triangulo
    public static double triangulo(double base, double altura){
        return (base*altura) /2.0;
    }
    //calcular el área de un trapecio
    public static double trapecio(double bMayor, double bMenor, double altura){
        return altura * (bMayor + bMenor) / 2.0;
    }
            
}
