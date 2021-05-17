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
public class Rectangulo extends Cuadrilatero{

    public Rectangulo(int base, int altura){
    super(base,altura,0);
    }
    public double perimetro(){
    perimetro=base*2+altura*2;
    return perimetro;}
    public double area(){
    area=base*altura;
    return area;}
}
