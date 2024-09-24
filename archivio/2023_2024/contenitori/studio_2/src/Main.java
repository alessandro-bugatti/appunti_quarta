import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static boolean VerificaQuadratoPerfetto(int numero){
        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int N;

        System.out.println("Inserisci un numero positivo: ");
        N = in.nextInt();

        for (int i = 0; i < N; i++) {
            lista.add((int)(Math.random()*1000000));
        }

        for (Integer intero: lista) {
            if(VerificaQuadratoPerfetto(intero)){
                System.out.println(intero);
            }
        }





    }
}