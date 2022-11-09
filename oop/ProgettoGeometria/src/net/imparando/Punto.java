package net.imparando;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanza(Punto a){
        return Math.sqrt(Math.pow((this.x - a.x),2) + Math.pow(this.y - a.y, 2));
    }

    public double distanzaOrigine(){
        return distanza(new Punto(0,0));
    }

    public void traslaX(double delta){
        this.x += delta;
    }

    public void traslaY(double delta){
        this.y += delta;
    }

    public void trasla(double dx, double dy){
        traslaX(dx);
        traslaY(dy);
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ")";
    }
}
