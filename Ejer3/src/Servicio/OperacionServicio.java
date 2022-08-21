/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class OperacionServicio {
    Scanner leer = new Scanner (System.in);
    public Operacion crearOperacion(){
    
    Operacion op1 = new Operacion();
    System.out.println("Ingrese numero 1 a calcular ");
     op1.setNumero1(leer.nextInt() );
     System.out.println("Ingrese numero 2 a calcular ");
      op1.setNumero2(leer.nextInt() );
       
    return op1;
}
  
  public int Sumar (Operacion op1) {
        int suma;
        suma = op1.getNumero1()+ op1.getNumero2();
        
        return suma; 
  }
  public int Restar (Operacion op1) {
        int resta;
        resta = op1.getNumero1() - op1.getNumero2();
        
        return resta; 
  }  
  public int Multiplicar (Operacion op1) {
        int multi = 0;
        if (   (op1.getNumero1() != 0) && (op1.getNumero2( )!= 0)) {
            
        multi = op1.getNumero1() * op1.getNumero2();
      
  }         
  return multi; 
}
  public int Dividir (Operacion op1) {
        int divi = 0;
        if (   (op1.getNumero1() != 0) && (op1.getNumero2( )!= 0)) {
            
        divi = op1.getNumero1() / op1.getNumero2();
      
  }         
  return divi; 
} 
  
}
