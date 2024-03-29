package net.imparando;

public class Banca {
    private final static int MAX_CONTI = 100;
    private ContoCorrente[] conti;
    private int n_conti;
    public Banca(){
        conti = new ContoCorrente[MAX_CONTI];
        n_conti = 0;
    }

    public boolean creaConto(String nome, String cognome){
        ContoCorrente c = new ContoCorrente(n_conti + 1, nome, cognome);
        conti[n_conti] = c;
        n_conti++;
        return true;
    }

    public int numeroConti(){
        return n_conti;
    }

    public ContoCorrente[] ricercaPerCognome(String cognome){
        for (int i = 0; i < n_conti; i++){
            if (cognome.equals(conti[i].getCognome())){

            }
        }
        return null;
    }
}
