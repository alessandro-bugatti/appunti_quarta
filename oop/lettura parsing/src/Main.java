import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Lettura e parsing di un file CSV
        FileReader file = new FileReader("comuni.csv");
        BufferedReader buffer = new BufferedReader(file);
        String riga;
        int conta=0;
        while (conta<10 && (riga = buffer.readLine())!=null){
            conta++;
            System.out.println(riga);
            String[] parole;
            parole = riga.split(";");
            System.out.println("il vettore contiene " + parole.length + " stringhe");
            System.out.println("comune: " + parole[0] + " codice: " + parole[1]);

        }

        //Lettura e parsing di un file con campi di lunghezza fissa
        file = new FileReader("comuni.txt");
        buffer = new BufferedReader(file);

        conta=0;
        while (conta<10 && (riga = buffer.readLine())!=null){
            conta++;
            String comune= riga.substring(0,40);
            String codice= riga.substring(40, 44);
            System.out.println("comune: " + comune.trim() + " codice: " + codice);


        }
        //Lettura e parsing di un file con le squadre degli ottavi di champions league
        file = new FileReader("teams.csv");
        buffer = new BufferedReader(file);
        String[] selezione1, selezione2;
        selezione1 = new String[8];
        selezione2 = new String[8];
        conta=0;
        //Estrazione dei nomi delle nazioni delle teste di serie
        while (conta<10 && (riga = buffer.readLine())!=null){
            String[] squadre;
            squadre = riga.split(";");
            selezione1[conta] = squadre[0];
            selezione2[conta] = squadre[1];
            String[] s = squadre[0].split(" ");
            String nazione = s[s.length-1].substring(1, 4);
            System.out.println(nazione);
            conta++;
        }

        //Sorteggio casuale degli ottavi senza regole di esclusione
        for (int i = 0; i < 20; i++) {
            int a = (int)(Math.random()*8);
            int b = (int)(Math.random()*8);
            String temp;
            temp = selezione1[a];
            selezione1[a] = selezione1[b];
            selezione1[b] = temp;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(selezione1[i] + " vs " + selezione2[i]);
        }
    }
}