package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        PArte che mostra come gli oggetti vengono creati in Java
         */

        /*
        Dichiaro una variabile di classe Studente
        e creo un oggetto a cui farà riferimento
         */
        Studente s = new Studente();
//
//        //Assegno il valore di un attributo
//        s.nome = "Alessandro";
//        //Stampo il valore di alcuni attributi
//        System.out.println(s.nome);
//        //Gli attributi non inizializzati hanno un valore di
//        //default specifico del tipo
//        System.out.println(s.cognome);
//        System.out.println(s.altezza);
//
//        Studente t = s;
//        System.out.println(t.nome);
//        s.nome = "Carlo";
//        System.out.println(t.nome);
//        //s = null;
//        //System.out.println(s.nome);
//        System.out.println(t.nome);
//
//        System.out.println(s);
//        System.out.println(t);
//        s = new Studente();
//        s = new Studente();
//        System.out.println(s);
//        System.out.println(t);
//
//        /*
//        Parte che mostra l'information hiding
//         */
//
//        //Chi usa la classe Studente la usa male
//        s.altezza = -120;
        s.setAltezza(-120);
        System.out.println(s.getAltezza());

    }
}