import java.util.Scanner;

public class Main {

    private static void menu(){
        System.out.println("1 - Inserisci una nuova lampadina");
        System.out.println("2 - Modifica la potenza di una lampadina");
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
                    break;
            }
            System.out.println(sistema);
            menu();
            scelta = in.nextInt();
        }
    }
}