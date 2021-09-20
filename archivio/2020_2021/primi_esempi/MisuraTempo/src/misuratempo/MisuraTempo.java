/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misuratempo;

/**
 *
 * @author alex_2
 */
public class MisuraTempo {

    static final int N = 1000000000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long inizio = System.nanoTime();
        //Codice da misurare
        //Esempio
        long a = 0;
        for (int i = 0; i < N; i++)
            a += i*i;
        long fine = System.nanoTime();
        System.out.println("Tempo impiegato: " + 
                (fine - inizio) + " ns >= " +
                (fine - inizio)/1E9 + " secondi");
    }
    
}
