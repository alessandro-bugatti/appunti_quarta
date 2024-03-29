/**
 * class è un po' l'equivalente di struct dello scorso anno
 * public indica la visibilità della classe ed è legata al concetto
 * di information hiding, in particolare dice che questa classe è pubblica,
 * cioè chiunque la può utilizzare (il main o altre classi)
 */
public class Lampadina {
    //Una classe è composta da due parti: attributi e metodi
    /**
     * "Regola" semplificativa: attributi sempre privati
     */
    private int potenza;
    private String colore;
    private int intensita;
    private boolean accesa;
    private String nome;

    /*
    metodo costruttore
    -ha lo stesso nome della classe
    -ce ne possono essere più di uno
    -vengono distinti attraverso i parametri
    -non ha un tipo di ritorno
    -si trova sempre dopo una new
    -viene invocato all'atto di creazione di un oggetto
    -serve a inizializzare correttamente un oggetto
     */

    /**
     * costruttore vuoto o di default
     * se non viene definito esiste in automatico,
     * a meno che non ci siano altri costruttori. in
     * quel caso se lo si vuole usare bisogna definirlo
     *
     */
    public Lampadina(){
        this.potenza = 10;
        this.intensita = 100;
        this.colore = "bianco";
        this.accesa = false;
    }

    /**
     *
     * @param potenza
     * @param colore
     * @param nome
     */
    public Lampadina(int potenza, String colore, String nome){
        this.setPotenza(potenza);
        this.colore = colore;
        this.nome = nome;
        this.intensita = 100;
    }

    /**
     * metodo che ritorna informazioni sull'oggetto corrente
     * sotto forma di stringa
     * @return stringa che descrive l'oggetto
     */
    @Override
    public String toString(){
        return "la lampadina "+ this.nome + " ha una potenza di " +
                this.potenza + " ed è di colore " + this.colore + ". Intensità"
                + this.intensita + "%";
    }

    /**
     * I metodi getter/setter sono metodi standard che servono a
     * leggere(get) o scrivere(set) i valori di attibuti privati.
     * Non sono obbligatori, ogni volta decideremo caso per caso
     * se farli o meno.
     * Nella nomenclatura standard di Java si chiamerebbero
     * getNomeAttributo e setNomeAttributo
     */
    /**
     * Metodo getter che ritorna il valore della potenza
     * @return Valore della potenza in watt
     */
    public int getIntensita(){
        return this.intensita;
    }

    public void setIntensita(int intensita){
        this.intensita = intensita;
        if (this.intensita > 100 || this.intensita < 1)
            this.intensita = 50;
    }

    private void setPotenza(int potenza){
        this.potenza = potenza;
        if (this.potenza > 100 || this.potenza < 1)
            this.potenza = 5;
    }

    public String getNome() {
        return this.nome;
    }
}
