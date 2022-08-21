/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        Persona p1 = new Persona();
        System.out.println("Ingrese nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese tu dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese tu mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese tu año de nacimiento");
        int anio = leer.nextInt();
        Date fecha = new Date (anio-1900,mes,dia);
        p1.setFecha(fecha);     
        return p1;   
    }
    public void calcularEdad(Persona p1){
    Date fechaact = new Date();    
    int difanio = fechaact.getYear() - p1.getFecha().getYear(); 
    int difmes = fechaact.getMonth() - p1.getFecha().getMonth(); 
    int difdia = fechaact.getDay()- p1.getFecha().getDay(); 
    if  ( difmes < 0 || (difmes == 0 && difdia < 0)){
      difanio = difanio - 1;  
    }   
    p1.setEdad(difanio); 
    
    }
    
     public void menorQue(Persona p1){
       boolean band= true; 
    System.out.println("Ingrese edad a comparar");
     int edad2 = leer.nextInt();
     if ( p1.getEdad() > edad2  ){
         System.out.println(band);
     } 
     }  

    public void mostrarPersona(Persona p1) {
        System.out.println("Nombre: "+ p1.getNombre());
        System.out.println("Fecha de nacimiento: "+ p1.getFecha().getDate()+"/"+p1.getFecha().getMonth()+"/"+ p1.getFecha().getYear());
        System.out.println("Edad: "+ p1.getEdad());
    }
}




