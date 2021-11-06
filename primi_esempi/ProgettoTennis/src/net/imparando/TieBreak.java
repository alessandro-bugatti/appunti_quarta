package net.imparando;

public class TieBreak {
    private int punteggioUno;
    private int punteggioDue;

    public boolean puntoGiocatoreUno() {
        punteggioUno++;
        if (punteggioUno > 6 && punteggioUno - punteggioDue >= 2)
            return true;
        return false;
    }

    public boolean puntoGiocatoreDue() {
        punteggioDue++;
        if (punteggioDue > 6 && punteggioDue - punteggioUno >= 2)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "TieBreak: " + punteggioUno +
                " - " + punteggioDue;
    }
}
