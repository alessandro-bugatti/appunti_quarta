package net.imparando;

public class Punto implements Comparable<Punto> {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Punto o) {
        double a = Math.sqrt(this.x * this.x + this.y*this.y);
        double b = Math.sqrt(o.x * o.x + o.y*o.y);
        if (a < b)
            return -1;
        if (a > b)
            return 1;
        return 0;
    }
}
