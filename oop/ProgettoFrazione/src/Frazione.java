public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore){
        this.numeratore = numeratore;
        this.denominatore = denominatore;
        if (this.denominatore == 0)
            this.denominatore = 1;
    }

    public Frazione(String s){
        //Qui andrebbe il codice di parsing della stringa, con eventuale
        //controllo degli errori
        this.numeratore = this.denominatore = 1;
    }
    public Frazione somma(Frazione frazione){
        return null;
    }

}
