/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main5;

import Entidad.Cuenta;
import Serivicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean band = false;
        CuentaServicio cs = new CuentaServicio();
        Cuenta c1 = cs.crearCuenta();
        while (band == false) {
            System.out.println();
            System.out.println("Selecione una opcion: ");
            System.out.println("1.Ingresar dinero: ");
            System.out.println("2.Retirar dinero : ");
            System.out.println("3.Extracion Rapida: ");
            System.out.println("4.Consultar Saldo: ");
            System.out.println("5.Consultar Datos: ");
            System.out.println("6.Salir ");
         Scanner leer = new Scanner(System.in); 
        int op = leer.nextInt();
        switch (op){
            case 1: cs.ingresar(c1);
            break;
            case 2:  cs.retirar(c1);
            break;
            case 3: cs.extracionrapida(c1);
            break;
            case 4: cs.consultarsaldo(c1);
            break;
            case 5: cs.consultardatos(c1);
            break;
            case 6: band = true;
            break;
            default: System.out.println("Opcion no valida");
            
        }

       }
    
}
}
