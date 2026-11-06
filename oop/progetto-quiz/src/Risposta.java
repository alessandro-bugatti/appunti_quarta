public class Risposta {
    private String testoRisposta;
    private int indice;
    private boolean corretta;

    public Risposta(String testo, boolean corretta){
        this.indice = indice;
        this.testoRisposta = testo;
        this.corretta = corretta;
    }

    public boolean isCorretta() {
        return corretta;
    }

    public String getTestoRisposta() {
        return testoRisposta;
    }
}
