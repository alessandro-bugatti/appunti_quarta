import java.util.Scanner;

public class PrimoProgramma {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("i = " + i);
        }
    }
}