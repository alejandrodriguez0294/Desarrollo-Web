/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oppej01;

import Entidad.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Alejandro
 */
public class OPPEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contb = 0;
        int conti = 0;
        int conts = 0;  
        int cont =0; 
      PersonaServicio vs = new PersonaServicio(); 
      Persona p1 = vs.crearPersona();
      cont = vs.calcularIMC(p1); 
      vs.esMayorDeEdad(p1);
     
      if (cont == -1){
          contb = contb +1;
          
      } else if (cont == 0 ){
      conti = conti + 1;
      }else{
          conts = conts +1;
      }
    
      
      
      Persona p2 = vs.crearPersona();
      vs.calcularIMC(p2); 
      vs.esMayorDeEdad(p2);
      cont = vs.calcularIMC(p2); 
      if (cont == -1){
          contb = contb +1;
          
      } else if (cont == 0 ){
      conti = conti + 1;
      }else{
          conts = conts +1;
      }
      
      Persona p3 = vs.crearPersona();
      vs.calcularIMC(p3); 
      vs.esMayorDeEdad(p3);
      cont = vs.calcularIMC(p3); 
      if (cont == -1){
          contb = contb +1;
          
      } else if (cont == 0 ){
      conti = conti + 1;
      }else{
          conts = conts +1;
      }
      
      Persona p4 = vs.crearPersona();
      vs.calcularIMC(p4); 
      vs.esMayorDeEdad(p4);
      cont = vs.calcularIMC(p4); 
      if (cont == -1){
          contb = contb +1;
          
      } else if (cont == 0 ){
      conti = conti + 1;
      }else{
          conts = conts +1;
      }
     
        System.out.println(" ");
        System.out.println(" El porcentaje de bajo de peso es: "+ (contb*100/4) + "%"); 
        System.out.println(" El porcentaje de ideal de peso es: "+ (conti*100/4) + "%"); 
        System.out.println(" El porcentaje de sobrepeso es: "+ (conts*100/4) + "%"); 
        System.out.println("");
}
    
}
