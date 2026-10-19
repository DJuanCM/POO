/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;
import java.util.Scanner;
/**
 *
 * @author kenic
 */
public class Libro {
    //título, autor, ISBN y disponible (booleano).
    
    String titulo, autor, ISBN;
    boolean disponible;
    
    public Libro(String titulo, String autor, String ISBN, boolean disponible){
    this.titulo = titulo;
    this.autor = autor;
    this.ISBN = ISBN;
    this.disponible = false;
    }
    
    public Libro() {
    }
    Scanner s = new Scanner(System.in);
        
    boolean ConsultarDisponibilidad(boolean disponible){
    if(disponible = true){
        System.out.println("El libro esta disponible");
    }
    else{
        System.out.println("El libro no esta disponible");
    }
    
    return this.disponible;}
    
    
    
}
