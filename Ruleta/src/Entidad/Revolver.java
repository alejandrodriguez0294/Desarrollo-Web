/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Alejandro
 */
public class Revolver {
    private Integer posiactual;
    private Integer posialeatoria;
    
    public void llenarRevolver(){
        posiactual = (int) (Math.random() * 6);
        posialeatoria = (int) (Math.random() * 6);
        System.out.println( posiactual + " " + posialeatoria );
        
    }  
    public boolean mojar(){
        boolean igual = false;
        if (posiactual== posialeatoria) {
            igual=true;
        }
        return igual;
    }
    
    
}
