/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author kenic
 */
public class Usuario {
    //Usuario: con nombre, ID único y una colección de libros prestados.

    String nombre;
    int ID, coleccion;
    
    public Usuario(){
    
    }
    
    public Usuario(String nombre, int ID, int coleccion){
    this.nombre = nombre;
    this.ID = 0;
    this.coleccion = 0;
    }


}
