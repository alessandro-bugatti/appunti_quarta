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
    
    public Operazione(double qta, String descrizione){
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
