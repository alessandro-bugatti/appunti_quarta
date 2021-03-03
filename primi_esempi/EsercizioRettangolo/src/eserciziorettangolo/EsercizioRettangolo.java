/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziorettangolo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex_2
 */
public class EsercizioRettangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        /*Punto a = new Punto(5,3);
        Punto b = new Punto();
        Punto c = new Punto(a);
        Punto d = new Punto(10, 13);
        Rettangolo e = new Rettangolo(a,d);
        Rettangolo f = new Rettangolo(e);
        */
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        //BufferedReader bufffer2 = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            System.out.println("Inserisci una stringa con due interi separati da spazio:");
            //Leggo una stringa da tastiera
            s = buffer.readLine();
        } catch (IOException ex) {
            Logger.getLogger(EsercizioRettangolo.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Supponendo che la stringa contenga due interi
        //la scompongo dei due numeri sotto forma di stringhe
        String[] numeri = s.split(" ");
        //System.out.println(numeri.length);
        //System.out.println(numeri[1]);
        //Trasformo le due stringhe in due interi
        int x, y;
        x = Integer.parseInt(numeri[0]);
        y = Integer.parseInt(numeri[1]);
        Punto a = new Punto(x, y);
        System.out.println(a);
        
        try {
            //Con i file
            FileReader f = new FileReader("input.txt");
            BufferedReader bufferFile = new BufferedReader(f);
            s = bufferFile.readLine();
            //Supponendo che la stringa contenga due interi
            //la scompongo dei due numeri sotto forma di stringhe
            numeri = s.split(" ");
            //System.out.println(numeri.length);
            //System.out.println(numeri[1]);
            //Trasformo le due stringhe in due interi
            x = Integer.parseInt(numeri[0]);
            y = Integer.parseInt(numeri[1]);
            a = new Punto(x, y);
            System.out.println(a);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EsercizioRettangolo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EsercizioRettangolo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        try {
            FileWriter out = new FileWriter("output.txt");
            BufferedWriter bufferOut = new BufferedWriter(out);
            bufferOut.write(a.getX() + " " + a.getY());
            bufferOut.newLine();
            bufferOut.flush();
            bufferOut.close();
        } catch (IOException ex) {
            System.out.println("errore");
        }
        
        
    }
    
}
