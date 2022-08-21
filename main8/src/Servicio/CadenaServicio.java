/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class CadenaServicio {
  Scanner leer = new Scanner(System.in);
  public Cadena crearCadena(){
   Cadena c1 = new Cadena(); 
      System.out.println("Ingrese frase");
      c1.setFrase(leer.nextLine());
      c1.setLongitud(c1.getFrase().length());
   return c1;
   
}
  
 public void mostrarVocales(Cadena c1){
     
     int conta = 0;
     int conte = 0;
     int conti = 0;
     int conto = 0;
     int contu = 0;
     
     for (int i = 0; i < c1.getLongitud(); i++) {
            switch (c1.getFrase().substring(i,i + 1)){
                case "a" : conta = conta + 1 ; 
                    break;
                case "e": ; conte = conte + 1 ;
                    break;  
                case "i": conti = conti + 1 ;
                    break;
                case "o": conto = conto + 1 ;
                    break;
                case "u": contu = contu + 1 ;
                    break;

                }
            
        }
     System.out.println(conta+ "A " + conte+"E "+conti+"I "+conto+"O "+contu+"U");
 }
 public void invertir (Cadena c1){
     String str = c1.getFrase();
		System.out.println(c1.getFrase());
		StringBuilder strb = new StringBuilder(str);
		str = strb.reverse().toString();
		System.out.println(str);
 }
 
 public void buscarLetra (Cadena c1){
     int contlet =0;
     System.out.println("Ingrese letra a buscar");
     char let = leer.next().charAt(0);
     for (int i = 0; i < c1.getLongitud(); i++) {
         if (let == (c1.getFrase().charAt(i))){
             
            contlet= contlet + 1 ;
             
         }
     }
     System.out.println(contlet);
 }
 public void compararLongitud(Cadena c1){
    Scanner leer2 = new Scanner(System.in);
     System.out.println("Ingrese frase nueva");
     String c2 = leer2.nextLine();
     if (c2.length()== c1.getLongitud()){
         System.out.println("Son igual de largas");
         
     }else{
         System.out.println("No tiene la misma longitud de larga ");
     }
     
    
 }
 
 public void unir (Cadena c1){
     Scanner leer2 = new Scanner(System.in);
     System.out.println("Ingrese frase para unir");
     String c3 = leer2.nextLine();
     c3= c3.concat(c1.getFrase());
     System.out.println(c3);
     
     
 }
 public void reemplazar(Cadena c1){
     Scanner leer3 = new Scanner(System.in);
     String codificado = "";
        System.out.println("Ingrese letra a reemplazar por a");
        String let = leer3.nextLine();
        for (int i = 0; i < c1.getLongitud(); i++) {
            switch (c1.getFrase().substring(i,i + 1)){
                case "a": codificado = codificado.concat(let);
                 break;  
                default: codificado = codificado.concat(c1.getFrase().substring(i,i +1));
                    break;  
                    
            }  
          }   
     System.out.println(codificado);
     
     
 }
 
 public void verificar (Cadena c1){
     Scanner leer4 = new Scanner(System.in);
     String codificado = "";
        System.out.println("Ingrese letra a verificar");
        String ver = leer4.nextLine();
     
     System.out.println(c1.getFrase().contains(ver));
     
 }
 
 
}

