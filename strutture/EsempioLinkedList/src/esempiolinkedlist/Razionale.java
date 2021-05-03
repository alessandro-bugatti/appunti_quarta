/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempiolinkedlist;

/**
 * Questa classe rappresenta dei numeri razionali, 
 * sempre ridotti ai minimi termini
 * @author Basile Mirko, Maffi Daniele, Fusari Cristian
 */
public class Razionale {
    
    private int numeratore;
    private int denominatore;
    
    /**
     * Definisce il numeratore e il denominatore della frazione
     * @param a numeratore della frazione
     * @param b denominatore della frazione
     */
    Razionale(int a, int b)
    {
        this.numeratore = a;
        this.denominatore = b;
        semplifica(this);
    }
    
    /**
     * Inizializza una frazione senza passaggio di parametri, utilizzando quelli di default (numeratore - 0, denominatore - 1)
     */
    Razionale()
    {
        this.numeratore = 0;
        this.denominatore = 1;
    }
    
    private int comuneDenominatore(Razionale r)
    {
        return this.denominatore * r.denominatore;
    }
    
    /**
     * esegue la somma tra due frazioni
     * @param r frazione che si andrà a sommare all'oggetto
     * @return la somma tra le due frazioni
     */
    public Razionale addizione(Razionale r)
    {
        int d = 0;
        Razionale c = new Razionale();
        if (this.denominatore != r.denominatore)
            d = comuneDenominatore(r);
        else
            d = this.denominatore;
        c.numeratore = d/r.denominatore*r.numeratore + d/this.denominatore*this.numeratore;
        c.denominatore = d;
        semplifica(c);
        return c;
    }
    
    /**
     * esegue la differenza tra due frazioni
     * @param r frazione che si andrà a sottrarre all'oggetto
     * @return la differenza tra le due frazioni
     */
    public Razionale sottrazione(Razionale r)
    {
        int d = 0;
        Razionale c = new Razionale();
        if (this.denominatore != r.denominatore)
            d = comuneDenominatore(r);
        else
            d = this.denominatore;
        c.numeratore = - d/r.denominatore*r.numeratore + d/this.denominatore*this.numeratore;
        c.denominatore = d;
        semplifica(c);
        return c;
    }
    
    /**
     * esegue la moltiplicazione tra due frazioni
     * @param r frazione che si andrà a moltiplicare all'oggetto
     * @return la moltiplicazione tra le due frazioni
     */
    public Razionale moltiplicazione(Razionale r)
    {
        Razionale c = new Razionale();
        c.numeratore = this.numeratore * r.numeratore;
        c.denominatore = this.denominatore * r.denominatore;
        semplifica(c);
        return c;
    }
    
    /**
     * esegue la divisione tra due frazioni
     * @param r frazione che si andrà a dividere all'oggetto
     * @return la divisione tra le due frazioni
     */
    public Razionale divisione(Razionale r)
    {
        Razionale c = new Razionale();
        c.numeratore = this.numeratore * r.denominatore;
        c.denominatore = this.denominatore * r.numeratore;
        semplifica(c);
        return c;
    }
    /**
     * Algoritmo di Euclide per il calcolo del MCD
     * 
     */
    private static int MCD(int a, int b)
    {
        if (b == 0)
            return a;
        return MCD (b, a%b);
    }
    
    /**
     * Semplifica una frazione passata
     * @param r frazione da semplificare
     */
    private static void semplifica(Razionale r)
    {
        int i = MCD(r.numeratore, r.denominatore);
        r.numeratore /= i; 
        r.denominatore /= i;
        /*int i;
        boolean semplificato = false;
        if (r.numeratore < r.denominatore)
            i = r.numeratore;
        else 
            i = r.denominatore;
        while(!semplificato)
        {
            if (r.numeratore % i == 0 && r.denominatore % i == 0)
            {
                r.numeratore /= i; 
                r.denominatore /= i;
                semplificato = true;
            }
            i--;
        }*/
    }

    @Override
    public boolean equals(Object obj) {
        //Controlla se l'oggetto passato è se stesso 
        //Questo caso a.equals(a) e ritorna true
        if (this == obj) {
            return true;
        }
        //Controlla se l'oggetto passato esiste
        //Questo caso a.equals(null) e ritorna false
        if (obj == null) {
            return false;
        }
        //Controlla che siano della stessa classe
        //Se non lo sono ritorna false
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Razionale other = (Razionale) obj;
        //Se i numeratori sono diversi i razionali sono
        //diversi
        if (this.numeratore != other.numeratore) {
            return false;
        }
        //Se i denominatori sono diversi i razionali sono
        //diversi
        if (this.denominatore != other.denominatore) {
            return false;
        }
        return true;
    }
    
    /**
     * Stampa la frazione
     * @return una stringa contenente la frazione
    */
    @Override
    public String toString()
    {
        String s = this.numeratore + "/" + this.denominatore;
        return s;
    }
   
    
}
