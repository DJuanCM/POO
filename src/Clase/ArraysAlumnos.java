/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;
import java.util.Scanner;
/**
 *
 * @author kenic
 */
public class ArraysAlumnos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Alumno[] alum = new Alumno[5];
// Pide los datos de los alumnos /////////////////////////////////
System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumno.");

String nombreIntroducido;
double notaIntroducida;

for(int i = 0; i < 5; i++) {
alum[i] = new Alumno();
System.out.println("Alumno " + i);
System.out.print("Nombre: ");
nombreIntroducido = s.next();
(alum[i]).setNombre(nombreIntroducido);
System.out.print("Nota media: ");
notaIntroducida = s.nextDouble();
alum[i].setNotamedia(notaIntroducida);
} // for i
// Muestra los datos de los alumnos /////////////////////////////////

System.out.println("Los datos introducidos son los siguientes:");
double sumaDeMedias = 0;
for(int i = 0; i < 5; i++) {
System.out.println("Alumno " + i);
System.out.println("Nombre: " + alum[i].getNombre());
System.out.println("Nota media: " + alum[i].getNotamedia());
System.out.println("----------------------------");

sumaDeMedias += alum[i].getNotamedia();
} // for i
System.out.println("La media global de la clase es " + sumaDeMedias / 5);
    }
}
