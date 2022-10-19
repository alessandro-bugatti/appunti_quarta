public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(){
        this.numeratore = this.denominatore = 1;
    }
    public Frazione(int numeratore, int denominatore){
        this.setNumeratore(numeratore);
        this.setDenominatore(denominatore);
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

    /**
     * Imposta il valore del denominatore.
     * Se il valore che si tenta di assegnare fosse 0, verrà
     * sostituito con il valore 1.
     * @param denominatore
     */
    public void setDenominatore(int denominatore) {
        this.denominatore = denominatore;
        if (this.denominatore == 0)
            this.denominatore = 1;
    }

    /**
     * Semplifica una frazione ai minimi termini
     */
    private void semplifica()
    {
        boolean negativo = false;
        if (this.numeratore * this.denominatore > 0)
        {
            if (this.numeratore < 0){
                this.numeratore = -this.numeratore;
                this.denominatore = - this.denominatore;
            }
        }
        else {
            negativo = true;
            if (this.numeratore < 0)
                this.numeratore = -this.numeratore;
            if (this.denominatore < 0)
                this.denominatore = - this.denominatore;
        }
        int minimo = this.numeratore;
        if (this.denominatore < minimo)
            minimo = this.denominatore;
        for (int i = minimo; i > 1; i--) {
            if (this.numeratore %i == 0 &&
                this.denominatore % i == 0)
            {
                this.numeratore /= i;
                this.denominatore /= i;
            }
        }
        if (negativo)
            this.numeratore = -this.numeratore;
    }

    /**
     * Fa la somma tra due frazioni
     * @param frazione Il secondo addendo della somma
     * @return La frazione somma delle due
     */
    public Frazione somma(Frazione frazione){
        Frazione risultato = new Frazione();
        int numeratore = frazione.numeratore * this.getDenominatore() +
                frazione.denominatore * this.numeratore;
        int denominatore = frazione.denominatore * this.denominatore;
        risultato.numeratore = numeratore;
        risultato.denominatore = denominatore;
        risultato.semplifica();
        return risultato;

//        return new Frazione(frazione.numeratore * this.getDenominatore() +
//                frazione.denominatore * this.numeratore,
//                frazione.denominatore * this.denominatore );
    }

    //Versione assurda
//    public Frazione somma(Frazione uno, Frazione due){
//        return new Frazione(uno.numeratore * due.denominatore +
//                uno.denominatore * due.numeratore,
//                uno.denominatore * due.denominatore);
//    }

}
