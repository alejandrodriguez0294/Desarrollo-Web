/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.entidades.servicios.ServicioMascota;



/**
 *
 * @author Alejandro
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioMascota sm = new ServicioMascota();
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1);
        
        
        
    }
    
}
