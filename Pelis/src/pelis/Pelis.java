/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelis;

import Servicio.PeliculaServicio;

/**
 *
 * @author Alejandro
 */
public class Pelis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PeliculaServicio ps = new PeliculaServicio ();
       ps.crearLista();
       System.out.println("---TODAS LAS PELICULAS---");
       ps.MostrarPeli();  
       System.out.println("---PELICULAS CON DURACION MAYOR A UNA HORA---");
       ps.Pelimayor1hora();
       System.out.println("---PELICULAS  ORDENADAS POR DURACION DESCENDENTE---");
       ps.mayormenor();
       System.out.println("---PELICULAS ORDENADAS POR DURACION ASCENDENTE---");
       ps.menormayor();
       System.out.println("---PELICULAS ORDENADAS POR TITULO---");
       ps.ordenarTitulo();
       System.out.println("---PELICULAS ORDENADAS POR DIRECTOR---");
       ps.ordenarDirector();
      
    }
    
}
