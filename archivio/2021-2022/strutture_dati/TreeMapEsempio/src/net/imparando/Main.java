package net.imparando;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, String> a = new TreeMap<>();
        a.put("Alberto", "333123");
        a.put("Maria", "333456");
        a.put("Piero", "333111");
        a.put("Giacomo", "339123");
        a.put("Giovanna", "343123");
        System.out.println("Il valore corrispondente a Alberto è " + a.get("Alberto"));
        System.out.println("Il valore corrispondente a Alberta è " + a.get("Alberta"));
        /**
         * Attenzione, le mappe non sono iterabili,
         * così non si può fare

            for (String numero: a) {

            }
         */
        //Verifica se una chiave è o meno contenuta nell'albero
        //La prestazione è di tipo logN, quindi buona
        System.out.println("Alberto è una chiave dell'albero? " + a.containsKey("Alberto"));
        //Verifica se un valore è o meno contenuto nell'albero
        //La prestazione è di tipo N, quindi scadente
        System.out.println("333123 è un valore dell'albero? " + a.containsValue("333123"));
        //Ritorna una vista di tutte le chiavi dell'albero, in ordine naturale
        Set<String> keys = a.keySet();
        System.out.println("Elenco delle chiavi dell'albero");
        for (String s: keys) {
            System.out.print(s + " ");
        }
        System.out.println();
        // Il set ritornato non è modificabile, è "in sola lettura"
        // keys.add("Giorgio"); non si può fare

        //Ritorna una vista di tutti i valori contenuti
        //nell'albero, anche in questo caso non è modificabile
        Collection<String> v = a.values();
        System.out.println("Elenco dei valori dell'albero");
        for (String s: v) {
            System.out.print(s + " ");
        }
    }
}
