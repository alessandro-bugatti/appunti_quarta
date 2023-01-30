package net.imparando;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Banca implements Serializable {
    ArrayList<ContoCorrente> conti;
    HashMap<String, ArrayList<ContoCorrente> > mappaCognome;

    private int generaNuovoNumeroConto(){
        return conti.size() + 1;
    }
    public Banca(){
        conti = new ArrayList<>();
        mappaCognome = new HashMap<>();
    }

    public boolean creaConto(String nome, String cognome){
        ContoCorrente c = new ContoCorrente(generaNuovoNumeroConto(), nome, cognome);
        conti.add(c);
        if (mappaCognome.containsKey(c.getCognome())){
            mappaCognome.get(c.getCognome()).add(c);
        }
        else{
            ArrayList<ContoCorrente> al = new ArrayList<>();
            al.add(c);
            mappaCognome.put(c.getCognome(), al);
        }
        return true;
    }

    public int numeroConti(){
        return conti.size();
    }


    public ContoCorrente[] ricercaPerCognome(String cognome){
        ArrayList<ContoCorrente> trovati;
        trovati = mappaCognome.get(cognome);
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
