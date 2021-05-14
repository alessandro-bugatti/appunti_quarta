/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es_23;

import java.time.LocalDateTime;

/**
 *
 * @author Alessandro Bugatti
 */
public class Telefonata {
    private String telefono;
    private String codiceCliente;
    private String codiceDipendente;
    private LocalDateTime istanteChiamata;
    static private AnagraficaClienti clienti;
    static private AnagraficaDipendenti dipendenti;
    
    public Telefonata(String telefono, String codiceCliente, String codiceDipendente) {
        this.telefono = telefono;
        this.codiceCliente = codiceCliente;
        this.codiceDipendente = codiceDipendente;
        this.istanteChiamata = LocalDateTime.now();
    }
    
    static void setAnagraficaClienti(AnagraficaClienti a)
    {
        clienti = a;
    }
    
    static void setAnagraficaDipendenti(AnagraficaDipendenti a)
    {
        dipendenti = a;
    }
    
    @Override
    public String toString() {
        String s = "Informazioni\n";
        s += clienti.ricercaPerCodice(this.codiceCliente);
        return s;
    }
    
    
    
    
}
