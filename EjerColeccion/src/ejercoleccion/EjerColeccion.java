/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercoleccion;

import Servicio.ServicioLibros;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Alejandro
 */
public class EjerColeccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ServicioLibros sl = new ServicioLibros();
    sl.CrearLibro();
     sl.CrearLibro();
      sl.CrearLibro();
     sl.MostrarTitulos();
  
    }
}
    
    

    

   