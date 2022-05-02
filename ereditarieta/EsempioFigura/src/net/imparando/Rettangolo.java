package net.imparando;

public class Rettangolo extends Figura {

    private float base;
    private float altezza;

    public Rettangolo(float x, float y, String colore, float base, float altezza) {
        super(x, y, colore);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public float getPerimetro() {
        return altezza + altezza + base + base;
    }

    @Override
    public String toString() {
        return super.toString() +
                "base=" + this.base +
                ", altezza = " + this.altezza;
    }
}
