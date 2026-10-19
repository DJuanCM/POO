/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gato;

/**
 *
 * @author kenic
 */
public class GatoSimplemain {
    
    public static void main(String[] args) {
        
 GatoSimple gato = new GatoSimple("macho");
 
        System.out.println("Hola gatito");
        gato.maullar();
        System.out.println("toma tarta");
        gato.come("tarta");
        System.out.println("Ostras, toma tuna");
        gato.come("tuna");
        System.out.println("Pelfe");
        
       GatoSimple varon = new GatoSimple("Varon");
       GatoSimple hembra = new GatoSimple("hembra");
       
       varon.peleaCon(hembra);
       hembra.peleaCon(varon);
       varon.peleaCon(gato);
        
    }
}
