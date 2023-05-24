package net.imparando;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    AlberoBinario a = new AlberoBinario(42);
        a.add(42);
        a.add(27);
        a.add(71);
        a.add(13);
        a.add(31);
        a.add(84);
        a.add(50);
        a.add(2);
        a.add(21);
        a.add(48);
        a.add(62);
        a.add(87);

        a.visitaAnticipata();
        a.visitaPosticipata();
        a.visitaInOrder();

        //Verifica del conteggio dei minori di con il metodo creato
        System.out.println("Minori di 30: " + a.quantiMinori(30));
        System.out.println("Minori di 60: " + a.quantiMinori(60));
        //Verifica della ricerca del percorso più leggero
        System.out.println("Il percorso più leggero pesa: " + a.piuLeggero());

        //Misura delle prestazioni
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < 1000000; i++)
            l.add(i);
        Collections.shuffle(l);
        a = new AlberoBinario(500000);
        for (int i = 0; i < 1000000; i++)
            a.add(l.get(i));



        //Ricerca di N elementi nell'array
        final int N = 10000;
        System.out.println("Inizio della ricerca sull'array");
//        for (int i = 0; i < N; i++)
//            l.indexOf(i);
        //Ricerca di N elementi nell'albero
        System.out.println("Inizio della ricerca sull'albero");
        for (int i = 0; i < N; i++)
            a.ricerca(i);



    }
}
