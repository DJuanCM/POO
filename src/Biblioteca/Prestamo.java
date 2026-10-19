/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;
import java.time.LocalDate;
/**
 *
 * @author kenic
 */
public class Prestamo {
    //Préstamo: registra la fecha, el usuario y el libro asociado.

    LocalDate fecha = LocalDate.now();
    
    
    void prestarLibro(){
        System.out.println("Se presto este libro. Fecha de prestamo:  " + fecha);
    }
    
    void devolverLibro(){
        System.out.println("Gracias por devolver el libro. Fecha de devuelta: " + fecha);
    }
    
    
}
