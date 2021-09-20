/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertitore_model;

/**
 *
 * @author alex_2
 */
public class Convertitore_model {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //esempio di utilizzo del convertitore
        Convertitore c = new Convertitore();
        //Qui si aggiungono le varie conversioni
        //che possono anche essere recuperate da file
        c.aggiungi(new Conversione("Euro", "Dollaro", 1.233));
        c.aggiungi(new Conversione("Yen", "Euro", 233.3));
        c.aggiungi(new Conversione("Rublo", "Sterlina", 0.432));
        //Per farsi dare l'insieme delle conversioni possibili
        String elenco[] = c.getElenco();
        for (int i = 0; i < elenco.length; i++)
            System.out.println(elenco[i]);
        //Esempio di conversione, per recuperare quella che interessa
        //si passa la stringa che la rappresenta, come la 
        //fornisce la toString della conversione
        double valore = c.converti("Euro -> Dollaro", 232.34);
        System.out.println(valore);
    }    
    
}
