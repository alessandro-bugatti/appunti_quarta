package net.imparando;

import java.io.Serializable;
import java.util.ArrayList;

public class ContoCorrente implements Serializable {
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
}
