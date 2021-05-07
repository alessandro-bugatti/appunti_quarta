/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziarraylist;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Esercizi presi da https://www.w3resource.com/java-exercises/collection/index.php#arraylist
 * @author alex_2
 */
public class EserciziArrayList {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esercizio 1
        ArrayList<String> colori;
        colori = new ArrayList<String>();
        colori.add("Rosso");
        colori.add("Verde");
        colori.add("Nero");
        System.out.println(colori);
        for (int i = 0; i < colori.size(); i++)
            System.out.println("colori[" + i + "]: " + colori.get(i));
        //Esercizio 2
        String s = "";
        for(String colore : colori)
            s += colore;
        System.out.println(s);
        //Esercizio 3
        colori.add(0, "Bianco");
        System.out.println(colori);
        //Esercizio 4
        System.out.println(colori.get(2));
        //Esercizio 5
        colori.set(2, "Azzurro");
        System.out.println(colori);
        //Seconda versione, sostituisco un colore usando
        //il suo nome e non l'indice
        colori.set(colori.indexOf("Nero"), "Viola");
        System.out.println(colori);
        //Esercizio 6
        colori.remove(2);
        System.out.println(colori);
        //Esercizio 7
        boolean trovato = colori.contains("Bianco"); 
        if (trovato)
            System.out.println("Trovato");
        else
            System.out.println("Non trovato");
        trovato = colori.contains("Azzurro"); 
        if (trovato)
            System.out.println("Trovato");
        else
            System.out.println("Non trovato");
        //Esercizio 8
        colori.add("Giallo");
        Collections.sort(colori);
        System.out.println(colori);
    }
    
}
