import java.util.Scanner;

public class Main {

    private static void menu(){
        System.out.println("1 - Inserisci una nuova lampadina");
        System.out.println("2 - Modifica l'intensità di una lampadina");
        System.out.println("3 - Accendi una lampadina");
        System.out.println("4 - Spegni una lampadina");
        System.out.println("5 - Spegni tutte le lampadine");
        System.out.println("6 - Rimuovi una lampadina");
        System.out.println("0 - Esci");
        System.out.println("Fai la tua scelta: ");
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        int scelta;
        menu();
        Scanner in = new Scanner(System.in);
        scelta = in.nextInt();
        while(scelta != 0){
            switch (scelta){
                case 1:
                    Lampadina temp;
                    String nome, colore;
                    int potenza;
                    System.out.println("Scegli il nome della lampadina: ");
                    nome = in.next();
                    System.out.println("Inserisci la potenza: ");
                    potenza = in.nextInt();
                    colore = "bianco";
                    temp = new Lampadina(potenza, colore, nome);
                    sistema.aggiungiLampadina(temp);
                    break;
                case 2:
                    String nomeLampadina;
                    System.out.println("Inserisci il nome della lampadina di cui vuoi modificare l'intensità: ");
                    nomeLampadina = in.next();
                    Lampadina cercata;
                    cercata = sistema.cerca(nomeLampadina);
                    if (cercata == null){
                        System.out.println("Lampadina non trovata.");
                    }
                    else{
                        System.out.println("Inserisci il nuovo valore di intensità (attualmente è al " + cercata.getIntensita() + "%)");
                        int intensita;
                        intensita = in.nextInt();
                        cercata.setIntensita(intensita);
                    }
                    break;
            }
            System.out.println(sistema);
            menu();
            scelta = in.nextInt();
        }
    }
}