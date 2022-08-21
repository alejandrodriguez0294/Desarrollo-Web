/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main4;

import Entidad.Rectangulo;
import Servicio.RectanguloService;

/**
 *
 * @author Alejandro
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      RectanguloService rs = new RectanguloService();
      Rectangulo r1 = rs.crearRectangulo();
      int ancho = r1.getBase();
      int alto = r1.getAltura();
        System.out.println("La Superficie es: "+ rs.Superficie(r1));
        System.out.println("El Perimetro es: "+ rs.Perimetro(r1));
        for (int fila = 0; fila <=alto-1; fila++) {
           for (int columna = 0; columna <= ancho-1; columna++) {
               if ( fila == 0 || fila == alto-1 || columna == 0 || columna == ancho-1 ){
                   System.out.print("* ");  
               }else{
                   System.out.print("  ");
               }  
            }
       System.out.println("");       
        
        }
    }
}
