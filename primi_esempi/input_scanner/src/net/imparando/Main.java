package net.imparando;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un intero: ");
        //Legge in intero
        //equivalente di cin >> n; in C++
        int n = in.nextInt();
        System.out.println("Intero letto " + n);

        System.out.println("Inserisci un numero reale: ");
        float f = in.nextFloat();
        System.out.println("Reale letto " + f);

        System.out.println("Inserisci una parola: ");
        String s = in.next();
        System.out.println("La parola letta è: " + s);

        System.out.println("Inserisci una frase: ");
        String t = in.nextLine();
        System.out.println("La frase letta è: " + t);

    }
}
