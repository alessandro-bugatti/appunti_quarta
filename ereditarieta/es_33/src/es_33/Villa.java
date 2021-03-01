/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es_33;

/**
 *
 * @author basil
 */
public class Villa extends Abitazione {

    private int numeroPiani;
    private int giardino;
    private boolean piscina;

    //Da correggere: di solito prima si mettono gli attributi del padre
    public Villa(int numeroPiani, int giardino, boolean piscina, int stanze, int superficie, String indirizzo, String citta) {
        super(stanze, superficie, indirizzo, citta);
        this.numeroPiani = numeroPiani;
        this.giardino = giardino;
        this.piscina = piscina;
    }

    public Villa(Villa b) {
        //Da approfondire il perchè passo una Villa a un costruttore
        //che vorrebbe un'abitazione
        super(b);
        this.numeroPiani = b.numeroPiani;
        this.giardino = b.giardino;
        this.piscina = b.piscina;
    }

    public int getGiardino() {
        return giardino;
    }
    
    
    
    //Esempio didattico, ovviamente non ha senso nella realtà
    //L'Override è assolutamente utile, ma non strettatamente necessario
    @Override
    public int getStanze(){
        return super.getStanze()*3;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Villa other = (Villa) obj;
        if (this.numeroPiani != other.numeroPiani) {
            return false;
        }
        if (this.giardino != other.giardino) {
            return false;
        }
        if (this.piscina != other.piscina) {
            return false;
        }
        if (this.getCitta().equals(other.getCitta())) {
            return false;
        }
        if (this.getIndirizzo().equals(other.getIndirizzo())) {
            return false;
        }
        if (this.getStanze() != (other.getStanze())) {
            return false;
        }
        return this.getSuperficie() == other.getSuperficie();
    }

    @Override
    public String toString() {
        return super.toString() + "ha " + numeroPiani + "piani," + "giardino: " + giardino + "piscina: " + piscina;
    }

}