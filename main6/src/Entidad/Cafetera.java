/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Alejandro
 */
public class Cafetera {
   private int capacidadMax;
   private int cantidaddAct;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax, int cantidaddAct) {
        this.capacidadMax = capacidadMax;
        this.cantidaddAct = cantidaddAct;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCantidaddAct() {
        return cantidaddAct;
    }

    public void setCantidaddAct(int cantidaddAct) {
        this.cantidaddAct = cantidaddAct;
    }
          
    
}
