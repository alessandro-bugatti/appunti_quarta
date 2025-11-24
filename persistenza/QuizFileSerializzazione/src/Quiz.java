import java.io.Serializable;

public class Quiz implements Serializable{
    private String titolo;
    private Domanda[] domande = new Domanda[100];
    private int nDomande;

    public Quiz(String titolo) {
        this.titolo = titolo;
        this.nDomande = 0;
    }

    public Quiz (Quiz q) {
        this.titolo = q.titolo;
        this.nDomande = q.nDomande;
        for (int i = 0; i < nDomande; i++) {
            this.domande[i] = new Domanda (q.domande[i]);
        }
    }

    public void add (Domanda d) {
        if(nDomande < 100){
            domande[nDomande] = d;
            nDomande++;
        }
    }

    public int getQuanteDomande(){
        return nDomande;
    }

    public int GetQuanteRisposte(){
        int cont = 0;
        for (int i = 0; i < nDomande; i++) {
            if(domande[i].completata()){
                cont ++;
            }
        }
        return cont;
    }

    public int [] getDomandeNonDate(){
        int cont = 0;
        for (int i = 0; i < nDomande; i++) {
            if(!domande[i].completata()){
                cont ++;
            }
        }

        int [] nonDate = new int[cont];
        int j = 0;
        for (int i = 0; i < nDomande; i++) {
            if(!domande[i].completata()){
                nonDate[j] = i + 1;
                j++;
            }
        }
        return nonDate;
    }

    public Domanda getDomanda(int indice){
        if(indice < 1 || indice >= nDomande){
            return null;
        }
        return domande[indice-1];
    }

    public int getTotale(){
        int totale = 0;
        for (int i = 0; i < nDomande; i++) {
            totale += domande[i].getValore();
        }
        return totale;
    }

    public int getPunteggio(){
        int punteggio = 0;
        for (int i = 0; i < nDomande; i++) {
            if(domande[i].getPunteggio() > 0)
                punteggio += domande[i].getPunteggio();
        }
        return punteggio;
    }

    @Override
    public String toString(){
        return "Quiz: " + titolo + "\n Numero domande : " + nDomande + "\n Punteggio totale: " + getTotale() + " punti";
    }
}
