import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


    static public void main(String[] args)  {
        final int L = 10;
        int[] v = new int[L];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String s = reader.readLine();
        } catch (IOException e) {
            System.out.println("C'è stato l'errore" + e);
            System.out.println("Il programma non può continuare e verrà chiuso");
            //Faccio pulizia, backup, salvataggio
            return;
        }

        for (int i = 0; i < 10; i++) {
            v[i] = 1;
        }

    }
}
