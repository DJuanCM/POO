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
public class MainBiblioteca {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        
        Prestamo prestar = new Prestamo();
        Usuario usuario = new Usuario("",0,0);
        
        Libro libro1 = new Libro();
        
        
        usuario.nombre = "Abel";
        libro1.titulo = "Principito";
        libro1.autor = "Antoine";
        libro1.ISBN = "13: 978-8498381498";
        libro1.disponible = true;
        
        Libro libro2 = new Libro("Donquijote", "Miguel", "12: 323-423423434", false);
        Libro libro3 = new Libro("100 Stars", "Pablo", "12: 312-7362912344", true);
        
        System.out.println("===BIENVENIDO AL SISTEMA DE LA BIBLIOTECA===");
        System.out.println("Usuario: ");
        System.out.println("Bienvenido señor: " + usuario.nombre);
        System.out.println("Los Libros son: ");
        System.out.println(libro1.titulo);
        System.out.println(libro2.titulo);
        System.out.println(libro3.titulo);
        System.out.println("Elige el libro disponible que vas a coger prestado");
        int eleccion = s.nextInt();
        
        switch (eleccion) {
            case 1:
                if(libro1.disponible == true){
                System.out.println("Libro seleccionado: " + libro1.ConsultarDisponibilidad(libro1.disponible));
                
                System.out.println("Desea cogerlo prestado? :");
                System.out.println("[1] Si");
                System.out.println("[2] No");
                eleccion = s.nextInt();
                
                if(eleccion == 1){
                 prestar.prestarLibro();
                }else{
                    System.out.println("Desea devolverlo? :");
                    
                    System.out.println("[1] Si");
                    System.out.println("[2] No");
                    eleccion = s.nextInt();
                    
                    if(eleccion ==1 ){
                        prestar.devolverLibro();
                        break;
                    }else{
                    System.out.println("Pase Feliz resto del dia");
                    break;
                    }

                }
                
                
                
                }
                else{
                    System.out.println("Ese libro no esta disponible");
                    System.out.println("===Pase Feliz Resto del Dia===");
                    break;
                
                }
                
                break;
            case 2: 
                if(libro2.disponible == true){
                System.out.println("Libro seleccionado: " + libro2.ConsultarDisponibilidad(libro2.disponible));
                
                System.out.println("Desea cogerlo prestado ");
                System.out.println("[1] Si");
                System.out.println("[2] No");
                eleccion = s.nextInt();
                
                if(eleccion == 1){
                 prestar.prestarLibro();
                }else{if(eleccion == 1){
                 prestar.prestarLibro();
                }else{
                    System.out.println("Desea devolverlo? :");
                    
                    System.out.println("[1] Si");
                    System.out.println("[2] No");
                    eleccion = s.nextInt();
                    
                    if(eleccion ==1 ){
                        prestar.devolverLibro();
                        break;
                    }else{
                    System.out.println("Pase Feliz resto del dia");
                    break;
                    }

                }
                }
                
                
                
                }
                else{
                    System.out.println("Ese libro no esta disponible");
                    System.out.println("===Pase Feliz Resto del Dia===");
                break;
                }
                break;
            case 3:
                if(libro3.disponible == true){
                System.out.println("Libro seleccionado: " + libro3.ConsultarDisponibilidad(libro3.disponible));
                
                System.out.println("Desea cogerlo prestado ");
                System.out.println("[1] Si");
                System.out.println("[2] No");
                eleccion = s.nextInt();
                
                if(eleccion == 1){
                 prestar.prestarLibro();
                }else{if(eleccion == 1){
                 prestar.prestarLibro();
                }else{
                    System.out.println("Desea devolverlo? :");
                    
                    System.out.println("[1] Si");
                    System.out.println("[2] No");
                    eleccion = s.nextInt();
                    
                    if(eleccion ==1 ){
                        prestar.devolverLibro();
                        break;
                    }else{
                    System.out.println("Pase Feliz resto del dia");
                    break;
                    }

                }
                }
                
                
                
                }
                else{
                    System.out.println("Ese libro no esta disponible");
                    System.out.println("===Pase Feliz Resto del Dia===");
                break;
                }                
                
                break;
            default:
                throw new AssertionError();
        }
        System.out.println();
        
    }
   
}
