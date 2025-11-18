public class Domanda {
    private String testo;
    private Risposta [] risposte;
    private int valore;
    private int rispostaData;

    public Domanda(String testo, Risposta[] risposte) {
        this.testo = testo;
        this.risposte = risposte;
        this.valore = 1;
        this.rispostaData = 0;
    }

    public Domanda (Domanda d){
        this.testo = d.testo;
        this.risposte = new Risposta[4];
        for (int i = 0; i < 4; i++) {
            this.risposte[i] = d.risposte[i];
        }
        this.rispostaData = 0;
        this.valore = d.valore;
    }

    public boolean rispondi (int scelta){
        this.rispostaData = scelta;
        return risposte[scelta - 1].isCorretta();
    }

    public void setValore(int valore){
        if(valore >= 0)
            this.valore = valore;
    }

    public int getValore(){
        return valore;
    }

    public int getPunteggio(){
        if(this.rispostaData == 0)
            return -1;
        else if(risposte [rispostaData-1].isCorretta()){
            return valore;
        } else{
            return 0;
        }
    }

    public boolean completata (){
        return rispostaData != 0;
    }

    public String getRispostaCorretta(){
        for (int i = 0; i < 4; i++) {
            if(risposte[i].isCorretta())
                return risposte[i].getTesto();
        }
        return null;
    }

    public String getRispostaData(){
        if(rispostaData == 0)
            return null;
        return  risposte[rispostaData-1].getTesto();
    }

    @Override
    public String toString(){
        return testo + "\n 1) " + risposte[0] + "\n 2) " + risposte[1] + "\n 3) " + risposte[2] + "\n 4) " + risposte[3];
    }
}
