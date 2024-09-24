/**
 * Classe che va a modellizzare una frazione composta da due interi.
 * @author Alessandro Bugatti
 */

public class Frazione {
    private int numeratore;
    private int denominatore;

    /**
     * Costruttore che prende come parametro numeratore e denominatore di una frazione.
     * Se il denominatore è 0, al momento lo accetta e potrebbe generare problemi nei metodi
     * @param numeratore Numeratore della frazione
     * @param denominatore Denominatore della frazione
     */
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
        this.denominatore = 1; // Se il denominatore è 1, allora la frazione è un intero
    }

    /*un metodo che non utilizza nessun attributo della classe è meglio
    che venga definito "static"*/
    private static int MCD(int a, int b){
        if (b == 0)
            return a;
        return MCD(b, a%b);
    }

    /**
     * Somma tra di loro la frazione corrente e la frazione passata come parametro.
     * La frazione corrente (this) non viene modificata dall'operazione
     * <h4>Esempio</h4>
     * <strong>1/2</strong> + <strong>1/3</strong> darà come frazione risultato <strong>5/6</strong>
     * @param f1 La frazione che viene aggiunta alla frazione this
     * @return Un nuovo oggetto frazione, che è la somma delle due
     */
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
