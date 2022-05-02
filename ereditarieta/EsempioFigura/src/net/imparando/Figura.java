package net.imparando;

public abstract class Figura {
    private float x;
    private float y;
    private String colore;

    public Figura() {
    }

    public Figura(float x, float y, String colore) {
        this.x = x;
        this.y = y;
        this.colore = colore;
    }

    public Figura(Figura a) {
        this.x = a.x;
        this.y = a.y;
        this.colore = a.colore;
    }

    /**
     * Metodo che sposta la figura di una quantità dx e una quantità dy
     * @param dx Spostamento lungo l'asse delle x
     * @param dy Spostamento lungo l'asse delle y
     */
    public void sposta(float dx, float dy){
        x += dx;
        y += dy;
    }

    /**
     * Calcola il perimetro di una figura, ma non sembra implementabile
     * al livello della classe Figura
     * @return
     */
    public abstract float getPerimetro();

    public float getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return  "x=" + x +
                ", y=" + y +
                ", colore='" + colore + "', ";
    }
}

