public class Semaforo {
    private boolean acceso;
    private String colore;

    /**
     * Il semaforo all'atto della creazione è spento e
     * quindi il colore è nero
     */
    public Semaforo()
    {
        acceso = false;
        colore = "nero";
    }

    public boolean isAcceso()
    {
        return acceso;
    }

    public String getColore(){
        return colore;
    }

    public void spegni(){

    }

    public void accendi(){

    }
    /**
     * Se il semaforo è acceso lo porta al colore seguente
     * se è spento non cambia nulla
     */
    public void aggiorna(){
        if (!acceso)
            return;
        if (colore.equals("verde"))
            colore = "giallo";

    }


}
