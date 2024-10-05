public class Lampadina {
    private String nome;
    private final float potenza;
    private int luminosita;
    private String colore;
    private boolean acceso;

    public Lampadina(float potenza){
        this.potenza = potenza;
        this.luminosita = 50;
        this.colore = "Bianco";
        this.acceso = false;
        this.nome = "";
    }

    public Lampadina(Lampadina l){
        this.potenza = l.potenza;
        this.luminosita = l.luminosita;
        this.colore = l.colore;
        this.acceso = l.acceso;
        this.nome = l.nome;
    }

    public void accendi(){
        this.acceso = true;
    }

    public void spegni(){
        this.acceso = false;
    }

    public boolean isAcceso(){
        return this.acceso;
    }

}
