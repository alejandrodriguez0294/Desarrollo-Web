/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libros;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ServicioLibros {
    Scanner  leer = new Scanner(System.in);
    ArrayList<Libros> Libro =  new ArrayList();
   

   public Libros CrearLibro(){
       System.out.println("Ingrese titulo del libro");
       String titulo = leer.nextLine();
       Libros l = new Libros (titulo);
       Libro.add(l);
       return l; 
   }
    
   public void MostrarTitulos(){
       System.out.println(Libro);
       System.out.println(Libro.toString());
       System.out.println("Cantidad: "+ Libro.size());
   }
   
}
