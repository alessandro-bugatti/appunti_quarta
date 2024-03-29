package net.imparando;

/**
 * Classe che rappresenta un punto geometrico in un piano
 */
public class Punto {
    /*
    Questi sono gli attributi, in questo caso privati,
    della classe Punto
     */
    private double x;
    private double y;

    /**
     * Costruttore che assegna le coordinate di un punto
     * @param x Coordinata x del punto
     * @param y Coordinata y del punto
     */
    public Punto(double x, double y)
    {
        this.setX(x);
        this.setY(y);
    }

    /**
     * Costruttore di copia standard
     * @param a L'oggetto da copiare
     */
    public Punto(Punto a)
    {
        this.setX(a.getX());
        this.setY(a.getY());
    }

    /**
     * Metodo per il calcolo del punto medio tra due punti
     * @param p L'altro punto su cui viene calcolato il punto medio
     * @return Il punto medio
     */
    public Punto medio(Punto p)
    {
        Punto medio = new Punto(0,0);
        double temp = (this.x + p.x)/2;
        medio.x = temp;
        medio.y = (this.y + p.y)/2;
        return medio;
    }

    /**
     * Ritorna la coordinata x del punto
     * @return Coordinata x del punto
     */
    public double getX()
    {
        return this.x;
    }

    /**
     * Ritorna la coordinata y del punto
     * @return Coordinata y del punto
     */
    public double getY() {
        return this.y;
    }

    /**
     * Assegna un valore alla coordinata x del punto
     * @param x Valore assegnato alla x
     */
    public void setX(double x) {
        if (x >= 0)
            this.x = x;
        else
            this.x = -x;
    }
    /**
     * Assegna un valore alla coordinata y del punto
     * @param y Valore assegnato alla y
     */
    public void setY(double y) {
        if (y >= 0)
            this.y = y;
    }

    /**
     * Calcola la distanza del punto da un altro punto dato come parametro
     * @param p Il punto da cui si vuole calcolare la distanza
     * @return La distanza tra i due punti.
     */
    public double distanza(Punto p)
    {
        double d;
        d = Math.sqrt((this.x - p.x) * (this.x - p.x) +
                (this.y - p.y) * (this.y - p.y));
        return d;
    }

    /**
     * Ritorna la distanza del punto dall'origine
     * @return Distanza del punto dall'origine
     */
    public double distanzaOrigine()
    {
        /*double d;
        d = Math.sqrt(this.x * this.x + this.y * this.y);
        return d;*/
        //return Math.sqrt(this.x * this.x + this.y * this.y);
        Punto o= new Punto(0,0);
        return this.distanza(o);
    }

    /**
     * Ritorna l'angolo che forma il segmento che parte
     * dall'origine e arriva al punto
     * @return L'angolo formato dal segmento che dall'origine
     * arriva al punto
     */
    public double angoloOrigine()
    {
        Punto p = new Punto(0,0);
        double ipotenusa = this.distanza(p);
        double radianti = Math.asin(this.y / ipotenusa);
        return radianti;
    }

    @Override
    public String toString() {
        return "( " + x +
                " , " + y + " )";
    }

    @Override
    public boolean equals(Object o) {
        /**
         * Verifica se un oggetto è uguale a se stesso
         */
        if (this == o) return true;
        /**
         * Verifica due aspetti
         * Prima condizione: nessun oggetto può essere uguale a null
         * Seconda condizione: due oggetti per essere uguali devono
         * essere della stessa classe
         */
        if (o == null || getClass() != o.getClass()) return false;

        //Casta l'oggetto o per "farlo diventare" un punto
        Punto punto = (Punto) o;

        /*
        Due punti sono uguali se hanno le stesse coordinate x e y
         */
        if (Double.compare(punto.getX(), getX()) != 0) return false;
        return Double.compare(punto.getY(), getY()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getX());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getY());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void spostaX(double d)
    {
        this.x += d;
    }
}
