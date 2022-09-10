/*
  Copyright (C) 2013 Alessandro Bugatti (alessandro.bugatti@istruzione.it)

  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License
  as published by the Free Software Foundation; either version 2
  of the License, or (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/

/**
 *  Classe semplice per gestire un conto corrente
 *  con le operazioni di creazione, accredito, addebito e saldo
 *  \author Alessandro Bugatti
 *
 *  version 0.1
 *  date  Creazione  07/03/2009
 *  date  Ultima modifica 02/10/2013
 *
 */


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.imparando;

import java.io.Serializable;

/**
 * Classe semplice per gestire un conto corrente
 * con le operazioni di creazione, accredito, addebito e saldo
 *  
 * @author Alessandro Bugatti
 */
public class ContoCorrente implements Serializable {
    private String codice;
    private String nome;
    private String cognome;
    //private double saldo;
    private Operazione operazioni[];
    private int n_operazioni;
    private static final int MAX_OPERAZIONI = 1000;

    /**
     * Genera un codice unico di 6 cifre
     * @return Codice unico (in senso probabilistico) di 6 cifre
     */

    private String generaCodice()
    {
        return GeneratoreCodici.genera();
    }

    /**
     * Costruisce un oggetto con nome e cognome, creando in automatico un codice
     * attualmente fittizio e posto a 0000000 e settando il saldo a zero.
     * @param n Nome
     * @param c Cognome
     */
    public ContoCorrente(String n, String c)
    {
        nome = n;
        cognome = c;
        codice = generaCodice();
        //saldo = 0;
        operazioni = new Operazione[MAX_OPERAZIONI];
        n_operazioni = 0;
    }
    
    public void aggiungiOperazione(Operazione o)
    {
        if (o == null)
            return;
        operazioni[n_operazioni] = o;
        n_operazioni++;
    }

    public String getListaOperazioni()
    {
        String s = "";
        for (int i = 0; i < this.n_operazioni; i++)
            s += operazioni[i].toString() + "\n";
        return s;
    }
    /**
     * Restituisce il saldo del conto corrente
     * @return Salso
     */
    public double getSaldo()
    {
        //return saldo;
        double saldo = 0;
        for (int i = 0; i < this.n_operazioni; i++)
            saldo += this.operazioni[i].getAmmontare();
        return saldo;
    }
    
    /**
     * Ritorna il nominativo formato da  cognome e nome separati da spazio
     * @return il nominativo
     */
    public String getNominativo()
    {
        return cognome + " " + nome;
    }


    public String getCodice() {
        return codice;
    }
}
