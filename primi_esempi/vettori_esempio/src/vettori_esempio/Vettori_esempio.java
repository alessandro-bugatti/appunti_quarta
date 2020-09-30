/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vettori_esempio;

import java.util.Random;

/**
 *
 * @author alex_2
 */
public class Vettori_esempio {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vettore v1, v2;
        v1 = new Vettore();
        v2 = new Vettore(10);
        int  s = v1.somma();
        //v1.v[3] = 7; NO
        
        //if (v1.set(3, -1) == false)
        //    System.out.println("Assegnamento non riuscito");;
        //v1.stampa();
        //System.out.println("Somma v1 = " + v1.somma());
        //v2.stampa();
        //System.out.println("Somma v2 = " + v2.somma());
        v1.insertionSort();
        System.out.println("Ordinato");
        //v1.stampa();
        //System.out.println(v1.media());
    }
    
}
