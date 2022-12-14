package net.imparando;

import java.io.Serializable;

public class ContoCorrente implements Serializable {
    private int numeroConto;
    private String nome;
    private String cognome;
    private float saldo;

    private boolean bloccato;

    private Movimento[] movimenti;

    private int n_movimenti;

    private static final int MAX_MOVIMENTI = 100;

    public ContoCorrente(int numeroConto, String nome, String cognome) {
        this.numeroConto = numeroConto;
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = 0;
        this.movimenti = new Movimento[MAX_MOVIMENTI];
        this.n_movimenti = 0;
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
        return "Numero conto: " + numeroConto + ", " + nome +
                ", " + cognome +
                " saldo = " + saldo;
    }

    public void aggiungiMovimento(Movimento m) throws SaldoNegativoException, ContoBloccatoException {
        if (m.getImporto() < 0 && this.bloccato)
        {
            movimenti[n_movimenti] = m;
            n_movimenti++;
            throw new ContoBloccatoException();
        }
        //if se volessimo controllare di non sforare il vettore
        m.setBuonFine();
        movimenti[n_movimenti] = m;
        n_movimenti++;
        saldo += m.getImporto();
        if (saldo < 0){
            throw new SaldoNegativoException(saldo);
        }
    }
}
