/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automovill;

/**
 *
 * @author juan
 */
    /*Requisitos:
Debe heredar de la clase AutoMovil usando extends
Imprimir el nombre de la clase en el constructor: "Constructor de HondaCivic"
Sobrescribir dos métodos de la clase padre*/
    
public class HondaCivic extends Automovil{
    

    public HondaCivic(){
        super();
        System.out.println("Constructor de Honda Civic");
        
    }
    
    public HondaCivic(String marca, String modelo, String color, int anio, boolean prendido){
        super("Honda","Civic",color,anio,prendido);
        System.out.println("Constructor de Honda Civic");
    }
    
 
    
   @Override
   public void Prender(){
         if(super.getPrendido() != false){
        System.out.println("El carro esta encendido");
        }else{
            System.out.println("Prendiendo carro");
            super.setPrendido(true);
        }
   }
   
    @Override
    public void Apagar(){
    if(super.getPrendido() != true){
        System.out.println("El carro esta apagado");
    }else{
        System.out.println("Apagando el carro...");
        super.setPrendido(false);
    }
    
    }
    
    
    
   
    
}
