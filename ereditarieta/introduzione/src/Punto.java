/**
 * Classe padre della gerarchia
 */
public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p){
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

    public double distanza(Punto p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) +
            Math.pow(this.y - p.y, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Punto punto = (Punto) o;

        if (Double.compare(x, punto.x) != 0) return false;
        return Double.compare(y, punto.y) == 0;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
