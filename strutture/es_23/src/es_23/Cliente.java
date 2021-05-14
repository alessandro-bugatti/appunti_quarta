/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es_23;

/**
 *
 * @author Alessandro Bugatti
 */
public class Cliente {
    private String codice;
    private String nome;
    private String cognome;
    private String indirizzo;
    private String citta;

    public Cliente(String codice, String nome, String cognome, String indirizzo, String citta) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codice=" + codice + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", citta=" + citta + '}';
    }
    
    
}
