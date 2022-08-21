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
public class Armadura {
   private int botaizq;;
   public String estadobotaizq;
   private int botader;;
   public String estadobotader;
   private int guanteizq;
   public String estadoguanteizq;
   private int guantedere;
   public String estadoguantedere;
   private int sintetizador;
   public String estadosint;
   private int consola;
   public String estadocon;
   private int bateria;

    public Armadura() {
    }

    public Armadura(String estadobotaizq, String estadobotader, String estadoguanteizq, String estadoguantedere, String estadosint, String estadocon, int bateria) {
        this.estadobotaizq = estadobotaizq;
        this.estadobotader = estadobotader;
        this.estadoguanteizq = estadoguanteizq;
        this.estadoguantedere = estadoguantedere;
        this.estadosint = estadosint;
        this.estadocon = estadocon;
        this.bateria = bateria;
    }

    public Armadura(int botaizq, String estadobotaizq, int botader, String estadobotader, int guanteizq, String estadoguanteizq, int guantedere, String estadoguantedere, int sintetizador, String estadosint, int consola, String estadocon, int bateria) {
        this.botaizq = botaizq;
        this.estadobotaizq = estadobotaizq;
        this.botader = botader;
        this.estadobotader = estadobotader;
        this.guanteizq = guanteizq;
        this.estadoguanteizq = estadoguanteizq;
        this.guantedere = guantedere;
        this.estadoguantedere = estadoguantedere;
        this.sintetizador = sintetizador;
        this.estadosint = estadosint;
        this.consola = consola;
        this.estadocon = estadocon;
        this.bateria = bateria;
    }

    public int getBotaizq() {
        return botaizq;
    }

    public void setBotaizq(int botaizq) {
        this.botaizq = botaizq;
    }

    public String getEstadobotaizq() {
        return estadobotaizq;
    }

    public void setEstadobotaizq(String estadobotaizq) {
        this.estadobotaizq = estadobotaizq;
    }

    public int getBotader() {
        return botader;
    }

    public void setBotader(int botader) {
        this.botader = botader;
    }

    public String getEstadobotader() {
        return estadobotader;
    }

    public void setEstadobotader(String estadobotader) {
        this.estadobotader = estadobotader;
    }

    public int getGuanteizq() {
        return guanteizq;
    }

    public void setGuanteizq(int guanteizq) {
        this.guanteizq = guanteizq;
    }

    public String getEstadoguanteizq() {
        return estadoguanteizq;
    }

    public void setEstadoguanteizq(String estadoguanteizq) {
        this.estadoguanteizq = estadoguanteizq;
    }

    public int getGuantedere() {
        return guantedere;
    }

    public void setGuantedere(int guantedere) {
        this.guantedere = guantedere;
    }

    public String getEstadoguantedere() {
        return estadoguantedere;
    }

    public void setEstadoguantedere(String estadoguantedere) {
        this.estadoguantedere = estadoguantedere;
    }

    public int getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(int sintetizador) {
        this.sintetizador = sintetizador;
    }

    public String getEstadosint() {
        return estadosint;
    }

    public void setEstadosint(String estadosint) {
        this.estadosint = estadosint;
    }

    public int getConsola() {
        return consola;
    }

    public void setConsola(int consola) {
        this.consola = consola;
    }

    public String getEstadocon() {
        return estadocon;
    }

    public void setEstadocon(String estadocon) {
        this.estadocon = estadocon;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
   
}


