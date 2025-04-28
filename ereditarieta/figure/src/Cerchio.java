public class Cerchio extends Figura{
    double raggio;


    @Override
    public double getPerimetro() {
        return this.raggio * Math.PI * 2;
    }
}
