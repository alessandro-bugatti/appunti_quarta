/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es_23;

import java.util.ArrayList;

/**
 *
 * @author Alessandro Bugatti
 */
public class ElencoTelefonate {
    ArrayList<Telefonata> telefonate;

    public ElencoTelefonate() {
        this.telefonate = new ArrayList<>();
    }
    
    public void aggiungi(Telefonata tel)
    {
        this.telefonate.add(tel);
    }
    
    public Telefonata ricercaUltimaTelefonata(String numeroTelefono)
    {
        for (int i = this.telefonate.size() - 1; i >= 0 ; i--)
        {
            if (this.telefonate.get(i).getTelefono() == numeroTelefono)
                return this.telefonate.get(i);
        }
        return null;
    }
}
