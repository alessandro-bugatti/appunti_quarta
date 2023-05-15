package net.imparando;

public class Main {

    public static void main(String[] args) {
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
        System.out.println("Visita anticipata:");
        a.visitaAnticipata();
        System.out.println("Visita posticipata:");
        a.visitaPosticipata();
        System.out.println("Valore massimo nell'albero:");
        System.out.println(a.massimo());
        System.out.println("Profondità di 17:");
        System.out.println(a.profondita(17));
        System.out.println("Profondità di 71:");
        System.out.println(a.profondita(71));
    }
}
