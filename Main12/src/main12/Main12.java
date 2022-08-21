/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main12;

import Servicio.AlumnoServicio;
import java.util.ArrayList;


/**
 *
 * @author Alejandro
 */
public class Main12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    AlumnoServicio as = new AlumnoServicio();

        as.crearLista();
        as.MostrarListaAlumno();
        as.notaFinal();
       
        
        
}
}
