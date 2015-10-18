/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

/**
 *
 * @author MotherFoquita
 */
public class Circulo {
    private double radio;
    private double pi = (double)3.14;
       
    public Circulo(){
    }
    public Circulo(double radioI){
    radio = radioI;
    }
    public double calcularArea(){
    double area;
    area = pi * Math.pow(radio,2);
    return area;
    }
    public double calcularLonxitude(){
    double longitud;
    longitud = pi*radio*2;
    return longitud;
    }
}

