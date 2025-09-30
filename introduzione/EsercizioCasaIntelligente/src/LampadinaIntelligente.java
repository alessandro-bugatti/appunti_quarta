import java.util.Objects;

public class LampadinaIntelligente {
    private int potenza;
    private int qta;
    private String colore;
    private String nome;

    public LampadinaIntelligente(int potenza){
        if (potenza < 0)
            potenza = -potenza;
        this.potenza = potenza;
        this.nome = "";
        this.qta = 50;
        this.colore = "bianco";
    }

    public int getPotenza(){
        return this.potenza;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LampadinaIntelligente))
            return false;
        LampadinaIntelligente lamp = (LampadinaIntelligente) o;
        return this.nome.toLowerCase().equals(lamp.nome.toLowerCase());
    }

}
