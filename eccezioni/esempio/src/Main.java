import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        /*
        Esempio con eccezione unchecked, non c'è bisogno di gestirla, e generalmente
        non è una buona idea, ma se si vuole si può fare
         */
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            try{
                a[i] = i * 3;
                System.out.println(a[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("C'è stato un problema con l'indice " + i);
            }
        }
        /*
        Esempio con eccezioni checked, che, per forza, o sono gestite o sono
        rilanciate
         */
        BufferedReader bf;
        InputStreamReader is;
        is = new InputStreamReader(System.in);
        bf = new BufferedReader(is);
        String s;
        try {
            s = bf.readLine();
        } catch (IOException e) {
            s = "ciao";

        }
    }
}