/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaperro;

import Servicio.PersonaPerroServicio;

/**
 *
 * @author Alejandro
 */
public class PersonaPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaPerroServicio pp = new PersonaPerroServicio();
        for (int i = 0; i < 2; i++) {
          pp.crearPersona();
        }
        
    }
    
}
