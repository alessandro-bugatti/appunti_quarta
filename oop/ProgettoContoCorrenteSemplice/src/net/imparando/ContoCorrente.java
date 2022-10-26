package net.imparando;

public class ContoCorrente {
    private String nome;
    private String cognome;
    private float saldo;

    public ContoCorrente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = 0;
    }

    /**
     * Metodo che permette di prelevare una certa quantità
     * di denaro
     * @param prelievo Quantità prelevata
     * @return Saldo corrente
     */
    public float preleva(float prelievo){
        if (prelievo <= this.saldo)
            this.saldo -= prelievo;
        return this.saldo;
    }

    /**
     * Metodo che permette di depositare una certa quantità di denaro
     * @param deposito Quantità depositata
     * @return Saldo corrente
     */
    public float deposita(float deposito){
        this.saldo += deposito;
        return this.saldo;
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
