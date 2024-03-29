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
public class Dipendente {
    private String codice;
    private String nome;
    private String cognome;

    public Dipendente(String codice, String nome, String cognome) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
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

    @Override
    public String toString() {
        return "Dipendente{" + "codice=" + codice + ", nome=" + nome + ", cognome=" + cognome + '}';
    }
    
    
}
