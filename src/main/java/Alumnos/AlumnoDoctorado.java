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
public class AlumnoDoctorado extends Alumnos{
    private int añoDoctorado;
    private int numInvestigaciones;
    private String doctorado;

    public AlumnoDoctorado(char sexo, int edad, String nombre, int añoDoctorado, int numInvestigaciones, String doctorado) {
        super(sexo, edad, nombre);
        this.añoDoctorado=añoDoctorado;
        this.numInvestigaciones=numInvestigaciones;
        this.doctorado=doctorado;
    }

    @Override
    public String toString() {
        return super.toString()+" año del doctorado: "+añoDoctorado+" numero de investigaciones: "+numInvestigaciones+" doctorado: "+doctorado;
    }

    @Override
    public void presentacion() {
        super.presentacion();
        System.out.println("Estoy cursando un doctorado");
    }

    @Override
    public void grado() {
        super.grado();
        System.out.println("El año del doctorado en el que me encuentro es: "+añoDoctorado);
    }
}
