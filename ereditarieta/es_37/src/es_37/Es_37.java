/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_37;

/**
 *
 * @author alex_2
 */
public class Es_37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //NOn si possono creare oggetti di classi astratte
        //Veicolo v = new Veicolo("AN676HH", "FIAT", "Punto", 2019, 5);
        //Però possono essere usate come riferimento per una classe concreta
        Veicolo auto = new Autoveicolo("AN676HH", "FIAT", "Punto", 2019, 5,
                            "Benzina","Metano",44.5);
        System.out.println("Calcolo della tassa: " + auto.calcolaTassa());
        Veicolo moto = new Motoveicolo("AN676HH", "FIAT", "Punto", 
                2019, 5, 44.5);
        System.out.println("Calcolo della tassa: " + moto.calcolaTassa());
        
        Veicolo veicoli[];
        veicoli = new Veicolo[10];
        for (int i = 0; i < veicoli.length; i++)
        {
            int scelta = (int)(Math.random()*2);
            if (scelta == 0)
                veicoli[i] = new Autoveicolo("AN676HH", "FIAT", "Punto", 2019, 5,
                            "Benzina","Metano",44.5);
            else
                veicoli[i] = new Motoveicolo("RT935GG", "Honda", "CBR", 
                2020, 2, 44.5);
        }
        for (int i = 0; i < veicoli.length; i++)
            System.out.println("Tassa per il veicolo " + (i+1) + ": "
            + veicoli[i].calcolaTassa());
    }
    
}
