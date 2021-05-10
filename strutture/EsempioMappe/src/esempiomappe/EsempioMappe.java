/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempiomappe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author alex_2
 */
public class EsempioMappe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map <String, String> libri =
                new HashMap<>();
        //In questo esempio la chiave è un codice ISBN
        //e l'oggetto è una stringa che rappresenta i dati
        //di un libro
        libri.put("8900877", "I promessi sposi - Alessandro Manzoni");
        libri.put("8800800", "Diario di una schiappa - Jeff Kinney");
        
        String cercato = libri.get("8900877");
        System.out.println(cercato);
        
        System.out.println(libri);
        //clear pulisce la mappa
        libri.clear();
        System.out.println(libri);
        
        libri.put("8900877", "I promessi sposi - Alessandro Manzoni");
        libri.put("8800800", "Diario di una schiappa - Jeff Kinney");
        
        if (libri.containsKey("8900877"))
            System.out.println("La chiave è presente");
        else
            System.out.println("La chiave non è presente");

        if (libri.containsKey("8999877"))
            System.out.println("La chiave è presente");
        else
            System.out.println("La chiave non è presente");
        
        /* Non si può fare con le mappe perchè non sono
        iterabili
        
        for (String s:libri)
            System.out.println(s);
        */
        
        Set<Map.Entry<String, String>> s;
        s = libri.entrySet();
        
        for (Map.Entry<String, String> libro : s)
            System.out.println(libro.getValue());
        
        Set<String> sk;
        sk = libri.keySet();
        
        for (String key : sk)
            System.out.println(key);
        
        for (String key : sk)
            System.out.println(libri.get(key));
        
        //libri.remove("8900877");
        System.out.println(libri);
        
        ArrayList<String> valori = new ArrayList<>(libri.values());
        for (String titolo: valori)
            System.out.println(titolo);
    }
    
}
