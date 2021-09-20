/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es_23;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Alessandro Bugatti
 */
public class AnagraficaClienti {
    private HashMap<String, Cliente> clienti;
    
    public AnagraficaClienti() {
        this.clienti = new HashMap<>();
    }
       
    public void aggiungi(String codice, String nome, String cognome,
            String indirizzo, String citta)
    {
        this.clienti.put(codice, new Cliente(codice, nome, cognome, 
            indirizzo, citta));
    }
    
    public void aggiungi(Cliente c)
    {
        this.clienti.put(c.getCodice(), c);
    }
    
    public Cliente ricercaPerCodice(String codice)
    {
        return this.clienti.get(codice);
    }
}
