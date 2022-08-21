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
public class Ahorcado {
    private char [] palabra;
    private int letencontradas;
    private int jugadamax;  

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int jugadamax) {
        this.palabra = palabra;
        this.jugadamax = jugadamax;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetencontradas() {
        return letencontradas;
    }

    public void setLetencontradas(int letencontradas) {
        this.letencontradas = letencontradas;
    }

    public int getJugadamax() {
        return jugadamax;
    }

    public void setJugadamax(int jugadamax) {
        this.jugadamax = jugadamax;
    }

   

    
    
    
}
