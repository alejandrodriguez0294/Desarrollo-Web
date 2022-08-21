/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class PaisServicio {
     Scanner  leer = new Scanner(System.in); // leer numeros
    Scanner  leer2 = new Scanner(System.in); // leer letras
    HashSet<Pais> ConjPais = new HashSet();
    
    
    private Pais crearPais (){
        System.out.println("Ingrese nombre del pais");
        String pais = leer2.nextLine();
        Pais p = new Pais(pais);
        ConjPais.add(p);
        return p;
    }

    
    public void crearConjunto (){
        boolean salir = false;
        int op; 
        while (!salir){
            System.out.println("1. Añadir pais");
            System.out.println("2. Mostrar paises cargados");
            System.out.println("3. Eliminar pais");
            System.out.println("4. Salir");
            
          try { 
             
              System.out.println("Introduce el numero de la opcion elegida: ");
                op = leer.nextInt(); 
              
              
            switch (op) { 
               case 1 : crearPais();
                   break;
               case 2: Mostrar();
                   break;
               case 3:  Eliminar (); 
                   break;
               case 4: salir = true; 
                   break;
               default:
                   System.out.println("Opcion no valida, las opciones son entre 1 y 4");
        }
    
        }
        catch(InputMismatchException e){
        System.out.println("----- Opcion no valida, debes introducir un numero -----");
        leer.next();
    }
    }
    }
    
  public void Mostrar(){
      for (Pais ConjPai : ConjPais) {
          System.out.println(ConjPai);
          
      }
  }  
  
  public void Eliminar (){
         System.out.println("Ingrese pais a eliminar");
        String elim = leer2.next();
       Iterator<Pais> it = ConjPais.iterator();
       while (it.hasNext()){
           if (it.next().getPais().equals(elim)){
               it.remove();
               System.out.println("Se elimino pais: " + elim );
               System.out.println("");
  } else{
               System.out.println("No se encuentra pais ingresado");
               System.out.println("");
           }
            
  }
}
}
    
    
    
