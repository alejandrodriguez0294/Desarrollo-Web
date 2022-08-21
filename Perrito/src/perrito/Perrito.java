/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perrito;

import Servicio.PerroServicio;
import Utilidad.Comparadores;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Perrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer2 = new Scanner(System.in);
        Scanner leer3 = new Scanner(System.in);
        PerroServicio ps = new PerroServicio();

        boolean band = false;
        while (band == false) {
            System.out.println("Ingrese 1 para agregar raza y 2 para salir");
            int op = leer2.nextInt();
            switch (op) {
                case 1:
                    ps.crearRaza();
                    break;

                case 2:
                    band = true;
                    
                    ps.ordenarRaza();
                    ps.MostrarLista();
                    break;
                default:
                    System.out.println("No valida");
                    
            }
        
        }
        ps.eliminarRaza();
        ps.MostrarLista();
    }

}
