/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main8;

import Entidad.Cadena;
import Servicio.CadenaServicio;

/**
 *
 * @author Alejandro
 */
public class Main8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CadenaServicio cs = new CadenaServicio();  
       Cadena c1 = cs.crearCadena();
       cs.mostrarVocales(c1);
       cs.invertir(c1);
      cs.buscarLetra(c1);
      cs.compararLongitud(c1);
      cs.unir(c1);
      cs.reemplazar(c1);
      cs.verificar(c1);
    }
    
}
