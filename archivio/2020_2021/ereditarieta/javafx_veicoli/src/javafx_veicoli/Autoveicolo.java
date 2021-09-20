/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafx_veicoli;

/**
 *
 * @author Alessandro Bugatti
 */
public class Autoveicolo extends Veicolo{
     private String alimentazione;
    private String gas;
    private double potenza;
    
    public Autoveicolo(String targa, 
                        String marca, 
                        String modello, 
                        int annoImmatricolazione, 
                        int numPasseggeri, 
                        String alimentazione, 
                        String gas, 
                        double potenza)
    {
        super(targa, marca, modello, annoImmatricolazione, numPasseggeri);
        this.alimentazione = alimentazione;
        this.gas = gas;
        this.potenza = potenza;
    }
    
    
    @Override
    public double calcolaTassa(){
        double a = 0;
        if (alimentazione == "Elettrica")
            return 0;
        if (gas == "GPL")
            return potenza * 0.75;
        if (gas == "metano")
            return potenza * 0.5;
        if (gas == "gas idrogeno"){
            for (int i = 0; i < super.getAnnoImmatricolazione(); i++)
                a += 0.1;
            return a;
        }
        return potenza * 2.5;
    }

    @Override
    public String toString() {
        return "Autoveicolo{" + super.toString() + ", alimentazione = " + alimentazione + ", gas = " + gas + ", potenza = " + potenza + '}';
    }
}
