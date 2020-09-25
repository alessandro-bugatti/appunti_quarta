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
    private int dimensione;
    private int v[]; 
    
    //Metodo costruttore
    public Vettore()
    {
        dimensione = 100000;
        //Crea un vettore nello heap
        v =  new int[dimensione];
        for (int i = 0; i < dimensione; i++)
            v[i] = (int)(Math.random()*1000000) + 1;
    }
    
    public Vettore(int dim)
    {
        dimensione = dim;
        //Crea un vettore nello heap
        v =  new int[dimensione];
        for (int i = 0; i < dimensione; i++)
            v[i] = (int)(Math.random()*1000000) + 1;
    }
    
    public int somma()
    {
        int temp = 0;
        for (int i = 0; i < dimensione;i++)
            temp += v[i];
        return temp;
    }
    
    public int get(int pos)
    {
        if (pos < 0 || pos >= dimensione)
            return -1;
        return v[pos];
    }
    
    public boolean set(int n, int pos)
    {
        if (pos < 0 || pos >= dimensione)
            return false;
        v[pos] = n;
        return true;
    }
    
    public int ricercaEsaustiva(int cercato)
    {
        for (int i = 0; i < this.dimensione; i++)
            if (v[i] == cercato)
                return i;
        return -1;
    }
    
    public void selectionSort()
    {
        for (int i = 0; i < this.dimensione - 1; i++)
        {
            int pos_scambio = i;
            for (int j = i+1; j < this.dimensione; j++)
            {
                if (v[j] < v[pos_scambio])
                    pos_scambio = j;   
            }
            int minore = v[pos_scambio];
            v[pos_scambio] = v[i];
            v[i] = minore;   
        }
    }
    
    public void bubbleSort()
    {
        
    }
    
    public void stampa()
    {
        System.out.print(v[0]);
        for (int i = 1; i < dimensione; i++)
            System.out.print(" - " + v[i]);
        System.out.println("");
    }
}
