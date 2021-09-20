/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es_33;

import java.util.Objects;

/**
 *
 * @author Alessandro Bugatti
 */
abstract public class Abitazione {
 /**
 *
 * @author basil
 */
    private int stanze;
    private int superficie;
    private String indirizzo;
    private String citta;

    public Abitazione(int stanze, int superficie, String indirizzo, String citta) {
        this.stanze = stanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public Abitazione(Abitazione a) {
        this.stanze = a.stanze;
        this.superficie = a.superficie;
        this.indirizzo = a.indirizzo;
        this.citta = a.citta;

    }

    public int getStanze() {
        return stanze;
    }

    public int getSuperficie() {
        return superficie;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setStanze(int stanze) {
        this.stanze = stanze;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        //Up casting esplicito
        final Abitazione other = (Abitazione) obj;
        if (this.stanze != other.stanze) {
            return false;
        }
        if (this.superficie != other.superficie) {
            return false;
        }
        if (!this.indirizzo.equals(other.indirizzo)) {
            return false;
        }
        //Netbeans aveva proposto Object.equals
        //https://docs.oracle.com/javase/8/docs/api/java/util/Objects.html#equals-java.lang.Object-java.lang.Object-
        //Invece così è più specifico e comprensibile
        if (!this.citta.equals(other.citta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "abitazione composta da " + stanze + " stanze" + ", ha una superficie di " + superficie + " metri quadrati" + " è a " + citta + " in via" + indirizzo;
    }

}
