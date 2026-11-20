public class Rettangolo {
    private double x1, y1, x2, y2;


    public Rettangolo(double x1, double y1, double x2, double y2) throws LatiNonValidiException{
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        if (this.x1 == this.x2){
            //SE volessi lanciare un'eccezione unchecked
            //throw new RuntimeException("La base non può essere zero");
            throw new LatiNonValidiException();
        }

    }

    public double getPerimetro(){
        return 1;
    }
    public double getArea(){
        return 1;
    }
}
