package net.imparando.contatore;

public class Contatore {
    private int contatore;
    private final int MAX;

    public Contatore(int max){
        contatore = 0;
        MAX = max;
    }

    public void incrementa(){
        contatore++;
        contatore = contatore % MAX;
    }

    public void reset(){
        contatore = 0;
    }

    @Override
    public String toString() {
        return "" + contatore;
    }
}


