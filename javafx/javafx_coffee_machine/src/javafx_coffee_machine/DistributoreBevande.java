/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafx_coffee_machine;

import java.text.DecimalFormat;

/**
 *
 * @author Alessandro Bugatti
 * Esempio semplice di una classe per la gestione
 * della distribuzione di bevande, 
 * che dovrebbe poter essere compresa da tutti.
 * Chi volesse può migliorarla e renderla più flessibile
 */

public class DistributoreBevande {
    private String bevandaScelta;
    private int zucchero;
    private int maxZucchero;
    private String[] etichetteZucchero;
    private double prezzo;
    private double soldiMancanti;
    
    public DistributoreBevande(int maxZucchero) {
        bevandaScelta = "Caffè";
        this.zucchero = 0;
        this.maxZucchero = maxZucchero;
        etichetteZucchero = new String[this.maxZucchero + 1];
        etichetteZucchero[0] = "Niente zucchero";
        etichetteZucchero[1] = "Poco zucchero";
        etichetteZucchero[2] = "Zucchero normale";
        etichetteZucchero[3] = "Molto zucchero";
        etichetteZucchero[4] = "Zucchero a palate";
       
    }

    public void setBevandaScelta(String bevandaScelta) {
        this.bevandaScelta = bevandaScelta;
        if (this.bevandaScelta == "Caffè")
        {
            prezzo = 0.5;
            soldiMancanti = 0.5;
        }
        else if (this.bevandaScelta == "Cappuccino")
        {
            prezzo = 1.0;
            soldiMancanti = 1.0;
        }
        else if (this.bevandaScelta == "Cioccolato")
        {
            prezzo = 1.2;
            soldiMancanti = 1.2;
        }
        else if (this.bevandaScelta == "Mokkaccino")
        {
            prezzo = 0.8;
            soldiMancanti = 0.8;
        }
    }
    
    public void aumentaZucchero()
    {
        if (this.zucchero < this.maxZucchero)
            this.zucchero++;
    }
    
    public void diminuisciZucchero()
    {
        if (this.zucchero > 0)
            this.zucchero--;
    }
    
    public void setZucchero(int valore)
    {
        this.zucchero = valore;
    }

    public String getZucchero()
    {
        return this.etichetteZucchero[zucchero];
    }   
         
    
    public double getSoldiMancanti()
    {
        return this.soldiMancanti;
    }
    
    public double getPrezzo()
    {
        return this.prezzo;
    }
    
    public boolean inserisciMoneta(double moneta)
    {
        //Eventuali controlli sulla correttezza della 
        //moneta, lasciati al lettore
        this.soldiMancanti = this.soldiMancanti - moneta;
        return true;
    }
    
    @Override
    public String toString() {
        String s =  "Prendi il tuo " + this.bevandaScelta
                + " con " + 
                this.etichetteZucchero[this.zucchero];
        DecimalFormat formatter = new DecimalFormat("#0.00");
        String resto = formatter.format(-this.soldiMancanti);
        if (this.soldiMancanti < 0)
            s += " Il tuo resto è di " + resto + " euro.";
        else
            s += " Nessun resto";
        return s;
    }
    
    
    
}
