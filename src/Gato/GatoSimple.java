/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gato;

/**
 *
 * @author kenic
 */
public class GatoSimple {
    
    String raza, color, sexo;
    int edad;
    double peso;
    
    
    public GatoSimple(String s){
    this.sexo= s;
    }
    
    String getSexo(){
    return this.sexo;
    }
    
    void maullar(){
        System.out.println("Miauu");
    }
    
    void Ronronear(){
    
        System.out.println("Mrrrrr");
    }
    
    void Molesto(){
    
        System.out.println("Grrrrrr");
    }
    
    void come(String comida){
        if(comida == "tuna"){
            maullar();
            
        }else{
        Molesto();
        }
    
    }
        
    
    void peleaCon(GatoSimple contrincante){
    if(this.sexo == "hembra"){
        System.out.println("Soy delicada para pelear");
    
    }else{
        if (contrincante.getSexo() == "hembra") {
            System.out.println("No peleo con hembra");
        }else{System.out.println("Te voy a partir todo");
        }
        
    }
    
    
    
    }
    
}
