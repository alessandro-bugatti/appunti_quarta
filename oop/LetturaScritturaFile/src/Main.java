import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        //Lettura
        FileReader fr = new FileReader("testo.txt");
        BufferedReader br = new BufferedReader(fr);
        String riga;
        while ((riga = br.readLine()) != null){
            System.out.println(riga);
        }
        br.close();
        fr.close();
        //Scrittura
        FileWriter fw = new FileWriter("testo.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < 3; i++) {
            bw.write("\nciao");
        }
        bw.close();
        fw.close();


    }
}