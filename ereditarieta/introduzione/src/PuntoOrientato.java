public class PuntoOrientato extends Punto{
    private char orientamento;

    public PuntoOrientato(double x, double y, char orientamento) {
        super(x, y);
        this.orientamento = orientamento;
    }

    public PuntoOrientato(PuntoOrientato p){
        super(p);
        this.orientamento = p.orientamento;
    }

    public char getOrientamento() {
        return orientamento;
    }

    public void setOrientamento(char orientamento) {
        this.orientamento = orientamento;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PuntoOrientato p = (PuntoOrientato) o;
        if (!super.equals(p))
            return false;
        return this.orientamento == p.orientamento;
    }

    @Override
    public String toString(){
        return  "Punto orientato [ " + this.getX()
                + " , " + this.getY() + " , " +
                this.orientamento + " ]";
    }
}
