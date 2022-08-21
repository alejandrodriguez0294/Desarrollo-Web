/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import Entidad.Perro;
import java.util.Comparator;

/**
 *
 * @author Alejandro
 */
public class Comparadores {
    
    public static Comparator<Perro> ordenarPorNombre = new Comparator<Perro>() {
       
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getRaza().compareTo(o2.getRaza());
        }
    }; 
    
    
    
    
}