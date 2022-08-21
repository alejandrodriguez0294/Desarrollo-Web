/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
     
    public Ahorcado crearJuego(){
        Ahorcado ah = new Ahorcado();
        ah.setLetencontradas(0);
        System.out.println("Ingrese palabra");
        String var = leer.nextLine();
        int tam = var.length();
        char [] aux = new char [tam];
       
       
        for (int i = 0; i < tam; i++) {
          aux[i]  = var.charAt(i);
          
          
        }
        ah.setPalabra(aux);
        System.out.println("Ingrese cantidad de intentos");
        ah.setJugadamax(leer2.nextInt());
        
        return ah;
        
    }
    
    public void longitud(Ahorcado ah) {
      
        int length = ah.getPalabra().length;
        System.out.println(length);
}
    
    public void encontradas(Ahorcado ah, char let){
        char [] aux3 = ah.getPalabra();
        int length2 = aux3.length;
        for (int i = 0; i < ah.getPalabra().length; i++) {
         if (aux3[i] == let) {
             ah.setLetencontradas(ah.getLetencontradas()+1);
             System.out.println("La letra pertenece");
             System.out.println("Cantidad de encontradas: "+ ah.getLetencontradas()+ "faltan: "+ (length2-ah.getLetencontradas()));
             
         }else{
            ah.setJugadamax(ah.getJugadamax()-1);
             System.out.println("La letra no pertenece");
             System.out.println("Intentos restantes: " + ah.getJugadamax());
         }
            
        }
         
        
    }
    
    public void intentos(Ahorcado ah){
        System.out.println(ah.getJugadamax());
        
    }
    
    public void juego(Ahorcado ah){
        boolean band = false;
        
        while (ah.getJugadamax() > 0 && band == false ){
            
            System.out.println("Ingrese una letra"); 
            char let = leer2.next().charAt(0);
            this.longitud(ah);
            
            this.encontradas(ah, let);
            this.intentos(ah);
            if (ah.getLetencontradas()==ah.getPalabra().length){
                band = true; 
            }
            
            
        }
        
    }
    
    
    
}
