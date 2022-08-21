/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class RectanguloService {
   public Rectangulo crearRectangulo(){
      Rectangulo r1 = new Rectangulo();
      Scanner leer = new Scanner(System.in);  
      System.out.println("Ingrese la base del rectangulo ");
       r1.setBase(leer.nextInt());
       System.out.println("Ingrese la altura del rectangulo ");
       r1.setAltura(leer.nextInt());
       
       return r1;
}
   public int Superficie(Rectangulo r1){
       int superficie;
       superficie = r1.getBase()*r1.getAltura();
       return superficie;
       
   }
   public int Perimetro(Rectangulo r1){
       int Perimetro;
       Perimetro = (r1.getBase() + r1.getAltura())*2;
       return Perimetro;
   }

}
   


