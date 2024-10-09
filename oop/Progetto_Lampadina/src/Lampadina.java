public class Lampadina {
    private String nome;
    private final float potenza;
    private int intensita;
    private String colore;
    private boolean accesa;

    public Lampadina(float potenza){
        this.potenza = potenza;
        this.intensita = 50;
        this.colore = "Bianco";
        this.accesa = false;
        this.nome = "";
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

    public boolean isAcceso(){
        return this.accesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome() + " : " + this.potenza + "W";
    }
}
