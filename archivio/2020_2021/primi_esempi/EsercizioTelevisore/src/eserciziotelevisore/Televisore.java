/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziotelevisore;

/**
 * Esempio di una classe per gestire un televisore
 * @author Danish Hussain
 */
public class Televisore {
    /**
     * Attributo che contiene il numero del canale attuale
     */
    private int canaleAttuale;
    /**
     * Stato della televisione: spento / acceso
     */
    private boolean acceso;
    /**
     * Numero totale di canali presenti sulla televisione
     */
    private int totaleCanali;
    /**
     * Numero che indica il volume della televisione
     */
    private int volume;
    /**
     * numero che indica la luminosità della televisioen
     */
    private int luminosita;
    /**
     * 
     */
    private static int MAX_VOLUME = 100;
    
    /**
     * Questo è il costruttore con i dati del televisore in cui
     * vengono assegnati i valori iniziali
     * @param dimensione 
     */
    public Televisore(int dimensione)
    { 
        this.canaleAttuale = 1;
        this.acceso = false;
        this.totaleCanali = dimensione;
        this.volume = 10;
        this.luminosita = 50;
        
    }
    
    
    /**
     * Seleziona un canale tra quelli validi
     * @param canaleSelezionato  sul quale si sposterà il televisore se il canale 
     * inserito <strong>non è valido</strong> il televisore rimarrà sullo stesso canale
     * impostato in precedenza
     * @return il canale finale su cui troverà la tlevisione,
     * in questo caso quello selezionato dall'utente
     */
    public int selezionaCanale(int canaleSelezionato)
    {
        if(canaleSelezionato > 0 && canaleSelezionato < 1001 && acceso)
            canaleAttuale = canaleSelezionato;
        else
            System.out.println("Canale selezionato inesistente!");
        return canaleAttuale;
    }
    
    /**
     * Permette di spostarsi al canale successivo
     * @return il canale finale su cui troverà la tlevisione,
     * in questo caso quello successivo all'attuale
     */
    public int canaleSuccessivo()
    {
        if(acceso == true)
            canaleAttuale++;
        return canaleAttuale;
    }
    
    /**
     * Permette di spostarsi al canale successivo
     * @return il canale finale su cui troverà la tlevisione,
     * in questo caso quello preceedente all'attuale
     */
    public int canalePrecedente()
    {
        if(acceso == true)
            canaleAttuale--;
        return canaleAttuale;
    }
    
    /**
     * Questo metodo permette di accendere il televisore
     */
    public void accendi()
    {
        acceso = true;
    }
    
    /**
     * Questo metodo permette di spegnere il televisore
     */
    public void spegni()
    {
        acceso = false;
    }
    /**
     * Permette di diminuire il volume di una'unità
     * @return il volume finale su cui si troverà la tlevisione,
     * in questo caso decrementato di uno rispetto a prima
     */
    public int diminuisciVolume()
    {
        if (volume - 1>= 0)
            volume--;
        return volume;
    }
    /**
     * Permette di aumentare il volume di una'unità
     * @return il volume finale su cui si troverà la tlevisione,
     * in questo caso incrementato di uno rispetto a prima
     */
    public int aumentaVolume()
    {
        if (volume + 1<= MAX_VOLUME)
            volume++;
        return volume;
    }
    /**
     * Permette di aumentare la luminosità di una'unità
     * @return la luminostà finale su cui si troverà la tlevisione,
     * in questo caso decrementata di uno rispetto a prima
     */
    public int diminuisciLuminosita()
    {
        if (luminosita - 1>= 0)
            luminosita--;
        return luminosita;
    }
    /**
     * Permette di aumentare la luminosità di una'unità
     * @return la luminostà finale su cui si troverà la tlevisione,
     * in questo caso incrementata di uno rispetto a prima
     */
    public int aumentaluminosita()
    {
        if (luminosita + 1<= 100)
            luminosita++;
        return luminosita;
    }
    
    /**
     * Metodo che permette di stampare lo stato attuale
     * del televisore
     * @return stringa contenente tutte le varie informazione
     */
    @Override
    public String toString()
    {
        String s;
        s = "Il televisore è ";
        if (acceso == true)
            s = s + "acceso. ";
        else
        s = s + "spento. ";
        
        if(acceso == true)
        {
            s = s + "Il canale attivo é " + this.canaleAttuale + ".\n"
                  + "Il volume della televisione è di " + volume + ". "
                  + "La luminosità è di " + luminosita + ".";
        }
        return s;
    }
    
    public static void modificaMassimoVolume(int m)
    {
        MAX_VOLUME++;
    }
}
