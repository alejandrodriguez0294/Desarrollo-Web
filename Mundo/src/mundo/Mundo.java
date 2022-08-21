/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import Servicio.PaisServicio;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio(); 
        ps.crearConjunto();
        
}
}
