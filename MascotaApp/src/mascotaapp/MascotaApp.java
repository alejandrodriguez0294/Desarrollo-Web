/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import Servicio.MascotaServicio;
import Utilidades.Comparadores;
import entidades.Mascota;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Alejandro
 */
public class MascotaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     ArrayList<Mascota> mascotas = new ArrayList();
     mascotas.add (new Mascota("Moro", "Morito", "Perro"));
     mascotas.add (new Mascota("Pepa", "Lola", "Gata"));
     mascotas.add (new Mascota("Luna", "Lunita", "Gata"));
     for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
        System.out.println("ACA SE ORDENAN POR Z-A");
     
     
     Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
     
     
     Collections.shuffle(mascotas);
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
     
     
    }
}

      
      
      
        
        
    


    

