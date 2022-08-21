/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main6;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CafeteraServicio cs = new CafeteraServicio();
    Cafetera c1 = cs.crearcafetera();
    Scanner leer = new Scanner(System.in);
    boolean band= false;
    while( band == false){
        System.out.println("*** SELECCIONE UNA OPCION ***");
        System.out.println("1.Llenar cafetera");
        System.out.println("2.Servir taza");
        System.out.println("3.Vaciar cafetera");
        System.out.println("4.Agregar cafe");
        System.out.println("5.Salir");
        System.out.println("Cantidad Maxima "+c1.getCapacidadMax());
        System.out.println("Cantidad Actual: "+c1.getCantidaddAct());
     int op = leer.nextInt();
     switch (op) {
         case 1: cs.llenarCafetera(c1);
         break;
         case 2: cs.servirTaza(c1);
         break;
         case 3: cs.vaciarCafetera(c1);
         break;    
         case 4: cs.agregarCafe(c1);
         break;
         case 5: band = true;
         break;
         default: System.out.println("Opcion no valida, reintente");
     }  
    } 
    
    }
    
}
