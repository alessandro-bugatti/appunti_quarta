package net.imparando;

public class Punto {
    private double x;
    private double y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanzaOrigine() {
        return 1.0;
    }

    public double distanzaPunto(Punto p) {
        return 1.0;
    }

    public Punto puntoMedio(Punto p) {
        return null;
    }

    /**
     * ruota il punto di un certo angolo passato come parametro
     * @param angolo in radianti
     */
    public void ruotaPunto(double angolo) {

    }

}
