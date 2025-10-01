import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creazione del conto
        System.out.print("Inserisci il nome del correntista: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci il cognome del correntista: ");
        String cognome = scanner.nextLine();
        System.out.print("Inserisci il codice univoco del conto: ");
        String codice = scanner.nextLine();

        ContoCorrente conto = new ContoCorrente(nome, cognome, codice);

        int scelta;
        do {
            System.out.println("\n--- MENU CONTO CORRENTE ---");
            System.out.println("1. Visualizza saldo");
            System.out.println("2. Deposita");
            System.out.println("3. Preleva");
            System.out.println("4. Mostra codice conto");
            System.out.println("5. Mostra nominativo");
            System.out.println("6. Mostra tutte le informazioni");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Saldo attuale: " + conto.getSaldo());
                    break;

                case 2:
                    System.out.print("Inserisci l'importo da depositare: ");
                    double deposito = scanner.nextDouble();
                    double nuovoSaldoDeposito = conto.deposita(deposito);
                    System.out.println("Nuovo saldo: " + nuovoSaldoDeposito);
                    break;

                case 3:
                    System.out.print("Inserisci l'importo da prelevare: ");
                    double prelievo = scanner.nextDouble();
                    double nuovoSaldoPrelievo = conto.preleva(prelievo);
                    System.out.println("Nuovo saldo: " + nuovoSaldoPrelievo);
                    break;

                case 4:
                    System.out.println("Codice conto: " + conto.getCodice());
                    break;

                case 5:
                    System.out.println("Nominativo: " + conto.getNominativo());
                    break;

                case 6:
                    System.out.println(conto.toString());
                    break;

                case 0:
                    System.out.println("Uscita dal programma...");
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
            }

        } while (scelta != 0);

        scanner.close();
    }
}
