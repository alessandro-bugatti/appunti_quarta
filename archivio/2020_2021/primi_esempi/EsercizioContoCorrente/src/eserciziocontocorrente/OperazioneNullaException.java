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
public class OperazioneNullaException extends Exception{
    private String descrizione;
    
    public OperazioneNullaException(String descrizione)
    {
        this.descrizione = descrizione;       
    }

    public String getDescrizione()
    {
        return descrizione;
    }
    
    @Override
    public String toString() {
        return descrizione;
    }
    
    
}
