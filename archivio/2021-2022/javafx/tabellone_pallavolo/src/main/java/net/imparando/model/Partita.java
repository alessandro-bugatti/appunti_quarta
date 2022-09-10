package net.imparando.model;

public class Partita {
    private int[] punteggio;
    private int[] set;

    public static final int CASA = 0;
    public static final int TRASFERTA = 1;

    public Partita() {
        punteggio = new int[2];
        set = new int[2];
    }

    public void aggiungiPunto(int squadra){
        punteggio[squadra]++;
        if (punteggio[squadra] == 25){
            set[squadra]++;
            punteggio[CASA] = 0;
            punteggio[TRASFERTA] = 0;
        }
    }

    public int getPunteggio(int squadra){
        return punteggio[squadra];
    }

    public int getSet(int squadra){
        return set[squadra];
    }

}
