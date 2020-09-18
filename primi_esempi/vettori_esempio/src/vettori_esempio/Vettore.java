/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vettori_esempio;

/**
 *
 * @author Alessandro Bugatti
 */

//Il nome delle classi in Java per convenzione è maiuscolo
public class Vettore {
    //attributi
    private final int dimensione = 3;
    private int v[]; 
    
    //Metodo costruttore
    public Vettore()
    {
        //Crea un vettore nello heap
        v =  new int[dimensione];
        for (int i = 0; i < dimensione; i++)
            v[i] = 42;
        //io ho visto questo articolo su Internet
    }
    
    public void stampa()
    {
        for (int i = 0; i < dimensione; i++)
            System.out.println(v[i]);
    }
}
