/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import Utilidad.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class PerroServicio {
    
    Scanner  leer = new Scanner(System.in);
    Scanner  leer2 = new Scanner(System.in);
    ArrayList<Perro> ListaPerro = new ArrayList<>();
    
    
    public Perro crearRaza(){
      System.out.println("Introducir raza");
      String raza = leer.next();
      Perro m = new Perro(raza);
      ListaPerro.add(m);
      return m;
    }
    
    public void MostrarLista (){
        System.out.println(ListaPerro); 
    }
    
    public void ordenarRaza(){
      Collections.sort(ListaPerro, Comparadores.ordenarPorNombre);  
        
        
    }
    
    public void eliminarRaza (){
        System.out.println("Ingrese raza a eliminar");
        String elim = leer2.next();
      
       Iterator<Perro> it = ListaPerro.iterator();
       while (it.hasNext()){
           if (it.next().getRaza().equals(elim)){
               it.remove();
           }
       }
           
        
        

        
}
       
}

