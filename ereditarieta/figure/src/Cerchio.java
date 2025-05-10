public class Cerchio extends Figura{
    double raggio;

    @Override
    public void disegna() {
        System.out.println("Sono un cerchio");
    }

    @Override
    public double getPerimetro() {
        return this.raggio * Math.PI * 2;
    }

    @Override
    public double getArea() {
        return this.raggio * this.raggio * Math.PI;
    }


    /*
    @Override
    public int compareTo(Object o) {
        Cerchio c = (Cerchio) o;
        if (this.getPerimetro() < c.getPerimetro())
            return -1;
        else if (this.getPerimetro() == c.getPerimetro())
            return 0;
        else
            return 1;
    }*/
}
