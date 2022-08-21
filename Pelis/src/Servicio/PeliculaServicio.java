/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class PeliculaServicio {
    Scanner  leer = new Scanner(System.in);
    Scanner  leer2 = new Scanner(System.in);
    ArrayList<Pelicula> ListaPeli = new ArrayList<>();
    
    private Pelicula crearPelicula (){
      System.out.println("Introducir titulo");
      String titulo = leer.nextLine();
      System.out.println("Introducir director");
      String director = leer.nextLine();
      System.out.println("Introducir duracion de la peliculas (solamente horas)");
      Integer duracion = leer2.nextInt();
      System.out.println("Ingresar minutos de la pelicula");
      Double minutos = (leer2.nextDouble())/60;
      if (minutos > 0.42){
          duracion = duracion + 1 ;
      
      }else{
          
      }
       System.out.println(minutos);
      Pelicula p = new Pelicula(titulo, director, duracion);
      ListaPeli.add(p);
      return p;
        
        
    }
    
    public void crearLista(){
        System.out.println("¿Desea crear una pelicula?");
        System.out.println("Ingrese si o no");
        String op = leer.nextLine();

        if (null == op) {
            System.out.println("Respuesta no valida");
            System.exit(0);
        } else switch (op) {
            case "si":
            case "SI":
            case "Si":
                boolean band = false;
                while (band == false) {
                    crearPelicula();
                    System.out.println("¿Desea crear otra pelicula?");
                    System.out.println("Ingrese si o no");
                    String op2 = leer.nextLine();
                    if ("si".equals(op2) || "SI".equals(op) || "Si".equals(op)) {
                        
                    } else if ("no".equals(op2) || "NO".equals(op) || "No".equals(op)) {
                        band = true;
                        
                    }
                }break;
            case "no":
            case "NO":
            case "No":
                System.exit(0);
            default:
                System.out.println("Respuesta no valida");
                System.exit(0);
        }
    }

          
    
    public void menormayor(){
      Collections.sort(ListaPeli, Comparadores.ordenarMenorMayor); 
      MostrarPeli();
        
        
    }
    public void MostrarPeli(){
        System.out.println(ListaPeli.toString());
       
        
    }
    
    
    public void Pelimayor1hora(){
        for (Pelicula pelicula : ListaPeli) {
            if (pelicula.getDuracion()>1 ){
                System.out.println(pelicula);
            }
            
        }
    }
    
    
    public void mayormenor(){
       Collections.sort(ListaPeli, Comparadores.ordenarMayorMenor);
       MostrarPeli();
    }
    
    
    public void ordenarTitulo(){
        Collections.sort(ListaPeli, Comparadores.ordenarPorTitulo);
        MostrarPeli();
    }
    
    public void ordenarDirector(){
        Collections.sort(ListaPeli, Comparadores.ordenarPorDirector);
        MostrarPeli();
    }
}
