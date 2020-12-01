/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocontocorrente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Maffi Daniele, Palestro Lorenzo, Basile Mirko
 */
public class Operazione {
    private double qta;
    private LocalDateTime dataTempo;
    private String descrizione;
    private String data;
    
    public double getQta(){
        return qta;
    }
    
    public void setDescrizione(String s){
        this.descrizione = s;
    }
    
    //Progettiamo il costruttore in modo che se si verifica una condizione
    //anomala il costruttore lancia un'eccezione
    //Dichiarando che il metodo lancia un'eccezione, chi userà
    //questo metodo è obbligato a gestirlo o rilanciare l'eccezione
    //handle or declare
    public Operazione(double qta, String descrizione) throws OperazioneNullaException {
        if (qta == 0 && descrizione.equals(""))
            throw new OperazioneNullaException("Operazione stupida");
        else if (qta == 0)
            //Lanciamo un'eccezione
            throw new OperazioneNullaException("Hai inserito una quantità nulla");
        else if (descrizione.equals(""))
            throw new OperazioneNullaException("Manca la descrizione");
        this.qta = qta;
        this.descrizione = descrizione;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        dataTempo = LocalDateTime.now();
        data = dtf.format(dataTempo);
    }

    /**
     * Costruttore di copia
    */
    public Operazione(Operazione op)
    {
        this.qta = op.qta;
        this.data = op.data;
        this.dataTempo = op.dataTempo;
        this.descrizione = op.descrizione;
    }
    @Override
    public String toString() {
        return "quota: " + qta + ", data e ora: " + data + ", descrizione: " + descrizione;
    }   
}
