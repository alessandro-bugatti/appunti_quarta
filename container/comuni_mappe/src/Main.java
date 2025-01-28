import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        FileReader in;
        String riga;
        HashMap<String, String> comuni;
        comuni = new HashMap<>();
        //Utilizzando split
        in = new FileReader("comuni.csv");
        br = new BufferedReader(in);

        System.out.println("Lettura e parsing con split");
        while ((riga = br.readLine()) != null){
            String [] parole;
            parole = riga.split(";");
            comuni.put(parole[0], parole[1]);
        }
        System.out.println(comuni.size());
    }
}