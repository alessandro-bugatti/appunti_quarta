public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore){
        this.numeratore = numeratore;
        this.denominatore = denominatore;
        if (this.denominatore == 0)
            this.denominatore = 1;
    }
    //Costruttore di copia perchè come paramtero ha un oggetto dello stesso tipo
    public Frazione(Frazione f){
        this.numeratore = f.numeratore;
        this.denominatore = f.denominatore;
    }

    public Frazione(String s){
        //Qui andrebbe il codice di parsing della stringa, con eventuale
        //controllo degli errori
        this.numeratore = this.denominatore = 1;
    }

    @Override
    public String toString() {
        /*return "Frazione{" +
                "numeratore=" + numeratore +
                ", denominatore=" + denominatore +
                '}';*/
        return this.numeratore + "/" + this.denominatore;
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

    public Frazione somma(Frazione frazione){
        return null;
    }

}
