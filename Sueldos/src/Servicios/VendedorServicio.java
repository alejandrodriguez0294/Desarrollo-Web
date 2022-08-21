/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class VendedorServicio {

    public Vendedor altaVendedor() {
        Vendedor v1 = new Vendedor();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia que comenzo a trabajar ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes que comenzo a trabajar ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el anio que comenzo a trabajar ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    public void SueldoMensual(Vendedor v1) {
        System.out.println("Ingrese ventas toaltes del vendedor");
        Scanner leer = new Scanner(System.in);
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo del vendedor" + v1.getNombre() + "es de $" + v1.getSueldoMensual());

    }

    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        System.out.println("La fecha de hoy es: " +hoy);
        int antiguedad = hoy.getYear()-v1.getFechaInicio().getYear();
        System.out.println(antiguedad);
        if (antiguedad <5 ) {
            System.out.println("Le corresponde 14 dias de vacaciones ");
        } else if (antiguedad < 10){
            System.out.println("Le corresponde 21 dias de vacaciones");
        } else if (antiguedad < 20){
            System.out.println("Le corresponde 28 dias de vacaciones");
        } else if (antiguedad > 20){
            System.out.println("Le corresponde 35 dias de vacaciones");
            
    } else {
            System.out.println("El empleado tien vacaciones proporcionales");
        }
}
}
