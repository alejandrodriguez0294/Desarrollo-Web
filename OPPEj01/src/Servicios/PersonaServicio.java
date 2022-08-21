/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
      Persona p1 = new Persona();
       System.out.println("Ingrese el nombre de la persona ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona ");
        p1.setEdad(leer.nextInt());
        char sex;
        boolean band = true;
        while (band == true){
            System.out.println("Ingrese sexo valido, caracteres admitidos: 'H'(Hombre), 'M'(Mujer), 'O'(Otro)");
            sex = leer.next().charAt(0);
            if ( sex == 'H'|| sex == 'M' || sex == 'O' ){
                band = false; 
                
            }
                
        }
           
        
        
        System.out.println("Ingrese el peso de la persona, en formato '50,5(Kg)'");
        p1.setPeso(leer.nextDouble());
        
         System.out.println("Ingrese la altura , en formato '1,67(Mts))'");
        p1.setAltura(leer.nextDouble());
         
        return p1;
    }

    
    public int calcularIMC(Persona p){
    double pes = p.getPeso();
    double alt = p.getAltura();
    double pa = pes/(Math.pow(alt,2));
    int dev;
    
    if((pa)<20){
        dev= -1; 
        System.out.print("La persona está por debajo de su peso ideal"); 
        
    }else if((pa)>=20 && ((pa)<=25)){
        dev= 0;
        System.out.print("La persona está en su peso ideal");
        
    }else{
        dev=1;
        System.out.print("La persona tiene sobrepeso");
        
    }
    return dev;     
    }

    public void esMayorDeEdad(Persona p){
       
        
        if (p.getEdad() >= 18){
            System.out.println(" y es mayor de edad");
            
        }else{
            System.out.println(" y es menor de edad");
            
        }

      
          
      }
        
    }
    
   

