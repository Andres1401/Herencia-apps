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
public class AlumnoMaestria extends Alumnos{
     private int añoMaestria;
    private int numIdiomas;
    private String maestria;

    public AlumnoMaestria(char sexo, int edad, String nombre, int añoMaestria, int numIdiomas, String maestria) {
        super(sexo, edad, nombre);
        this.añoMaestria=añoMaestria;
        this.numIdiomas=numIdiomas;
        this.maestria=maestria;
    }

    @Override
    public String toString() {
        return super.toString()+"año de la maestria: "+añoMaestria+" numero de idiomas: "+numIdiomas+" especialidad: "+maestria; 
    }

    @Override
    public void presentacion() {
        super.presentacion();
        System.out.println("Curso una maestria actualmente");
    }

    @Override
    public void grado() {
        super.grado(); 
        System.out.println("el año de la maestria en el que me encuentro es: "+añoMaestria);
    }
}
