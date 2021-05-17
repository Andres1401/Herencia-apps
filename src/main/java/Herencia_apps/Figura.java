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
public class Figura {
    protected int lados;
    protected int base;
    protected int altura;
    protected int radio;
    protected int baseMenor;
    protected double perimetro;
    protected double area;
    //Contructor de figuras
    public Figura(int lados, int base,int altura,int radio, int baseMenor){
    this.lados=lados;
    this.base=base;
    this.altura=altura;
    this.radio=radio;
    this.baseMenor=baseMenor;
    }
    
}
