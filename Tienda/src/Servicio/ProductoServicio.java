/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidad.Producto;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ProductoServicio {
    Scanner  leer = new Scanner(System.in); // leer numeros
    Scanner  leer2 = new Scanner(System.in); // leer letras
    HashMap<Integer,Producto> MapProductos = new HashMap();
    
    public void cargarProductos() {
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next();
        System.out.println("Ingrese el precio del producto");
        Double precio = leer2.nextDouble();
        Producto pro = new Producto(nombre, precio);
        System.out.println("Ingrese codigo del producto");
        Integer llave = leer2.nextInt();
        MapProductos.put(llave, pro);    
    }
    
    
    
    
    public void Actualizar (){
        System.out.println("Ingresar codigo del producto a actualizar");
        Integer llave = leer2.nextInt();
        for (Map.Entry<Integer, Producto> entry : MapProductos.entrySet()) {
            Integer key = entry.getKey();
            Producto value = entry.getValue();
            if (key == llave){
                System.out.println("Ingresar precio nuevo");
                 Double precionuevo = leer2.nextDouble();
                 value.setPrecio(precionuevo);
                 System.out.println("Producto actualizado");
                 System.out.println("");
            } else{
                System.out.println("Codigo de producto no encontrado, verifique");
                System.out.println("");
            }
        }
    }
    
    public void Eliminar(){
        System.out.println("Ingresar codigo del producto a eliminar");
        Integer llave = leer2.nextInt();
        for (Iterator<Integer> iterator = MapProductos.keySet().iterator(); iterator.hasNext();) {
            Integer key = iterator.next();
            if (key == llave) {
                iterator.remove();
                System.out.println("Producto eliminado");
                System.out.println("");
                
            } else{
                System.out.println("Codigo de producto no encontrado, verifique");
                System.out.println("");
            }
            
            

    }
    }
    
    
    
    public void Mostrar(){
        for (Map.Entry<Integer, Producto> entry : MapProductos.entrySet()) {
            
            System.out.println("Nombre del producto: " + entry.getValue().getNombre() + " Precio: " + entry.getValue().getPrecio() );
        }
        }
    
    
   public void Menu (){
       boolean salir = false;
        int op; 
        while (!salir){
            System.out.println("1. Añadir producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            
          try { 
             
              System.out.println("Introduce el numero de la opcion elegida: ");
                op = leer.nextInt(); 
              
              
            switch (op) { 
               case 1 : cargarProductos();
                   break;
               case 2: Mostrar();
                   break;
               case 3:  Actualizar (); 
                   break;
               case 4: Eliminar();
                   break;
               case 5:  salir = true; 
               break;
               default:
                   System.out.println("Opcion no valida, las opciones son entre 1 y 5");
        }
    
        }
        catch(InputMismatchException e){
        System.out.println("----- SOLAMENTE SE ACEPTAN NUMEROS -----");
        leer.next();
    }
    }
    }
   }
    

