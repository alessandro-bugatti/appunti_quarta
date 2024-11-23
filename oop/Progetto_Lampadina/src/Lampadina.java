import java.io.Serializable;

/**
 * Classe che rappresenta una lampadina intelligente
 * che ha una potenza, ecc.
 */
public class Lampadina implements Serializable {
    private String nome;
    private final float potenza;
    private int intensita;
    private String colore;
    private boolean accesa;

    /**
     * Costruttore che inizializza una lampadina con una
     * potenza passata come parametro e che non potrà più
     * essere modificata
     * @param potenza
     */
    public Lampadina(float potenza){
        this.potenza = potenza;
        this.intensita = 50;
        this.colore = "Bianco";
        this.accesa = false;
        this.nome = "";
    }

    /**
     *
     * @param potenza
     * @param nome
     */
    public Lampadina(float potenza, String nome){
        this.potenza = potenza;
        this.intensita = 50;
        this.colore = "Bianco";
        this.accesa = false;
        this.nome = nome;
    }

    public Lampadina(Lampadina l){
        this.potenza = l.potenza;
        this.intensita = l.intensita;
        this.colore = l.colore;
        this.accesa = l.accesa;
        this.nome = l.nome;
    }

    public void accendi(){
        this.accesa = true;
    }

    public void spegni(){
        this.accesa = false;
    }

    /**
     * Verifica lo stato di accensione della lampadina
     * @return true se la lampadina è accesa, false altrimenti
     */
    public boolean isAcceso(){
        return this.accesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIntensita() {
        return intensita;
    }

    public void setIntensita(int intensita) {
        this.intensita = intensita;
        if (this.intensita < 0)
            this.intensita = 0;
        else if (this.intensita > 100)
            this.intensita = 100;
        else
            this.intensita = Math.round(this.intensita/10.0f)*10;
    }

    public void aumentaIntensita(){
        this.intensita += 10;
        if (this.intensita > 100)
            this.intensita = 100;
    }

    public void diminuisciIntensita(){
        this.intensita -= 10;
        if (this.intensita < 0)
            this.intensita = 0;
    }

    @Override
    public String toString() {
        return this.getNome() + " : " + this.potenza + "W" + " al " +
                this.intensita + "%";
    }
}
