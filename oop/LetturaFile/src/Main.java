import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader;
        try {
            reader = new FileReader("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        }
        BufferedReader br;
        br = new BufferedReader(reader);
        String riga;
        while((riga = br.readLine()) != null){
            System.out.println(riga);
        }
        br.close();
        reader.close();


        //Scrittura su file
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Ciao\n");
        for (int i = 0; i < 3; i++) {
            bw.write("" + (i+1) + "\n");
        }
        bw.close();
        fw.close();


    }

}