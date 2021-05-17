/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia_apps;

/**
 *
 * @author Jesus Andres
 */
public class Circulo extends Figura{
    public Circulo(int radio){
    super(0,0,0,radio,0);}
    
    public double perimetro(){
        perimetro=2*3.141592*radio;
    return perimetro;}
    
    public double area(){
        area=3.141592*radio*radio;
    return area;}
}
