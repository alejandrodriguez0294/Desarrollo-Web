/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

/**
 *
 * @author Alejandro
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Integer posiactual;
     Integer posialeatoria;  
        
     posiactual = (int) (Math.random() * 7);
      posialeatoria = (int) (Math.random() * 7);
      System.out.println( posiactual + " " + posialeatoria );
    }
    
}
