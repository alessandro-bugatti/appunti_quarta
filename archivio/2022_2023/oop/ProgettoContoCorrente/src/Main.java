import net.imparando.*;

import java.io.*;
import java.util.Scanner;

/**
 * La policy per il saldo negativo è la seguente:
 * se il saldo è negativo ma sotto i 500 euro
 * il conto continua a essere funzionante
 * se invece si scende sotto i 500 euro di saldo
 * negativo, il conto viene bloccato e non è più possibile
 * prelevare fino a quanto non viene riportato a un
 * valore >= 0
 */
public class Main {
    static void datiStub(Banca b){
        b.creaConto("Piero", "Paletti");
        b.creaConto("Silvia", "Ardicci");
        b.creaConto("Luisa", "Paletti");
    }

    static void menu(){
        System.out.println("1 - Prelievo");
        System.out.println("2 - Deposito");
        System.out.println("3 - Saldo");
        System.out.println("4 - Crea conto");
        System.out.println("0 - Esci");
    }

    public static ContoCorrente ricercaConto(Banca b)
    {
        System.out.println("Ricerca per numero conto (1)\nRicerca per cognome (2)");
        int scelta;
        Scanner in = new Scanner(System.in);
        scelta = in.nextInt();
        if (scelta == 1){
            System.out.println("Inserisci il numero di conto: ");
            int numero = in.nextInt();
            ContoCorrente c = b.ricercaPerNumeroConto(numero);
            return c;

        }
        else if (scelta == 2){
            System.out.println("Inserisci il cognome: ");
            String cognome = in.next();
            ContoCorrente[] c = b.ricercaPerCognome(cognome);
            if (c == null)
                return null;
            if (c.length == 1)
                return c[0];
            //Mostra l'elenco e permette di scegliere il conto corretto
            for (int i = 0; i < c.length; i++)
                System.out.println("" + (i+1) + " -> " + c[i]);
            System.out.println("Scegli il correntista corretto: ");
            int i = in.nextInt();
            return c[i - 1];
        }
        return null;
    }

    public static void main(String[] argomenti) throws IOException {
        //Deserializzazione dei dati eventualmente serializzati
        Banca b;
        ObjectInputStream objIn = null;
        try {
            objIn = new ObjectInputStream(
                    new FileInputStream("banca.bin"));
            b = (Banca)objIn.readObject();
            objIn.close();
        } catch (IOException e) {
            b = new Banca();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



       datiStub(b);
       System.out.println(b);
       Scanner in = new Scanner(System.in);
       int scelta;
       menu();
       System.out.println("Operazione? ");
       scelta = in.nextInt();
        ContoCorrente c;
       while(scelta != 0){
           switch (scelta){
               case 1:
                   c = ricercaConto(b);
                   if (c == null){
                       System.out.println("Conto non valido");
                       break;
                   }
                   System.out.println("Inserisci la cifra da prelevare: ");
                   float cifra = in.nextFloat();
                   Movimento m = new Movimento("Prelievo", -cifra);
                   try {
                       c.aggiungiMovimento(m);
                   } catch (SaldoNegativoException e) {
                       System.out.println("Attenzione: il saldo è negativo e hai uno scoperto di " +
                               c.getSaldo() + ". Se scenderai sotto i 500 euro il conto verrà bloccato.");
                   } catch (ContoBloccatoException e) {
                       throw new RuntimeException(e);
                   }
                   break;
               case 2:
                   c = ricercaConto(b);
                   if (c == null){
                       System.out.println("Conto non valido");
                       break;
                   }
                   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
                   String descrizione;
                   System.out.println("Inserisci la descrizione: ");
                   descrizione = bf.readLine();
                   System.out.println("Inserisci la cifra da depositare: ");
                   cifra = in.nextFloat();
                   m = new Movimento(descrizione, cifra);
                   try {
                       c.aggiungiMovimento(m);
                   } catch (SaldoNegativoException e) {
                       throw new RuntimeException(e);
                   } catch (ContoBloccatoException e) {
                       throw new RuntimeException(e);
                   }
                   break;
               case 3:
                   c = ricercaConto(b);
                   if (c == null){
                       System.out.println("Conto non valido");
                   }
                   else{
                       System.out.println(c);
                   }
                   break;
               case 4:
                   System.out.println("Inserisci nome e cognome: ");
                   String nome = in.next();
                   String cognome = in.next();
                   b.creaConto(nome, cognome);
                   break;
               case 5:
                   System.out.println(b);
               default:
                   System.out.println("Scelta non valida");
           }
           menu();
           System.out.println("Operazione? ");
           scelta = in.nextInt();
       }
       //Serializzazione
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(
                    new FileOutputStream("banca.bin")
            );
            out.writeObject(b);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Chiusura cassa");
    }
}