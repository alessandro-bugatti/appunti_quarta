/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziorettangolo;

/**
 *
 * @author alex_2
 */
public class EsercizioRettangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto a = new Punto(5,3);
        Punto b = new Punto();
        Punto c = new Punto(a);
        Punto d = new Punto(10, 13);
        Rettangolo e = new Rettangolo(a,d);
        Rettangolo f = new Rettangolo(e);
            
    }
    
}
