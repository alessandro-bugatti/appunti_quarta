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

        ArrayList<Punto> ap = new ArrayList<>();
        ap.add(new Punto(2,3));
        ap.add(new Punto(-2,33));
        ap.add(new Punto(-1,-1));
        System.out.println("Il punto più grande è " + Collections.max(ap));
        System.out.println("Il punto più piccolo è " + Collections.min(ap));
        System.out.println("Prima dell'ordinamento " + ap);
        Collections.sort(ap);
        System.out.println("Dopo l'ordinamento " + ap);
        System.out.println("Ricerca di [-1,-1]: " + Collections.binarySearch(ap,new Punto(-1,-1)));
        Punto p = new Punto(-2, 33);
        System.out.println("Ricerca di [-2,33]: " + Collections.binarySearch(ap,p));
        System.out.println("Ricerca di [-1,-10]: " + Collections.binarySearch(ap,new Punto(-1,-10)));
    }
}
