public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
        if (this.numeratore < 0 && this.denominatore < 0){
            this.numeratore = -this.numeratore;
            this.denominatore = -this.denominatore;
        }
        if (this.numeratore > 0 && this.denominatore < 0){
            this.numeratore = -this.numeratore;
            this.denominatore = -this.denominatore;
        }
        int divisore;
        if (this.numeratore < 0)
            divisore = MCD(-this.numeratore, this.denominatore);
        else
            divisore = MCD(this.numeratore, this.denominatore);
        this.numeratore /= divisore;
        this.denominatore /= divisore;
    }
    public Frazione(int numeratore){
        this.numeratore = numeratore;
        this.denominatore = 1;
    }

    //un metodo che non utilizza nessun attributo della classe è meglio
    //che venga definito "static"
    private static int MCD(int a, int b){
        if (b == 0)
            return a;
        return MCD(b, a%b);
    }
    public Frazione somma(Frazione f1){
        int d = f1.denominatore * this.denominatore;
        int n = (f1.numeratore * this.denominatore) + (this.numeratore* f1.denominatore);
        return new Frazione(n, d);
    }
    public Frazione differenza(Frazione f1){
        Frazione f = new Frazione(-f1.numeratore, f1.denominatore);
        return this.somma(f);
    }
    @Override
    public String toString() {
        if (this.denominatore == 1)
            return "" + this.numeratore;
        if (this.numeratore == 0)
            return "0";
        return numeratore + "/" + denominatore;
    }
}
