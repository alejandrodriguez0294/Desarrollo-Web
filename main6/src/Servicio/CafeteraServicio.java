/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class CafeteraServicio {
    public Cafetera crearcafetera(){
    Scanner leer = new Scanner(System.in);    
     Cafetera c1 = new Cafetera();
        System.out.println("Ingrese Capacidad Maxima de Cafetera");
        c1.setCapacidadMax(leer.nextInt());
        System.out.println("Ingrese Cantidad Actual");
        c1.setCantidaddAct(leer.nextInt());
     return c1;   
    }
 public void llenarCafetera(Cafetera c1){
     c1.setCantidaddAct(c1.getCapacidadMax());
 }
    
   public void servirTaza(Cafetera c1){
       Scanner leer = new Scanner(System.in); 
       System.out.println("Ingrese tamaño de taza a servir");
       int tamaño = leer.nextInt();
       if (c1.getCantidaddAct() > tamaño ){
           System.out.println("Se lleno la taza");
           c1.setCantidaddAct(c1.getCantidaddAct()-tamaño);
       }else{
            System.out.println("La cantidad actual de café “no alcanza” para llenar la taza, la taza quedo en: " + (tamaño - c1.getCantidaddAct())) ;
       }
       
   }
   
   public void vaciarCafetera(Cafetera c1){
      c1.setCantidaddAct(0);
      
   }
   public void agregarCafe(Cafetera c1){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese cantidad agregar");  
       c1.setCantidaddAct(leer.nextInt());
   }
}


