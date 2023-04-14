package net.imparando;

public class Quadrato extends Rettangolo {
    public Quadrato(float x, float y, String colore, float lato) {
        super(x, y, colore, lato, lato);
    }

    /**
     * Viene fatto l'overriding per motivi di performance,
     * in modo da fare una sola moltiplicazione anzichè 3 somme
     * @return Il perimetro del quadrato
     */
    @Override
    public float getPerimetro() {
        return super.getBase() * 4;
    }
    
}
