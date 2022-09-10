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
        a.visitaAnticipata();
        a.visitaPosticipata();
        System.out.println("Dimensione non ricorsiva: " + a.size());
        System.out.println("Dimensione ricorsiva: " + a.sizeRicorsiva());
    }
}
