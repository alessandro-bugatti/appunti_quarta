package net.imparando;

import graphics.Line;

public class Segmento {
    private Punto a;
    private Punto b;

    private Line l;
    public Segmento(Punto a, Punto b) {
        this.a = a;
        this.b = b;
        l = new Line(a.getX(), a.getY(),b.getX(),b.getY());
    }

    public void disegna(){
        l.draw();
    }
}
