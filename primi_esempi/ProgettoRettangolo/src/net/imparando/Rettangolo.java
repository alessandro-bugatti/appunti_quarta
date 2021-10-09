package net.imparando;

public class Rettangolo {
    private Punto upperSx;
    private Punto lowerDx;

    /**
     * Costruttore banale
     * @param upperSx Vertice in alto a sinistra
     * @param lowerDx Vertice in basso a destra
     */
    public Rettangolo(Punto upperSx, Punto lowerDx)
    {
        //Si potrebbero controllare le coordinate dei punti
        //per verificare che siano davvero quello in alto a
        //sinistra e in basso a destra e, se non fosse così,
        //modificarli in modo che siano giusti
        this.upperSx = upperSx;
        this.lowerDx = lowerDx;

        //Se il problema fosse solo di scambiarli basterebbe
        //fare così
        /*Punto temp = upperSx;
        upperSx = lowerDx;
        lowerDx = temp;*/
    }

    /**
     * Costruttore di copia
     */

    public Rettangolo(Rettangolo r)
    {
        //if (r == null) //Cosa faccio?
        this.upperSx = r.upperSx;
        this.lowerDx = r.lowerDx;
    }

    /**
     * Ritorna l'area del rettangolo
     * @return L'area del rettangolo
     */
    public double getArea()
    {
        double base = this.lowerDx.getX() - this.upperSx.getX();
        double altezza = this.upperSx.getY() - this.lowerDx.getY();
        return base * altezza;
    }

    /**
     * Controlla se il rettangolo interseca un secondo rettangolo r passato
     * come parametro
     * @param r Il rettangolo con cui si vuole controllare l'intersezione
     * @return Vero se si intersecano, falso altrimenti
     */
    public boolean intersect(Rettangolo r)
    {
       //Controllo se il rettangolo r si trova sopra al rettangolo this
       if (this.upperSx.getY() < r.lowerDx.getY()) return false;
       //Mancano altre tre condizioni
       return true;
    }

    /**
     * Sposta il rettangolo di una certa distanza lungo l'asse delle X
     * @param d Spostamento lungo l'asse delle X
     */
    public void spostaX(double d)
    {
        //Senza il metodo spostaX del Punto
        //this.upperSx.setX(this.upperSx.getX() + d);
        this.upperSx.spostaX(d);
        this.lowerDx.spostaX(d);
    }

    /**
     * Sposta il rettangolo di una certa distanza lungo l'asse delle Y
     * @param d Spostamento lungo l'asse delle Y
     */
    public void spostaY(double d)
    {
        //Da completare
    }

    /**
     * Sposta il rettangolo di una certa distanza lungo l'asse delle X
     * e di un'altra quantità lungo l'asse delle Y
     * @param dx Spostamento lungo l'asse delle X
     * @param dy Spostamento lungo l'asse delle Y
     */
    public void spostaXY(double dx, double dy)
    {
        this.spostaX(dx);
        this.spostaY(dy);
    }

    /**
     * Ruota il rettangolo di 90°
     */
    public void ruota90()
    {

    }


}
