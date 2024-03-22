public class Quadrato extends Rettangolo {
    public Quadrato(String colore, float x, float y, float lato) {
        super(colore, x, y, lato, lato);
    }

    @Override
    public float getPerimetro(){
        return super.getBase()*4;
    }
}
