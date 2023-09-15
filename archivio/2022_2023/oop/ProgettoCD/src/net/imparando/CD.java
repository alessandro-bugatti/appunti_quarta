package net.imparando;

public class CD {
    private String titolo;
    private String autore;
    private int nBrani;
    private int durata; //In secondi

    public CD(String titolo, String autore, int nBrani, int durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.nBrani = nBrani;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getnBrani() {
        return nBrani;
    }

    public void setnBrani(int nBrani) {
        this.nBrani = nBrani;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "CD{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", nBrani=" + nBrani +
                ", durata=" + durata +
                '}';
    }

    public int compareDurata(CD a) {
        return this.durata - a.durata;
    }
}
