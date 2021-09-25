package net.imparando;

public class Angolo {
    private double ampiezza; //in radianti

    public Angolo()
    {
        this.ampiezza = 0;
    }

    private double normalizza(double a)
    {
        while(a > 2*Math.PI)
            a -= 2*Math.PI;
        while(a < 0)
            a += 2*Math.PI;
        return a;
    }

    /**
     * Assegna il parametro all'angolo che si vuole
     * rappresentare, modificandone il valore in modo che
     * rimanga compreso tra [0, 2π)
     * @param ampiezza
     */
    public Angolo(double ampiezza)
    {
        this.ampiezza = this.normalizza(ampiezza);
    }

    /**
     * Ritorna l'ampiezza dell'angolo in radianti
     * @return Ampiezza dell'angolo in radianti
     */
    public double getRadianti()
    {
        return ampiezza;
    }

    /**
     * Ritorna i gradi dell'angolo
     * @return Gradi dell'angolo
     */
    public int getGradi()
    {
        int gradi = (int)(this.ampiezza * 360 / (2*Math.PI));
        return gradi;
    }

    /**
     * Ritorna i primi dell'angolo
     * @return Primi dell'angolo
     */
    public int getPrimi()
    {
        double resto = ampiezza*360/(2*Math.PI) - getGradi();
        int primi = (int)(resto*60);
        return primi;
    }

    /**
     * Ritorna i secondi dell'angolo
     * @return Secondi dell'angolo
     */
    public int getSecondi()
    {
        double resto = ampiezza*360/(2*Math.PI) - getGradi() - ((double)getPrimi())/60;
        int secondi = (int)(resto*3600);
        return secondi;
    }

    /**
     * Fa la somma dell'angolo con un altro angolo
     * @param alfa L'angolo da sommare
     * @return La somma dell'angolo corrente più alfa
     */
    public Angolo somma(Angolo alfa)
    {
        //Prima versione lunga e distesa
        Angolo a = new Angolo();
        a.ampiezza = alfa.ampiezza + this.ampiezza;
        a.ampiezza = normalizza(a.ampiezza);
        return a;
        //Versione compatta
        //Angolo a = new Angolo(alfa.ampiezza + this.ampiezza);
        //return a;
        //Versione super compatta
        //return new Angolo(alfa.ampiezza + this.ampiezza);
    }

    @Override
    public String toString() {
        return "Radianti = " + this.ampiezza + " -> Gradi: " + this.getGradi() + "°" + this.getPrimi() + "'" + this.getSecondi() + "''";
    }
}
