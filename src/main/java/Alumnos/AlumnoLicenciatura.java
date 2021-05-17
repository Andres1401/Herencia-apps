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
public class AlumnoLicenciatura extends Alumnos{
    private int semestre;
    private String facultad;
    private String carrera;

    public AlumnoLicenciatura(char sexo, int edad, String nombre, int semestre, String facultad, String carrera) {
        super(sexo, edad, nombre);
        this.semestre=semestre;
        this.facultad=facultad;
        this.carrera=carrera;
    }

    @Override
    public void presentacion() {
        super.presentacion(); 
        System.out.println("Soy un alumno de licenciatura");
    }

    @Override
    public void grado() {
        super.grado(); 
        System.out.println("Estoy cursando actualmente "+semestre+" semestre en la facultad "+facultad+" y carrera de "+carrera );
    }

    @Override
    public String toString() {
        return super.toString()+" Facultad: "+facultad+" carrera: "+carrera+" semestre: "+semestre; }
}
