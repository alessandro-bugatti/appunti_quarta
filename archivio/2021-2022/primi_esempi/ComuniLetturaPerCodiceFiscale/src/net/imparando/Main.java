package net.imparando;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br;
        FileReader in;
        in = new FileReader("comuni.txt");
        br = new BufferedReader(in);
        String riga;
        while ( (riga = br.readLine()) != null){
            String comune;
            String codice;
            comune = riga.substring(0, 40);
            codice = riga.substring(40, 44);
            System.out.println(comune + "-" + codice);
        }
    }
}
