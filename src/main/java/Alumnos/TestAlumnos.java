
package Alumnos;
import java.util.ArrayList;
/**
 *
 * @author Jesus Andres
 */
public class TestAlumnos {
    public static void main(String[] args) {
        
        AlumnoPrimaria panchito=new AlumnoPrimaria('H', 12, "Francisco", 6);
        AlumnoPrimaria Gabi=new AlumnoPrimaria('M', 10, "Gabriela", 4);
        Gabi.presentacion();
        Gabi.randomGrado();
        Gabi.grado();
        Gabi.toString();
        AlumnoLicenciatura Armando=new AlumnoLicenciatura('H', 20, "Armando", 4, "Ingenieria", "computacion");
        AlumnoMaestria Teofilo=new AlumnoMaestria('H', 26, "Teofilo", 2, 3, "gestion empresas");
        AlumnoDoctorado Roberto=new AlumnoDoctorado('H',30, "Roberto", 1, 6, "Ondas y particulas");
        System.out.println("con ARRAYS");
        ArrayList<Alumnos> misAlumnos=new ArrayList <Alumnos>();
        misAlumnos.add(Gabi);
        misAlumnos.add(panchito);
        misAlumnos.add(Armando);
        misAlumnos.add(Teofilo);
        misAlumnos.add(Roberto);
        for(Alumnos a:misAlumnos)
        {
            a.grado();
            System.out.println(a.toString());
        }
    }
    
}
