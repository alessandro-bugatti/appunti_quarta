package net.imparando;

import java.io.Serializable;

public class Razionale implements Serializable {
    private int numeratore;
    private int denominatore;

    public Razionale(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public int getNumeratore() {
        return numeratore;
    }

    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }

    public void setDenominatore(int denominatore) {
        this.denominatore = denominatore;
    }

    @Override
    public String toString() {
        return "Razionale{" +
                "numeratore=" + numeratore +
                ", denominatore=" + denominatore +
                '}';
    }
}
