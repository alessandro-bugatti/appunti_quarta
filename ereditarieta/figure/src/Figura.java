public abstract class Figura {
    private double pos_x;
    private double pos_y;
    private String colore;

    public Figura(){

    }

    public Figura(double pos_x, double pos_y, String colore){
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.colore = colore;
    }

    public void sposta(int dx, int dy){
        this.pos_x += dx;
        this.pos_y += dy;
    }

    @Override
    public String toString(){
        String s;
        s = "pos_x: " + pos_x + ",";
        s += "pos_y: " + pos_y + ",";
        s += "colore: " + colore;
        return s;
    }

    public abstract double getPerimetro();
}
