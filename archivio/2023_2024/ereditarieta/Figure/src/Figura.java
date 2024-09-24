public abstract class Figura {
    private String colore;
    private float x;
    private float y;

    public Figura(String colore, float x, float y) {
        this.colore = colore;
        this.x = x;
        this.y = y;
    }

    public Figura(Figura f){
        this.colore = f.colore;
        this.x = f.x;
        this.y = f.y;
    }

    public void sposta(float dx, float dy){
        this.x += dx;
        this.y += dy;
    }

    public abstract float getPerimetro();

    @Override
    public String toString(){
        return "Colore " + this.colore + "(" + this.x +
                "," + this.y + ")";
     }
}
