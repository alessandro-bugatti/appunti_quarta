package net.imparando;

import java.io.Serializable;

public class Successione implements Serializable {
    private Razionale[] successione;
    private int quanti;

    public Successione() {
        successione = new Razionale[100];
        quanti = 0;
    }

    public void aggiungiRazionale(Razionale r)
    {
        successione[quanti] = r;
        quanti++;
    }

    @Override
    public String toString() {
        String s = "Successione: ";
        for (int i = 0; i < quanti; i++)
            s += "(" + successione[i] + ") ";
        return s;
    }
}
