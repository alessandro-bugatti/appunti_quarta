import net.imparando.*;

import java.util.Scanner;

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

    public static void main(String[] args) {
       Banca b = new Banca();
       datiStub(b);
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
                   c.aggiungiMovimento(m);
                   break;
               case 2:
                   c = ricercaConto(b);
                   if (c == null){
                       System.out.println("Conto non valido");
                       break;
                   }
                   System.out.println("Inserisci la cifra da depositare: ");
                   cifra = in.nextFloat();
                   m = new Movimento("Prelievo", cifra);
                   c.aggiungiMovimento(m);
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
               default:
                   System.out.println("Scelta non valida");
           }
           menu();
           System.out.println("Operazione? ");
           scelta = in.nextInt();
       }
        System.out.println("Chiusura cassa");
    }
}