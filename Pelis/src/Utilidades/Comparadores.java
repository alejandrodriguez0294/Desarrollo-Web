/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Alejandro
 */
public class Comparadores {
    public static Comparator<Pelicula> ordenarMayorMenor = new Comparator<Pelicula>() {
       
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    
    
     public static Comparator<Pelicula> ordenarMenorMayor = new Comparator<Pelicula>() {
       
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
     
     
     public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
       
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
    public static Comparator <Pelicula> ordenarPorDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
         return o1.getDirector().compareTo(o2.getDirector());
        }
        
    }; 
    
}
