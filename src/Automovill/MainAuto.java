/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automovill;

/**
 *
 * @author juan
 */
public class MainAuto {
    public static void main(String[] args) {
  // Crear instancia de AutoMovil
        Automovil auto = new Automovil();
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setAnio(2023);
        auto.setColor("Blanco");

        System.out.println("Marca: " + auto.getMarca());
        auto.Prender();
        auto.Arrancar();

        System.out.println("\n--- Honda Civic ---");
        // Crear instancia de HondaCivic
        HondaCivic honda = new HondaCivic();
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setAnio(2024);
        honda.setColor("Rojo");

        System.out.println("Marca: " + honda.getMarca());
        honda.Prender(); // Método sobrescrito
        honda.Arrancar(); // Método sobrescrito
      
    }
}
