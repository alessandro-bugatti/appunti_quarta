package net.imparando;

import graphics.Ellipse;

public class Punto {
    private double x;
    private double y;

    private Ellipse e;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        e = new Ellipse(x, y, 4,4);

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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void disegna(){
        e.draw();
    }
}
