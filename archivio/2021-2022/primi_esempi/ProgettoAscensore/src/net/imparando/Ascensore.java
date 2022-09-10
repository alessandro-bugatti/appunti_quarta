package net.imparando;

//DA COMPLETARE

public class Ascensore {
    private int pianoCorrente, piani;
    private boolean aperte;

    public Ascensore(int piani) {
        pianoCorrente = 0;
        this.piani = piani;
        aperte = false;
    }

    public void apri() {
        aperte = true;
    }

    public void chiudi() {

    }

    public int sali() {
        //NO CICLI FOR e WHILE
        if(aperte)
            return pianoCorrente;
        else if (pianoCorrente == piani - 1)
            return pianoCorrente;
        else
            pianoCorrente++;
        return pianoCorrente;
        /*
        if(pianoCorrente<piani-1)
            pianoCorrente++;
        return pianoCorrente;
        */
    }

    public int scendi() {

    }

    public int vai_a(int piano) {
        if(!aperte)
            if(piano >= 0 && piano < piani)
                pianoCorrente = piano;
        return pianoCorrente;
    }

    @Override
    public String toString() {

    }
}
