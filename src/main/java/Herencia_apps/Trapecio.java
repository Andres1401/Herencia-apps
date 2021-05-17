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
public class Trapecio extends Cuadrilatero{
    public Trapecio(int base, int altura, int baseMenor){
    super(base,altura,baseMenor);
    }
    
    public double perimetro(){
    perimetro=base+baseMenor+(2*(Math.sqrt((base-baseMenor)*(base+baseMenor)+altura*altura)));
    
    return perimetro;}
    
    public double area(){
    area=(base+baseMenor)*altura/2;
    return area;}
}
