package net.imparando;

public class ContoCorrente {
    private int numeroConto;
    private String nome;
    private String cognome;
    private float saldo;

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
    }

    public String getCognome() {
        return cognome;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    @Override
    public String toString() {
        return "net.imparando.ContoCorrente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
