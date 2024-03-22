public class Rettangolo extends Figura{
    private float base, altezza;

    public Rettangolo(String colore, float x, float y, float base, float altezza) {
        super(colore, x, y);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public float getPerimetro(){
        return (this.base + this.altezza) * 2;
    }

    public float getBase(){
        return this.base;
    }
}
