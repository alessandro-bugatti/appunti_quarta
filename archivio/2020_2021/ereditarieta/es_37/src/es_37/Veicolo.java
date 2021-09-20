package es_37;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro Bugatti
 */
abstract public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int annoImmatricolazione;
    private int numPasseggeri;
    
    public Veicolo(String targa, String marca, String modello, int annoImmatricolazione, int numPasseggeri){
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.annoImmatricolazione = annoImmatricolazione;
        this.numPasseggeri = numPasseggeri;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }
    
    //Obbliga le classi che ereditano a ridefinirlo
    abstract public double calcolaTassa();
    
    @Override
    public String toString() {
        return "" + "Targa = " + targa + ", marca = " + marca + ", modello = " + modello + ", anno di immatricolazione = " + annoImmatricolazione + ", numero di passeggeri = " + numPasseggeri;
    }
    
    
}
