public class Partita {

    private int punteggioCasa, punteggioOspiti;
    private int setCasa, setOspiti;
    private int setCorrente;
    private String nomeCasa, nomeOspiti;

    public Partita(String nomeCasa, String nomeOspiti) {
        this.nomeCasa = nomeCasa;
        this.nomeOspiti = nomeOspiti;
        this.punteggioCasa = 0;
        this.punteggioOspiti = 0;
        this.setCasa = 0;
        this.setOspiti = 0;
        this.setCorrente = 1;
    }

    /**
     * Aumenta di uno il punteggio della squadra di casa
     * @return ritorna true se con questo punto la squadra vince il set,
     * false altrimenti
     */
    public boolean assegnaPuntoCasa(){
        this.punteggioCasa++;
        if (this.punteggioCasa >= 25  && this.punteggioCasa >= punteggioOspiti + 2) {
            this.punteggioCasa = 0;
            this.punteggioOspiti = 0;
            this.setCasa++;
            this.setCorrente++;
            return true;
        }
        return false;
    }

    public int getPunteggioCasa(){
        return this.punteggioCasa;
    }

    public int getSetCasa(){
        return this.setCasa;
    }

    public boolean assegnaPuntoOspiti(){
        this.punteggioOspiti++;
        if (this.punteggioOspiti >= 25  && this.punteggioOspiti >= punteggioCasa + 2) {
            this.punteggioCasa = 0;
            this.punteggioOspiti = 0;
            this.setOspiti++;
            this.setCorrente++;
            return true;
        }
        return false;
    }

    public int getPunteggioOspiti(){
        return this.punteggioOspiti;
    }

    public int getSetOspiti(){
        return this.setOspiti;
    }



}
