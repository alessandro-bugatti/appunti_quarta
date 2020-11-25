/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocontocorrente;

/**
 *
 * @author Maffi Daniele, Palestro Lorenzo, Basile Mirko
 */
public class ContoCorrente {
    private int numeroConto;
    private String nome;
    private String cognome;
    private double saldo;
    private static int contatore;
    private Operazione []operazioni;
    private int numeroOperazioni; 
    private static final int MAX = 100;
    
    public ContoCorrente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = 0;
        this.numeroConto = generaCodice();
        this.contatore = 1;
        this.operazioni = new Operazione[MAX];
        this.numeroOperazioni = 0;
    }
    
    public ContoCorrente(ContoCorrente c){
        this.nome = c.nome;
        this.cognome = c.cognome;
        this.saldo = c.saldo;
        this.numeroConto = c.numeroConto;
        this.contatore = c.contatore;
        //this.operazioni = c.operazioni;
        this.operazioni = new Operazione[MAX];
        for(int i = 0; i < c.numeroOperazioni; i++)
            this.operazioni[i] = c.operazioni[i];
        this.numeroOperazioni = c.numeroOperazioni;
    }
    
    public void modificaCognome(String s){
        this.cognome = s;
    }
    
    public boolean modificaDescrizioneOperazione(int posizione, String nuovaDescrizione){
        if(posizione < 0 || posizione >= this.numeroOperazioni)
            return false;
        this.operazioni[posizione].setDescrizione(nuovaDescrizione);
        return true;
    }
    
    private static int generaCodice(){
        return contatore++;
    }
    
    public double saldo(){
        return saldo;
    }
    
    public void deposita(double qta, String descrizione){
        Operazione op = new Operazione (qta, descrizione);
        this.operazioni[numeroOperazioni++] = op;
        this.saldo += qta;
    }
    
    public boolean preleva(double qta, String descrizione){
        if(qta <= this.saldo){
            Operazione op = new Operazione(-qta, descrizione);
            this.operazioni[numeroOperazioni++] = op;
            this.saldo -= qta;
            return true;
        }
        return false;
    }
    
    public boolean inseriscioperazione(Operazione op){
        operazioni[numeroOperazioni++] = op;
        this.saldo += op.getQta();
        return true;
    }
    
    public String getNominativo(){
        return this.cognome + ' ' + this.nome;
    }

    @Override
    public String toString() {
        String s = "numeroConto: " + numeroConto + ", nome: " + nome + ", cognome: " + cognome + ", saldo: " + saldo + "\n";
        for(int i = 0; i < this.numeroOperazioni; i++){
            s += this.operazioni[i].toString();
            s += "\n";
        }
        return s;
    }
}
