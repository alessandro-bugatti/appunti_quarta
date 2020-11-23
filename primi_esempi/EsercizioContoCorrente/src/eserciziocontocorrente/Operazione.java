/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocontocorrente;
import java.time.LocalDateTime;
/**
 *
 * @author Fusari
 */
public class Operazione {
    private double qta;
    private LocalDateTime dataTempo;
    private String descrizione;
    
    public Operazione (double qta, String descrizione)
    {
        this.qta = qta;
        this.descrizione = descrizione;
        this.dataTempo = LocalDateTime.now();
    }

    public double getQta()
    {
        return qta;
    }
    
    @Override
    public String toString() {
        return "Operazione{" + "qta=" + qta + ", dataTempo=" + dataTempo + ", descrizione=" + descrizione + "}\n";
    }
    
}
