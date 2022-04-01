package net.imparando;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /*AlberoBinarioRicerca a = new AlberoBinarioRicerca(42);
        a.aggiungiNodo(27);
        a.aggiungiNodo(13);
        a.aggiungiNodo(31);
        a.aggiungiNodo(2);
        a.aggiungiNodo(21);
        a.aggiungiNodo(71);
        a.aggiungiNodo(50);
        a.aggiungiNodo(84);
        a.aggiungiNodo(48);
        a.aggiungiNodo(62);
        a.aggiungiNodo(87);

        System.out.println(a.ricerca(84));
        System.out.println(a.ricerca(99));

        a.visitaInOrdine();*/
        int radice = (int)(Math.random()*1000000000);
        AlberoBinarioRicerca a = new AlberoBinarioRicerca(radice);
        LinkedList<Integer> l = new LinkedList<>();
        l.add(radice);
        for (int i = 0; i < 1000000; i++) {
            int temp = (int)(Math.random()*1000000000);
            l.add(temp);
            a.aggiungiNodo(temp);
        }
        System.out.println(l.size());
        System.out.println(a.size());

        double time = System.nanoTime();
        final int N = 500;
        //Ricerca nella lista
        for (int i = 0; i < N; i++) {
            l.indexOf((int)Math.random()*1000000000);
        }
        System.out.println("Tempo impiegato per cercare " + N + " elementi nella lista "
        + (System.nanoTime() - time)/1000000000 + " s.") ;
        time = System.nanoTime();
        //Ricerca nell'albero
        for (int i = 0; i < N; i++) {
            a.ricerca((int)Math.random()*1000000000);
        }
        System.out.println("Tempo impiegato per cercare " + N + " elementi nell'albero' "
                + (System.nanoTime() - time)/1000000 + " ms.") ;
        System.out.println("Attenzione a non farsi ingannare: il tempo per la lista è espresso in secondi, quello dell'albero in millisecondi.");

    }
}
