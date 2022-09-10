package net.imparando;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un intero: ");
        //Legge un intero
        //equivalente di cin >> n; con n intero in C++
        int n = in.nextInt();
        System.out.println("Intero letto " + n);

        //Legge un float
        //equivalente di cin >> n; con n float in C++
        //Attenzione: per questioni relative alla gestione del locale
        //l'inserimento di un float richiede la virgola e non il punto
        //mentre la stampa userà il punto, è il comportamento corretto
        System.out.println("Inserisci un numero reale: ");
        float f = in.nextFloat();
        System.out.println("Reale letto " + f);

        //Legge una stringa
        //equivalente di cin >> s; con s string in C++
        System.out.println("Inserisci una parola: ");
        String s = in.next();
        System.out.println("La parola letta è: " + s);

        //Legge fino al primo a capo
        //equivalente di getline (cin, s); con s string in C++
        //e ha lo stesso tipo di problemi se usata insieme a quelle
        //precedenti, ad esempio in questo caso non leggerà niente
        //perchè la lettura precedente lascia un a capo nello stream
        //di lettura
        System.out.println("Inserisci una frase (purtroppo non permetterà l'inserimento): ");
        String t = in.nextLine();
        System.out.println("La frase letta è: " + t);
        //Se invece rifaccio la stessa lettura stavolta funzionerà,
        //perchè quella precedente ha rimosso l'a capo dallo stream
        //Morale della fiaba: non mischiare le due cose, ho usare solo le prime tre
        //o usare solo la nextLine()
        System.out.println("Inserisci una frase (stavolta verrà letta): ");
        t = in.nextLine();
        System.out.println("La frase letta è: " + t);
    }
}
