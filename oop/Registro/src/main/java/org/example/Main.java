package org.example;

import java.util.Scanner;

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

        Studente t = new Studente("Anna", "Beluni", -164, 62);
        System.out.println(t.getAltezza());
        System.out.println(t);
        System.out.println(s);

        //Esempio di utilizzo della classe Scanner
        Scanner in;
        in = new Scanner(System.in);
        int i;
        System.out.println("Inserisci un numero intero: ");
        i = in.nextInt();
        System.out.println("Hai inserito il numero " + i);

        float f;
        System.out.println("Inserisci un numero con virgola: ");
        f = in.nextFloat();
        System.out.println("Hai inserito il numero " + f);

        String  str;
        System.out.println("Inserisci una stringa: ");
        str = in.next();
        System.out.println("Hai inserito la parola " + str);


    }
}