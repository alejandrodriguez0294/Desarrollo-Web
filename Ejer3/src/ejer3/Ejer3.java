/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author Alejandro
 */
public class Ejer3 {

  
    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Operacion op1 = os.crearOperacion();
        System.out.println("La suma es: " + os.Sumar(op1));
        System.out.println("La resta es: " + os.Restar(op1));
        
        if (os.Multiplicar(op1)== 0){
         System.out.println("No se admite multiplicacion por 0 ");
        }else{
         System.out.println("La multiplicacion es : " +  os.Multiplicar(op1));  
        }
        if (os.Dividir(op1)== 0){
         System.out.println("No se admite division por 0 ");
        }else{
         System.out.println("La division es : " +  os.Dividir(op1));  
        }
        
        
    }
    
}
