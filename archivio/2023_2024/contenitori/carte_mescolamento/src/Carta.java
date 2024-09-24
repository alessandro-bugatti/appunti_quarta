public class Carta implements Comparable<Carta> {
    private int valore, seme;

    public Carta(int valore, int seme) {
        this.valore = valore;
        this.seme = seme;
    }

    @Override
    public String toString() {
        String s = "";
        if (seme == 1)
            s = "Cuori";
        else if (seme == 2)
            s = "Quadri";
        else if (seme == 3)
            s = "Fiori";
        else
            s = "Picche";
        String v = "";
        if (valore < 11)
            v = "" + valore;
        else if (valore == 11)
            v = "J";
        else if (valore == 12)
            v = "Q";
        else
            v = "K";
        return v + " di " + s;
    }

    @Override
    public int compareTo(Carta c) {
        if (seme == c.seme)
            return valore - c.valore;
        return seme - c.seme;
    }
}
