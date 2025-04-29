public class Rettangolo extends Figura{
    protected double base;
    protected double altezza;

    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangolo(double pos_x, double pos_y, String colore, double base, double altezza){
        super(pos_x, pos_y, colore);
        this.base = base;
        this.altezza = altezza;
    }


    @Override
    public double getPerimetro() {
        return 2 * base +  2 * altezza;
    }

    @Override
    public String toString(){
        String s = super.toString();
        s += "Base: " + this.base;
        s += " Altezza: " + this.altezza;
        return s;

    }
}
