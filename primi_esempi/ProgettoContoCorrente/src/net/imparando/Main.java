package net.imparando;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Programma che deve consentire di fare le seguenti operazioni:
 * creazione di un nuovo conto corrente
 * aggiunta di un'operazione a un conto corrente
 * visualizzazione dello stato di un conto corrente
 */
public class Main {

    private static void menu(){
        System.out.println("Programma per la gestione dei conti correnti");
        System.out.println("1 - Creazione di un nuovo conto");
        System.out.println("2 - Inserisci operazione");
        System.out.println("3 - Visualizza informazioni");
        System.out.println("0 - Termina il programma");
    }

    public static void main(String[] args) {
        menu();
    }
}
