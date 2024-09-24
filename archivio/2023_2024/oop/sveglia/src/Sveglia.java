public class Sveglia {
    private int ora,minuto, oraS, minutoS;
    private boolean impostaOrario, impostaSveglia, normale;

    public Sveglia(){
        this.ora=0;
        this.minuto=0;
        this.oraS=0;
        this.minutoS=0;
        this.impostaSveglia=false;
        this.impostaOrario=false;
        this.normale=true;
    }

    public Sveglia(int ora, int minuto){
        this.ora= ora;
        this.minuto=minuto;
        this.oraS=0;
        this.minutoS=0;
        this.impostaSveglia=false;
        this.impostaOrario=false;
        this.normale=true;
    }

    private void resettaStato(){
        this.impostaSveglia=false;
        this.impostaOrario=false;
        this.normale=false;
    }
    public void impostaOrario(){
        if (!impostaOrario){
            this.resettaStato();
            this.impostaOrario=true;
        }else {
            this.resettaStato();
            this.normale=true;
        }
    }

    public void impostaSveglia(){
        if (!impostaSveglia){
            this.resettaStato();
            this.impostaSveglia=true;
        }else {
            this.resettaStato();
            this.normale=true;
        }
    }

    public void setOre(){
        if (impostaOrario){
            ora=(ora+1)%24;
        } else if (impostaSveglia)
            oraS=(oraS+1)%24;
    }

    public void setMinuti(){
        if (impostaOrario){
            minuto=(minuto+1)%60;
        } else if (impostaSveglia)
            minutoS=(minutoS+1)%60;
    }

    @Override
    public String toString() {
        String orari="Orario corrente: ";
        if (this.ora>9){
            orari = orari+ this.ora;
        }else
            orari= orari+ "0" + this.ora;
        if (this.minuto>9)
            orari= orari+":"+ this.minuto + "\n";
        else
            orari= orari+":0"+this.minuto + "\n";
        // stessa cosa per la sveglia
        if (impostaOrario){
            return "modalità imposta orario \n" + orari;
        }else if (impostaSveglia){
            return "modalità imposta sveglia \n" + orari;
        }else {
            return "modalità normale \n" + orari;
        }
    }
}
