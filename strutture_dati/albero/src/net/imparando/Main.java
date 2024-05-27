package net.imparando;

import net.imparando.alberi.Albero;

public class Main {

    public static void main(String[] args) throws Exception {
        Albero a = new Albero(42);
        a.aggiungiFiglio(42, 27);
        a.aggiungiFiglio(42, 9);
        a.aggiungiFiglio(27, 44);
        a.aggiungiFiglio(27, 13);
        a.aggiungiFiglio(27, 91);
        a.aggiungiFiglio(13, 2);
        a.aggiungiFiglio(9, 26);
        a.aggiungiFiglio(9, 34);
        a.aggiungiFiglio(26, 51);
        a.aggiungiFiglio(26, 17);
        a.aggiungiFiglio(26, 22);

        //Stampa in visita anticipata
        System.out.println("Visita anticipata");
        a.visitaAnticipata();

        System.out.println("Visita posticipata");
        a.visitaPosticipata();

        System.out.print("Massimo: ");
        System.out.println(a.massimo());

        int n = 51;
        System.out.println("Profondità del nodo " + n);
        System.out.println(a.profondita(n));

        n = 26;
        System.out.println("Profondità del nodo " + n);
        System.out.println(a.profondita(n));

        n = 77;
        System.out.println("Profondità del nodo " + n);
        System.out.println(a.profondita(n));

    }
}
