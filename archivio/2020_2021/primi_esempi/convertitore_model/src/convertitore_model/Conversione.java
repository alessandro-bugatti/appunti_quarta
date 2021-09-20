/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package convertitore_model;

/**
 *
 * @author Alessandro Bugatti
 */
public class Conversione {
    private String da;
    private String verso;
    private double valore;

    public Conversione(String da, String verso, double value) {
        this.da = da;
        this.verso = verso;
        this.valore = value;
    }

    @Override
    public String toString() {
        return da + " -> " + verso;
    }
    
    double converti (double v)
    {
        return v * this.valore;
    }
    
}
