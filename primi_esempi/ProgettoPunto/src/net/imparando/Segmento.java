package net.imparando;

import java.util.Objects;

public class Segmento {
    private Punto a;
    private Punto b;

    public Segmento(Punto a, Punto b)
    {
        this.a = a;
        this.b = b;
    }

    public Punto getA() {
        return a;
    }

    public Punto getB() {
        return b;
    }

    public double getLunghezza()
    {
        return a.distanza(b);
    }

    @Override
    public String toString() {
        return "Segmento{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Segmento segmento = (Segmento) o;

        if((a.equals(segmento.a) && Objects.equals(b, segmento.b)) ||
                Objects.equals(a, segmento.b) && Objects.equals(b, segmento.a))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

}
