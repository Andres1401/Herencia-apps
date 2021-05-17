/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;

/**
 *
 * @author Jesus Andres
 */
public class Alumnos {
    protected char sexo;
    protected int edad;
    protected String nombre;

    public Alumnos(char sexo, int edad, String nombre) {
        this.sexo = sexo;
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public void grado(){
        System.out.println("Estoy en tal x grado");
    }
    
    public void presentacion(){
        System.out.println("Hola soy un alumno");
    }
    
    public String toString()
    {
        return "sexo: "+sexo+" edad: "+edad+" nombre: "+nombre;
    }
}
