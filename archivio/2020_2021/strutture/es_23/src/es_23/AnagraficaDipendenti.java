/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es_23;

import java.util.HashMap;

/**
 *
 * @author Alessandro Bugatti
 */
public class AnagraficaDipendenti {
    private HashMap<String, Dipendente> dipendenti;
    
    public AnagraficaDipendenti() {
        this.dipendenti = new HashMap<>();
    }
       
    public void aggiungi(String codice, String nome, String cognome)
    {
        this.dipendenti.put(codice, new Dipendente(codice, nome, cognome));
    }
    
    public void aggiungi(Dipendente d)
    {
        this.dipendenti.put(d.getCodice(), d);
    }
    
    public Dipendente ricercaPerCodice(String codice)
    {
        return this.dipendenti.get(codice);
    }
}
