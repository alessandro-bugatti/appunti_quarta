package net.imparando;

/**
 * Questa classe rappresenta un punto sulla superficie
 * terrestre, espresso con i propri valori di latitudine
 * e longitudine. Per ulteriori informazioni
 * andare alla <a href = "https://it.wikipedia.org/wiki/Coordinate_geografiche">
 *     pagina di Wikipedia</a>
 */
public class PuntoGeografico {
    private Angolo latitudine;
    private Angolo longitudine;

    /**
     * Abbiamo deciso che il costruttore vuoto
     * inizializza il punto sulle coordinate dell'isola
     * di Pasqua
     */
    public PuntoGeografico()
    {
        this.longitudine = new Angolo(109, 20,58);
        this.latitudine = new Angolo(-27,6,45);
    }

    /**
     * Costruttore a cui viene passata la latitudine e la longitudine
     * @param latitudine
     * @param longitudine
     */
    public PuntoGeografico(Angolo latitudine, Angolo longitudine)
    {
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    /**
     * Calcola la distanza tra il punto corrente e il parametro b
     * utilizzando la formula di Vincenty
     *
     * @param b
     * @return La distanza tra i due punti
     */
    public double distanza(PuntoGeografico b)
    {
        return Math.acos(Math.sin(this.latitudine.getRadianti()) *
                Math.sin(b.latitudine.getRadianti()) +
                Math.cos(this.latitudine.getRadianti()) *
                Math.cos(b.latitudine.getRadianti()) *
                Math.cos(this.longitudine.getRadianti() - b.longitudine.getRadianti())
        ) * 6360;
    }
}
