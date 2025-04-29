public class Quadrato extends Rettangolo{

    public Quadrato(double pos_x, double pos_y, String colore, double lato){
        super(pos_x, pos_y, colore, lato, lato);
    }

    //Se voglio posso ottimizzare dei metodi che già funzionano
    @Override
    public double getPerimetro(){
        return base * 4;
    }

}
