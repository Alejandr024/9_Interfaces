/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejemploAbtracta;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public interface Dieta {
    boolean alergias (String alimento);
    default String tipoDieta(String alimento){
        String dieta="Omnivoro";
        
        return dieta;
    }
    
    
    static void pedir(){
        System.out.println("Que alimento quieres pedir");
    }
}
