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
public class Cuadrado extends Rectangulo{
   public Cuadrado(int base){
    super(base,base);
    }
    
    public double perimetro(){
    perimetro=base*4;
    return perimetro;}
    
    public double area(){
    area=base*base;
    return area;} 
}
