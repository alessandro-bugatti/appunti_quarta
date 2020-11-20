/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eserciziocontocorrente;

/**
 *
 * @author Alessandro Bugatti
 */
public class ContoCorrente {
    private int numeroConto;
    private String nome;
    private String cognome;
    private double saldo;
    private static int contatore = 1;
    
    public ContoCorrente(String nome, String cognome)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = 0;
        this.numeroConto = generaCodice();
    }
    
    /* Probabilmente qua non serve un costruttore di copia
    public ContoCorrente(ContoCorrente c)
    {
        this.nome = c.nome;
        this.cognome = c.cognome;
        this.saldo = c.saldo;
        this.numeroConto = c.numeroConto;
    }
    */
    
    public void deposita(double qta)
    {
        this.saldo += qta;
    }
    
    public boolean preleva(double qta)
    {
        if (qta <= this.saldo)
        {
            this.saldo -= qta;
            return true;
        }
        return false;
    }

    private static int generaCodice()
    {
        return contatore++;
        //return (int)(Math.random() * 1000000.0);
    }
    
    @Override
    public String toString() {
        return "ContoCorrente{" + "numeroConto=" + numeroConto + ", nome=" + nome + ", cognome=" + cognome + ", saldo=" + saldo + '}';
    }
    
    
}
