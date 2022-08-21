/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serivicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class CuentaServicio {
    
  public Cuenta crearCuenta(){
   Scanner leer = new Scanner(System.in);      
   Cuenta c1 = new Cuenta();
      System.out.println("Ingrese N° de cuenta");
      c1.setCuenta(leer.nextInt());
      System.out.println("Ingrese N° de DNI");
      c1.setDni(leer.nextLong());
      System.out.println("Ingrese saldo");
      c1.setSaldo(leer.nextInt());
      
   return c1; 
}
 
public void ingresar(Cuenta c1){
    double dinero = c1.getSaldo() ;
    Scanner leer = new Scanner(System.in); 
    System.out.println("Ingrese dinero a ingresar");
    dinero = dinero + leer.nextInt();
    c1.setSaldo(dinero);
}
public void retirar(Cuenta c1){
    double dinero =c1.getSaldo() ;
    Scanner leer = new Scanner(System.in); 
    System.out.println("Ingrese dinero a retirar");
    dinero = dinero - leer.nextInt();
    
    if (dinero <= c1.getSaldo()){
     c1.setSaldo(dinero);
    }else{
        c1.setSaldo(0);
    }
}  
 public void extracionrapida(Cuenta c1){
    double dinero = c1.getSaldo();
    double porcentaje = (dinero * 0.20);
    Scanner leer = new Scanner(System.in); 
    System.out.println("Ingrese dinero a extraer"); 
    dinero = dinero - leer.nextInt();
    if (dinero >= porcentaje ) {
        System.out.println("No se puede extraer mas del 20%");
    } 
    else{
    System.out.println("Se retira plata");
    }
 }
public void consultarsaldo(Cuenta c1){
    System.out.println("El saldo es: "+ c1.getSaldo() );
    
}
public void consultardatos(Cuenta c1){
    System.out.println("Cuenta N°:"+ c1.getCuenta());
    System.out.println("DNI: "+ c1.getDni());
    System.out.println("Saldo: $"+c1.getSaldo());
}



}
