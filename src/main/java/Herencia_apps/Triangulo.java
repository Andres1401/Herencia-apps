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
public class Triangulo extends Figura{
    
    public Triangulo(int base, int altura){
    
    super(3,base,altura,0,0);
    }
    
    public double perimetro(){
    perimetro=base*3;
    return perimetro;}
    
    public double area(){
    area=(base*altura)/2;
    return area;}
}
