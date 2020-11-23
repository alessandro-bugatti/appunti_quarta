/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocontocorrente;

/**
 *
 * @author Fusari
 */
public class ContoCorrente {
    private int numeroConto;
    private String nome;
    private String cognome;
    private double saldo;
    private static int contatore = 1;
    private Operazione operazioni[];
    private int numeroOperazioni;
    private static final int MAX = 100;
    
    public ContoCorrente(String nome, String cognome)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = 0;
        this.numeroConto = generaCodice();
        this.numeroOperazioni = 0;
        this.operazioni = new Operazione[MAX];
    }

    private static int generaCodice()
    {
        return contatore++;
    }
    
    public void deposita (double qta, String descrizione)
    {
        Operazione op = new Operazione (qta, descrizione);
        operazioni[numeroOperazioni] = op;
        numeroOperazioni++;
        this.saldo += qta;
    }
    
    public boolean preleva (double qta, String descrizione)
    {
        if (qta <= this.saldo)
        {
            this.saldo -= qta;
            return true;
        }
        return false;
    }
    
    public boolean inserisciOperazione(Operazione op)
    {
        operazioni[numeroOperazioni] = op;
        numeroOperazioni++;
        this.saldo += op.getQta();
        return true;
    }
    
    public double saldo()
    {
        return this.saldo;
    }
    
    public String getNominativo()
    {
        return this.nome + " " + this.cognome;
    }
    
    @Override
    public String toString() {
        String s = "ContoCorrente{" + "numeroConto=" + numeroConto + ", nome=" + nome + ", cognome=" + cognome + ", saldo=" + saldo + "}\n";
        for (int i = 0; i < this.numeroOperazioni; i++)
        {
            s += this.operazioni[i].toString();
        }
        return s;
    }
    
}
