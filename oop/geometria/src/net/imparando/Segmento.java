package net.imparando;

import graphics.Line;

public class Segmento {
    private Punto A;
    private Punto B;
    private Line linea;
    public Segmento() {
        linea = new Line(0, 0, 100, 100);
    }


    public void disegna(){
        linea.draw();
    }

}
