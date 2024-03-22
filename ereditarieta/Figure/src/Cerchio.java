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

    @Override
    public String toString(){
        return super.toString() + " raggio " + this.raggio;
    }

    public void metodoDelCerchio(){
        System.out.println("Sono un metodo solo del cerchio");
    }
}
