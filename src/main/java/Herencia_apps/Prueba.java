/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia_apps;
import java.util.Scanner;
import java.lang.Thread;
/**
 *
 * @author Jesus Andres
 */
public class Prueba {
private static int op;
private static int radio;
private static int base;
private static int altura;
private static int baseMenor;
private static double perimetro;
private static double area;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bienvenido al programa Figuras con herencia");
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("\nIngrese la figura que desee crear"
                    + "\n1. Circulo"
                    + "\n2. Triangulo"
                    + "\n3. Cuadrado"
                    + "\n4. Rectangulo"
                    + "\n5. Trapecio"
                    + "\n6. Salir");
        System.out.println("\nIngrese la opcion deseada: ");
        op = sc.nextInt();
        switch(op){
            case 1: 
                System.out.println("Ingrese el valor del radio: ");
                radio = sc.nextInt();
                Circulo circulo=new Circulo(radio);
                area=circulo.area();
                perimetro=circulo.perimetro();
                System.out.println("\nLos datos del circulo son "+
                        "\n    El radio es de: "+radio+
                        "\n    El perimetro es de: "+perimetro+
                        "\n    El area es de: "+area);
                Thread.sleep(8000);
                break;
            case 2:
                System.out.println("Ingrese el valor de la base: ");
                base= sc.nextInt();
                System.out.println("Ingrese el valor de la altura: ");
                altura= sc.nextInt();
                Triangulo triangulo=new Triangulo(base,altura);
                area=triangulo.area();
                perimetro=triangulo.perimetro();
                System.out.println("\nLos datos del triangulo son "+
                        "\n    La base es de: "+base+
                        "\n    La altura es de: "+altura+
                        "\n    El perimetro es de: "+perimetro+
                        "\n    El area es de: "+area);
                Thread.sleep(8000);
                break;
            case 3:
                System.out.println("Ingrese el valor de la base: ");
                base= sc.nextInt();
                Cuadrado cuadrado=new Cuadrado(base);
                area=cuadrado.area();
                perimetro=cuadrado.perimetro();
                System.out.println("\nLos datos del cuadrado son "+
                        "\n    La base es de: "+base+
                        "\n    El perimetro es de: "+perimetro+
                        "\n    El area es de: "+area);
                Thread.sleep(8000);
                break;
            case 4:
                System.out.println("Ingrese el valor de la base: ");
                base= sc.nextInt();
                System.out.println("Ingrese el valor de la altura: ");
                altura= sc.nextInt();
                Rectangulo rectangulo=new Rectangulo(base,altura);
                area=rectangulo.area();
                perimetro=rectangulo.perimetro();
                System.out.println("\nLos datos del rectangulo son "+
                        "\n    La base es de: "+base+
                        "\n    La altura es de: "+altura+
                        "\n    El perimetro es de: "+perimetro+
                        "\n    El area es de: "+area);
                Thread.sleep(8000);
                break;
            case 5:
                System.out.println("Ingrese el valor de la base mayor: ");
                base= sc.nextInt();
                System.out.println("Ingrese el valor de la altura: ");
                altura= sc.nextInt();
                System.out.println("Ingrese el valor de la base menor: ");
                baseMenor= sc.nextInt();
                Trapecio trapecio=new Trapecio(base,altura,baseMenor);
                area=trapecio.area();
                perimetro=trapecio.perimetro();
                System.out.println("\nLos datos del rectangulo son "+
                        "\n    La base mayor es de: "+base+
                        "\n    La base menor es de: "+baseMenor+
                        "\n    La altura es de: "+altura+
                        "\n    El perimetro es de: "+perimetro+
                        "\n    El area es de: "+area);
                Thread.sleep(8000);
                break;
            case 6:
                System.out.println("\nDecidio salir del programa");
        }
        }
        while(op!=6);
    }

    
    
    
    
    
}
