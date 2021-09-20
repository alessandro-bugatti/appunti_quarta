/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author alex_2
 */
public class Es_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        AnagraficaClienti clienti;
        clienti = new AnagraficaClienti();
        clienti.aggiungi("54723527", "Ale", "Pini", 
                "Via tale", "Brescia");
        clienti.aggiungi("547245627", "Anto", "Poni", 
                "Via tale", "Brescia");
        Cliente c = new Cliente("548888627", "Piero", "Ponalli", 
                "Via tale", "Milano");
        clienti.aggiungi(c);
        AnagraficaDipendenti dipendenti;
        dipendenti = new AnagraficaDipendenti();
        dipendenti.aggiungi("65876458", "Paolo", "Scanale");
        dipendenti.aggiungi("65844458", "Luca", "Oretti");
        //System.out.println(clienti.ricercaPerCodice("Pini"));
        ElencoTelefonate elenco = new ElencoTelefonate();
        elenco.aggiungi(new Telefonata("0303003030", "54723527", "65876458", "Spegni e riaccendi"));
        elenco.aggiungi(new Telefonata("0303003029", "548888627", "65876458", "Spegni e riaccendi"));
        elenco.aggiungi(new Telefonata("0303003030", "547245627", "65876458", "Spegni e riaccendi due volte"));
        
        
        System.out.println("Call Center");
        
        while(true)
        {
            System.out.println("Inserisci il numero della chiamata: ");
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader tastiera = new BufferedReader(input);
            String numeroTelefono = tastiera.readLine();
            Telefonata t = elenco.ricercaUltimaTelefonata(numeroTelefono);
            if (t == null)
            {
                
            }
            else
            {
                Cliente temp; 
                temp = clienti.ricercaPerCodice(t.getCodiceCliente());
                System.out.println("Dati cliente chiamante: ");
                System.out.println(temp);
                System.out.println("Dati dipendente che ha gestito l'ultima chiamata: ");
                Dipendente tempD;
                tempD = dipendenti.ricercaPerCodice(t.getCodiceDipendente());
                System.out.println(tempD);
                System.out.println("L'ultima chiamata è stata effettuata il :" + 
                        t.getIstanteChiamata());
                System.out.println("Note: " + t.getNote());
                System.out.println("Inserisci le note della chiamata attuale: ");
                String note = tastiera.readLine();
                Telefonata nuova = new Telefonata(
                        numeroTelefono, 
                        temp.getCodice(), 
                        "65844458", 
                        note);
                elenco.aggiungi(nuova);
                System.out.println(elenco);
                ArrayList<Telefonata> telefonate;
                telefonate = elenco.getTelefonate();
                Collections.sort(telefonate);
                for (Telefonata t2 :telefonate)
                    System.out.println(t2);
            }
        }
        
    
    }
    
}
