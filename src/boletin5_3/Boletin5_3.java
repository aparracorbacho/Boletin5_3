/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Boletin5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        System.out.println("Introduce el radio de la circunferencia");
        Scanner radioTeclado = new Scanner(System.in);
        radio = radioTeclado.nextDouble();
        Circulo cir = new Circulo(radio);
        System.out.println("El area del circulo es: "+cir.calcularArea() +" El perimetro es: "+ cir.calcularLonxitude());
        
        
    }
    
}
