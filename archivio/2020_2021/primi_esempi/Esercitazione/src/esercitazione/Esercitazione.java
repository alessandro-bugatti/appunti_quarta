/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazione;

/**
 *
 * @author alex_2
 */
public class Esercitazione {

    static final int DIM = 100000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Per ogni metodo di ordinamento fare qualcosa di simile
        Vettore v = new Vettore(DIM);
        long inizio = System.nanoTime();
        v.selectionSort();
        long fine = System.nanoTime();
        System.out.println("Il tempo impiegato dall'Insertion Sort "
            + "per ordinare " + DIM + " elementi è stato di "
            + (fine - inizio)/1E9 + " secondi.");
    }
    
}
