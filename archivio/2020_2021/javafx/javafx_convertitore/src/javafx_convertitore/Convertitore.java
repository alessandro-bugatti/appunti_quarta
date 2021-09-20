/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafx_convertitore;

/**
 *
 * @author Alessandro Bugatti
 */
public class Convertitore {
    private Conversione conv[];
    private int quanti;
    private final static int N = 100;

    public Convertitore(){ 
         this.conv = new Conversione[N];
         quanti = 0;
    }
    
    void aggiungi (Conversione c)
    {
        this.conv[quanti] = c;
        quanti++;
    }
    
    String[] getElenco()
    {
        String s[];
        s = new String[this.quanti];
        for (int i = 0; i < this.quanti; i++)
            s[i] = this.conv[i].toString();
        return s;   
    }
    
    double converti(String conversione, double valore)
    {
        for (int i = 0; i < this.quanti; i++)
            if (conversione.equals(this.conv[i].toString()))
                return this.conv[i].converti(valore);
        return -1;
    }
}
