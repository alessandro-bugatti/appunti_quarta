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
    private Operazione[] operazioni;
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
    
    public void deposita(double qta, String descrizione) throws OperazioneNullaException{
        Operazione op = new Operazione (qta, descrizione);
        //Opzione handle
        //In questo caso non sembra il punto giusto dove gestirla
        /*
        Operazione op = null;
        try{
            op = new Operazione (qta, descrizione);
        }
        catch(OperazioneNullaException e)
        {
            System.out.println("Operazione non riuscita");
            return;
        }*/
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
    
    public boolean inserisciOperazione(Operazione op){
        operazioni[numeroOperazioni++] = op;
        this.saldo += op.getQta();
        return true;
    }
    
    /**
     * Ritorna un elenco di tutti i prelievi
     * @return Il vettore contenente le operazioni di prelievo
     */
    public Operazione[] getPrelievi()
    {
        Operazione[] temp;
        int numeroPrelievi = 0;
        for (int i = 0; i < this.numeroOperazioni; i++)
            if (this.operazioni[i].getQta() < 0)
                numeroPrelievi++;
        if (numeroPrelievi > 0)
        {
            temp = new Operazione[numeroPrelievi];
            int pos = 0;
            for (int i = 0; i < this.numeroOperazioni; i++)
                if (this.operazioni[i].getQta() < 0)
                    temp[pos++] = new Operazione(this.operazioni[i]);
            return temp;
        }
        else
            return null;
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
