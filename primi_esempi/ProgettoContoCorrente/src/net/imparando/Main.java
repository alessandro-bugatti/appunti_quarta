package net.imparando;

import java.io.*;
import java.util.Scanner;

/**
 * Programma che deve consentire di fare le seguenti operazioni:
 * creazione di un nuovo conto corrente
 * aggiunta di un'operazione a un conto corrente
 * visualizzazione dello stato di un conto corrente
 */
public class Main {

    /**
     * Metodo che mostra un menu
     */
    private static void menu() {
        System.out.println("Programma per la gestione dei conti correnti");
        System.out.println("1 - Creazione di un nuovo conto");
        System.out.println("2 - Inserisci operazione");
        System.out.println("3 - Visualizza informazioni");
        System.out.println("0 - Termina il programma");
    }

    /**
     * Metodo che aggiunge un nuovo conto corrente al vettore dei conti
     * @param conti Vettore dei conti correnti
     * @param posizione Posizione del vettore dove deve essere aggiunto il conto corrente
     * @param in Scanner per la lettura
     */
    private static void aggiungiContoCorrente(ContoCorrente conti[], int posizione, Scanner in) {
        System.out.println("Inserisci il nome del correntista: ");
        String nome = in.next();
        System.out.println("Inserisci il cognome del correntista: ");
        String cognome = in.next();
        ContoCorrente c = new ContoCorrente(nome, cognome);
        conti[posizione] = c;
        System.out.println("Il codice del nuovo conto è :" + c.getCodice());
    }

    /**
     * Meotodo che permette di aggiungere un'operazione a un conto tramite il suo codice
     * @param conti Vettore dei conti correnti
     * @param n_conti NUmero di conti correnti
     * @param in Scanner per la lettura
     */
    public static void aggiungiOperazione(ContoCorrente conti[], int n_conti, Scanner in) {
        System.out.println("Inserisci il codice: ");
        String codice = in.next();
        ContoCorrente attuale = null;
        for (int i = 0; i < n_conti; i++) {
            if (codice.equals(conti[i].getCodice()))
                attuale = conti[i];
        }
        if (attuale == null)
            return;
        System.out.println("Dimmi l'ammontare dell'operazione: ");
        double soldi = in.nextDouble();
        System.out.println("Dimmi la causale: ");
        String causale = in.next();
        Operazione o = new Operazione(soldi, causale);
        attuale.aggiungiOperazione(o);
    }

    /**
     * Visualizza le informazioni di un conto corrente passato per codice
     * @param conti Vettore dei conti correnti
     * @param n_conti NUmero di conti correnti
     * @param in Scanner per la lettura
     */
    private static void visualizzaInformazioni(ContoCorrente conti[], int n_conti, Scanner in) {
        System.out.println("Inserisci il codice: ");
        String codice = in.next();
        ContoCorrente attuale = null;
        for (int i = 0; i < n_conti; i++) {
            if (codice.equals(conti[i].getCodice()))
                attuale = conti[i];
        }
        if (attuale == null) {
            System.out.println("Non esiste nessun conto con questo codice");
            return;
        }
        System.out.println(attuale.getNominativo());
        System.out.println(attuale.getListaOperazioni());
        System.out.println("Il saldo attuale vale: " + attuale.getSaldo() + " euro");

    }

    /**
     * Metodo che deserializza il file contenente i conti correnti salvati
     * Le printStackTrace servono solo per il debug, sarebbero da togliere
     * @return Il vettore che contiene i conti correnti
     */
    private static ContoCorrente[] caricaConti() {
        FileInputStream file;
        ObjectInputStream in;
        try {
            file = new FileInputStream("conticorrenti.bin");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        try {
            in = new ObjectInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        ContoCorrente[] c;
        try {
            c = (ContoCorrente[]) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return c;
    }

    /**
     * Metodo che salva il vettore dei conti correnti passato come parametro
     * @param c
     * @throws IOException
     * @throws FileNotFoundException
     */
    private static void salvaConti(ContoCorrente[] c) throws IOException, FileNotFoundException {
        FileOutputStream file = new FileOutputStream("conticorrenti.bin");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(c);
    }

    /**
     * Meotodo di utilità che stampa tutti i codici presenti nel vettore dei conti correnti
     * @param c Vettore dei conti correnti
     * @param n Numero di conti correnti presenti nel vettore
     * @return Stringa contenente tutti i codici e una linea di intestazione
     */
    private static String elencoCodici(ContoCorrente[] c, int n)
    {
        String s = "Elenco codici correntisti\n";
        for (int i = 0; i < n; i++) {
            s += c[i].getCodice() + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        final int MAX_CONTI = 100;
        int scelta;
        ContoCorrente contiCorrenti[] = null;
        int nContiCorrenti = 0;
        Scanner in = new Scanner(System.in);

        //Provo a caricare lo stato precedente
        contiCorrenti = caricaConti();
        //Non viene trovato il file, probabilmente perchè è la prima volta che viene eseguito il programma
        //quindi si crea il vettore vuoto e si indica che non ci sono conti correnti
        if (contiCorrenti == null) {
            contiCorrenti = new ContoCorrente[MAX_CONTI];
            nContiCorrenti = 0;
            System.out.println("Non è stato trovato nessun conto corrente salvato.");
        }
        //Se viene caricato il vettore si conta quanti sono i conti correnti presenti, cioè quante
        //caselle sono diverse da null, considerando che sono tutte all'inizio del vettore
        else {
            while(contiCorrenti[nContiCorrenti] != null)
                nContiCorrenti++;
            System.out.println("Sono stati caricati " + nContiCorrenti + " conti correnti.");
            System.out.println(elencoCodici(contiCorrenti, nContiCorrenti));
        }
        menu();
        scelta = in.nextInt();
        while (scelta != 0) {
            if (scelta == 1) {
                System.out.println("Prima della creazione si sono " + nContiCorrenti + " conti correnti");
                aggiungiContoCorrente(contiCorrenti, nContiCorrenti, in);
                nContiCorrenti++;
                System.out.println("Dopo la creazione si sono " + nContiCorrenti + " conti correnti");
            } else if (scelta == 2) {
                aggiungiOperazione(contiCorrenti, nContiCorrenti, in);
            } else if (scelta == 3) {
                visualizzaInformazioni(contiCorrenti, nContiCorrenti, in);
            }

            menu();
            scelta = in.nextInt();
        }
        try {
            salvaConti(contiCorrenti);
        } catch (IOException e) {
            System.out.println("Fallimento, non sono riuscito a scrivere, non farò mai più il programmatore");
        }
    }
}
