public class Cerchio extends Figura {
    private float raggio;

    public Cerchio(String colore, float x, float y, float raggio) {
        super(colore, x, y);
        this.raggio = raggio;
    }

    public Cerchio(Cerchio c) {
        super(c);
        this.raggio = c.raggio;
    }

    public float getPerimetro(){
        return  raggio*2*(float)Math.PI;
    }
}
