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
public class Telefonata implements Comparable<Telefonata>{
    private String telefono;
    private String codiceCliente;
    private String codiceDipendente;
    private LocalDateTime istanteChiamata;
    private String note;
        
    public Telefonata(String telefono, String codiceCliente,
            String codiceDipendente, String note) {
        this.telefono = telefono;
        this.codiceCliente = codiceCliente;
        this.codiceDipendente = codiceDipendente;
        this.note = note;
        this.istanteChiamata = LocalDateTime.now();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getCodiceDipendente() {
        return codiceDipendente;
    }

    public void setCodiceDipendente(String codiceDipendente) {
        this.codiceDipendente = codiceDipendente;
    }

    public LocalDateTime getIstanteChiamata() {
        return istanteChiamata;
    }

    public void setIstanteChiamata(LocalDateTime istanteChiamata) {
        this.istanteChiamata = istanteChiamata;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Telefonata{" + "telefono=" + telefono + ", codiceCliente=" + codiceCliente + ", codiceDipendente=" + codiceDipendente + ", istanteChiamata=" + istanteChiamata + ", note=" + note + '}';
    }
    
    @Override
    public int compareTo(Telefonata t)
    {
        return this.codiceDipendente.compareTo(t.codiceDipendente);
    }
}
