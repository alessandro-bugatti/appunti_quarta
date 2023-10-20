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

    private int MCD(int a, int b){
        if (b == 0)
            return a;
        return MCD(b, a%b);
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
