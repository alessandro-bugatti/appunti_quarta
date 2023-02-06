package net.imparando;

import java.io.Serializable;
import java.util.ArrayList;

public class ContoCorrente implements Serializable, Comparable {
    private int numeroConto;
    private String nome;
    private String cognome;
    private float saldo;

    private boolean bloccato;

    private ArrayList<Movimento> movimenti;
    public ContoCorrente(int numeroConto, String nome, String cognome) {
        this.numeroConto = numeroConto;
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = 0;
        this.movimenti = new ArrayList<>();
        this.bloccato = false;
    }

    public String getCognome() {
        return cognome;
    }

    public int getNumeroConto() {
        return numeroConto;
    }


    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        String s =  "Numero conto: " + numeroConto + ", " + nome +
                ", " + cognome +
                " saldo = " + saldo + "\n";
        for (Movimento m: movimenti) {
            s += m + "\n";
        }
        return s;
    }

    public void aggiungiMovimento(Movimento m) throws SaldoNegativoException, ContoBloccatoException {
        if (m.getImporto() < 0 && this.bloccato)
        {
            movimenti.add(m);
            throw new ContoBloccatoException();
        }
        m.setBuonFine();
        movimenti.add(m);
        saldo += m.getImporto();
        if (saldo < 0){
            if (saldo < -500)
                this.bloccato = true;
            throw new SaldoNegativoException(saldo);
        }
    }

    /**
     * Confronta il conto corrente this con quello passato
     * @param o the object to be compared.
     * @return 1 se this è maggiore di o
     * -1 se this è minore di o
     * o se hanno lo stesso nome e cognome
     */
    @Override
    public int compareTo(Object o) {
        /*String cognome = ((ContoCorrente)o).cognome;
        String nome = ((ContoCorrente)o).nome;
        if (this.cognome.compareTo(cognome) > 0)
            return 1;
        else if (this.cognome.compareTo(cognome) < 0)
            return -1;
        else{
            if (this.nome.compareTo(nome) > 0)
                return 1;
            if (this.nome.compareTo(nome) < 0)
                return -1;
        }
        return 0;*/
        String cognome = ((ContoCorrente)o).cognome;
        String nome = ((ContoCorrente)o).nome;
        String contoPassato = cognome + nome;
        String contoThis = this.cognome + this.nome;
        return contoThis.compareTo(contoPassato);
    }
}
