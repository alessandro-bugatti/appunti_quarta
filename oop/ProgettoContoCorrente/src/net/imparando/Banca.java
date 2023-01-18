package net.imparando;

import java.io.Serializable;
import java.util.ArrayList;

public class Banca implements Serializable {
    ArrayList<ContoCorrente> conti;

    private int generaNuovoNumeroConto(){
        return conti.size() + 1;
    }
    public Banca(){
        conti = new ArrayList<>();
    }

    public boolean creaConto(String nome, String cognome){
        ContoCorrente c = new ContoCorrente(generaNuovoNumeroConto(), nome, cognome);
        conti.add(c);
        return true;
    }

    public int numeroConti(){
        return conti.size();
    }


    public ContoCorrente[] ricercaPerCognome(String cognome){
        ArrayList<ContoCorrente> trovati;
        trovati = new ArrayList<>();
        for (ContoCorrente c: conti){
            if (cognome.equals(c.getCognome())){
                trovati.add(c);
            }
        }
        if (trovati.isEmpty()) return null;
        ContoCorrente[] ritornati;
        ritornati = new ContoCorrente[1];
        return trovati.toArray(ritornati);
    }

    public ContoCorrente ricercaPerNumeroConto(int numero){
        for (ContoCorrente c: conti){
            if (c.getNumeroConto() == numero){
                return c;
            }
        }
        return null;
    }
}
