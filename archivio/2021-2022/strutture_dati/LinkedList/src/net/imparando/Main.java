package net.imparando;

import java.util.LinkedList;

/**
 * Esempio di utilizzo di una LinkedList come pila e come coda
 * Appunti:
 * https://www.nebo.app/page/0da1afaa-7d19-41e1-beb2-e9fcace20e71
 */

public class Main {

    public static void main(String[] args) {
        LinkedList<Double> ll = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            ll.add(Math.random());
        }
        System.out.println(ll);
        ll.add(1.5);
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);

        //Utilizzo come pila
        ll.clear();
        ll.push(1.2);
        ll.push(4.5);
        ll.push(5.87);
        System.out.println(ll);
        double t = ll.pop();
        System.out.println(ll);
        System.out.println(t);

        //Utilizzo come coda
        ll.clear();
        ll.add(1.2);
        ll.add(4.5);
        ll.add(5.87);
        System.out.println(ll);
        t = ll.pop();
        System.out.println(ll);
        System.out.println(t);

    }
}
