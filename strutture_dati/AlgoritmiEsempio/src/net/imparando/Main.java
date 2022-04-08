package net.imparando;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < 10; i++) {
            c = (int)(Math.random() * 1000);
            a.add(c);
        }
        System.out.println("Vettore iniziale:" + a);
        System.out.println("Massimo elemento: "  + Collections.max(a));
        System.out.println("Minimo elemento: "  + Collections.min(a));
        //Ordinamento del vettore
        Collections.sort(a);
        System.out.println("Vettore ordinato: " + a);
        //Ricerca di un elemento nel vettore
        System.out.println("L'elemento " + c + " ha indice " + Collections.binarySearch(a, c));
    }
}
