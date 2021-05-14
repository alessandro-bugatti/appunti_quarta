/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_23;

/**
 *
 * @author alex_2
 */
public class Es_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnagraficaClienti clienti;
        clienti = new AnagraficaClienti();
        clienti.aggiungi("54723527", "Ale", "Pini", 
                "Via tale", "Brescia");
        clienti.aggiungi("547245627", "Anto", "Poni", 
                "Via tale", "Brescia");
        Cliente c = new Cliente("548888627", "Piero", "Ponalli", 
                "Via tale", "Milano");
        clienti.aggiungi(c);
        System.out.println(clienti.ricercaPerCodice("Pini"));
        ElencoTelefonate elenco = new ElencoTelefonate();
        elenco.aggiungi(new Telefonata("0303003030", "54723527", "65876458", "Spegni e riaccendi"));
        elenco.aggiungi(new Telefonata("0303003029", "548888627", "65876458", "Spegni e riaccendi"));
        elenco.aggiungi(new Telefonata("0303003030", "547245627", "65876458", "Spegni e riaccendi due volte"));
        
        String numeroTelefono = "0303003030";
        
        Telefonata t = elenco.ricercaUltimaTelefonata(numeroTelefono);
        System.out.println(t);
        System.out.println(clienti.ricercaPerCodice(t.getCodiceCliente()));
    }
    
}
