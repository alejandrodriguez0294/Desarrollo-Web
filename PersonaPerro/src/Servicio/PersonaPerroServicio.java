/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class PersonaPerroServicio {
    
    private Scanner leer = new Scanner(System.in);
    private Scanner leer2 = new Scanner(System.in);
    public Persona crearPersona() {
        Persona per = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        per.setNombre(leer.nextLine());
        System.out.println("Ingrese apellido de la persona");
        per.setApellido(leer.nextLine());
        System.out.println("Ingrese edad de la persona ");
        per.setEdad(leer2.nextInt());
        System.out.println("Ingrese documento de la persona");
        per.setDocumento(leer2.nextInt());
        
        Perro perr = new Perro ();
        System.out.println("Ingrese nombre del perro");
        perr.setNombre(leer.nextLine());
        System.out.println("Ingrese raza del perro");
        perr.setRaza(leer.nextLine());
        System.out.println("Ingrese edad del perro");
        perr.setEdad(leer2.nextInt());
        System.out.println("Ingrese tamaño del perro");
        perr.setTamaño(leer2.nextInt());
        
        per.setPerro(perr);
        
        System.out.println(per.toString());
        return per;

    }

    
    
}
