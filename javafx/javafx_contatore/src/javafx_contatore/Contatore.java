/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafx_contatore;

/**
 *
 * @author Alessandro Bugatti
 */
public class Contatore {
    private int contatore;

    public Contatore() {
        this.contatore = 0;
    }
    
    void incrementa()
    {
        this.contatore++;
    }
    
    void reset()
    {
        this.contatore = 0;
    }

    @Override
    public String toString() {
        return "" + contatore;
    }
    
    
    
    
}
