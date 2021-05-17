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
public class AlumnoPrimaria extends Alumnos{
    private int grado;

    public AlumnoPrimaria(char sexo, int edad, String nombre, int grado) {
        super(sexo, edad, nombre);
        this.grado=grado;
    }

    @Override
    public void presentacion() {
        System.out.println("Soy alumno de primaria");
    }
    
    @Override
    public void grado() {
        super.grado(); 
        System.out.println("Estoy en "+grado+ "de primaria");
    }

    @Override
    public String toString() {
        return super.toString()+" grado: "+grado; 
    }
    
    public int randomGrado()
    {
        grado=(int)(Math.random()*(6-1+1)+1);
        return grado;
    }
}
