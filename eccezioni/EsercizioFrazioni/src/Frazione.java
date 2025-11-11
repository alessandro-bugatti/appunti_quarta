public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) throws DenominatoreNonValido {
        if (denominatore == 0){
            String m = "La frazione che ha dato problemi ha come numeratore " +
                    numeratore + " e denominatore a zero";
            throw new DenominatoreNonValido(m, numeratore);
        }
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public Frazione (){
        this.numeratore = 0;
        this.denominatore = 1;
    }

    public Frazione somma(Frazione a) throws DenominatoreNonValido {
        int n = a.numeratore * this.denominatore + this.numeratore * a.denominatore;
        int d = a.denominatore * this.denominatore;
        return new Frazione(n, d);
    }

    public Frazione prodotto(Frazione a){
        Frazione r = new Frazione();
        r.numeratore = a.numeratore * this.numeratore;
        r.denominatore = a.denominatore * this.denominatore;
        return r;
    }
}
