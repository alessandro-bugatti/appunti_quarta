public class Lampadina {
    private int potenza;
    private String colore;
    private int intensita;
    private boolean accesa;
    private String nome;

    public Lampadina(int potenza){
        this.potenza = potenza;
        if (this.potenza < 1 || this.potenza > 100) {
            this.potenza = 10;
        }
        this.colore = "bianco";
        this.intensita = 100;
        this.accesa = false;
        this.nome = "";
    }

    public Lampadina(Lampadina l) {
        this.potenza = l.potenza;
        this.colore = l.colore;
        this.intensita = l.intensita;
        this.accesa = l.accesa;
        this.nome = l.nome;
    }

    public void accendi(){
        this.accesa = true;

    }

    public void aumentaLuminosita() throws LuminositaEccessivaException {
        this.intensita +=10;
        if (this.intensita > 100){
            this.intensita = 100;
            throw new LuminositaEccessivaException();
        }
    }

    public void diminuisciLuminosita() throws LuminositaNegativaException {
        this.intensita -=10;
        if (this.intensita < 0){
            this.intensita = 0;
            throw new LuminositaNegativaException();
        }
    }

    @Override
    public String toString() {
        return "Lampadina{" +
                "potenza=" + potenza +
                ", colore='" + colore + '\'' +
                ", intensita=" + intensita +
                ", accesa=" + accesa +
                ", nome='" + nome + '\'' +
                '}';
    }
}
