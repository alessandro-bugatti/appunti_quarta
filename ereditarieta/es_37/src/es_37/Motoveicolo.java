/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es_37;

/**
 *
 * @author Alessandro Bugatti
 */
public class Motoveicolo extends Veicolo{
    private double potenza;
    
    public Motoveicolo (String targa, String marca, String modello, 
            int annoImmatricolazione, int numPasseggeri,
            double potenza){
        super(targa, marca, modello, annoImmatricolazione, numPasseggeri);
        this.potenza = potenza;
    }
    
    @Override
    public double calcolaTassa(){
        return potenza * 1.5;
    }

    @Override
    public String toString() {
        return "Motoveicolo{" + super.toString() + ", potenza = " + potenza + '}';
    }
}
