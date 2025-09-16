import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N;
        float num, somma = 0, media;

        System.out.println("Inserisci un numero di valori: ");
        N = in.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("inserisci un numero: ");
            num = in.nextFloat();
            somma += num;
        }

        media = somma / N;

        System.out.println("la media e' " + media);
    }
}