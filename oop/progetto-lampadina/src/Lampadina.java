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

    public void accendi(){
        this.accesa = true;

    }

    public void aumentaLuminosita(){
        this.intensita +=10;
        if (this.intensita > 100){
            this.intensita = 100;
        }
    }
}
