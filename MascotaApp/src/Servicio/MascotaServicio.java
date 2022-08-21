                                                                /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class MascotaServicio {
    private Scanner  leer = new Scanner(System.in);
    private ArrayList<Mascota> mascotas; 

    public MascotaServicio() {
        this.mascotas = new ArrayList();
    }

   
  public Mascota crearMascota (){
      System.out.println("Introducir nombre");
      String nombre = leer.next();
      System.out.println("Introducir apodo");
      String apodo = leer.next();
      System.out.println("Introducir tipo");
      String tipo = leer.next();
      Mascota m = new  Mascota(nombre, apodo, tipo);
      mascotas.add(m);
      return m;

}
  
 public void fabricaMascota(int cantidad){
     for (int i = 0; i < cantidad; i++) {
        Mascota mascotaCreada =  crearMascota(); 
         System.out.println(mascotaCreada.toString());
     }
     
     
     
 } 
  
  public void agregarMascota(Mascota m){
    
      mascotas.add(m);
      
  
      
  }
 public void mostrarMascotas (){
     System.out.println("Las mascotas actuales de las lista son: ");
     for (Mascota aux : mascotas) {
         System.out.println(aux.toString());
     }
     System.out.println("Cantidad = "+ mascotas.size());
 } 
   
public void fabricarChiquitos( int cantidad){
    for (int i = 0; i < cantidad; i++) {
        
        mascotas.add(new Mascota ("Fer", "Chiquito", "Beagle")); 
        
    }
} 

public void eleminarPorNombre (String nombre){
     for (int i = 0; i < mascotas.size(); i++) {
        
         
        Mascota m = mascotas.get(i);
        if (m.getNombre().equals(nombre)){
            mascotas.remove(i);
        }
    }
}
}
