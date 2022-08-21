/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class AlumnoServicio {
    
     Scanner  leer = new Scanner(System.in); // uso para leer letras
     Scanner  leer2 = new Scanner(System.in); // uso para leer numeros
     ArrayList<Alumno> Listaalum = new ArrayList<>();
     
     
     public Alumno crearAlumno(){
      ArrayList<Integer> notas = new ArrayList<>();
      System.out.println("Introducir nombre del alumno");
      String nombre = leer.next();
      
       Integer n ; 
         System.out.println("Ingrese nota 1");
         n = leer2.nextInt();
         notas.add(n);
         System.out.println("Ingrese nota 2");
         n = leer2.nextInt();
         notas.add(n);
         System.out.println("Ingrese nota 3");
         n = leer2.nextInt();
         notas.add(n);
         
      Alumno a = new Alumno (nombre, notas);
      Listaalum.add(a);
      return a; 
     }
     
     
     
     public void crearLista(){
         System.out.println("¿Desea crear alumno?");
         System.out.println("Ingrese si o no");
         String op = leer.next();
          
         if (op.equals("si")){
          boolean band = false; 
          while (band == false){
              crearAlumno();
              System.out.println("¿Desea crear otro alumno?");
              System.out.println("Ingrese si o no");
              String op2 = leer.next();
              if (op2.equals("si")){
                  
              } else {
                  band = true;
              }
          } 
          
         } else{
         
 
         }}
         
     
     
     
     
     
     public void MostrarListaAlumno(){
         System.out.println(Listaalum);
     }
     
     
     public void notaFinal (){
      
        Scanner  leer3 = new Scanner(System.in);
        System.out.println("Ingrese Alumno a buscar");
        String buscar = leer3.next();
        
       
         for (int i = 0; i < Listaalum.size(); i++) {
           Alumno m = Listaalum.get(i);
           if (m.getNombre().equals(buscar)){
             Integer p = 0;
               for (int j = 0; j < m.getNotas().size(); j++) {
                     p = p + m.getNotas().get(j);
               }
               System.out.println(" El promedio del alumno "+m.getNombre()+ " es: " + p / 3);
                
                
               } else{
               System.out.println("Alumno no existe o mal escrito");
           }
       
           }
             
         }
             
                     
         }
                 
             
             
         
        
           
                   
       
         
         
     
     
    

