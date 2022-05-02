package net.imparando;

public class Cerchio extends Figura {

    private float raggio;

    public Cerchio(float x, float y, String colore, float raggio) {
        super(x, y, colore);
        this.raggio = raggio;
    }


    @Override
    public float getPerimetro() {
        return (float) (raggio * 2 * Math.PI);
    }

    @Override
    public String toString() {
        return super.toString() +
                "raggio=" + raggio;
    }
}
