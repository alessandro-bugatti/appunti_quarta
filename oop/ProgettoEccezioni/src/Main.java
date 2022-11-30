import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /**
     * Metodo che crea una ricorsione infinita e permette
     * di verificare la presenza di uno StackOverflowError
     * @param n
     * @return
     */
    public static int ricorsioneProblematica(int n){
        if (n == 0)
            return 1;
        return ricorsioneProblematica(1);
    }

    public static int perDue(int n){
        return n*2;
    }

    public static void main(String[] args) {
        /*
        //Esempio di cattura di uno StackOverflowError
        //che comunque non è rimediabile
        try {
            int n = ricorsioneProblematica(1);
        }catch (StackOverflowError a){
            System.out.println(a);
        }
        System.out.println(perDue(4));
        //Esempio di cattura di uno OutOfMemoryError
        //che comunque non è rimediabile
        int b = 1000000;
        int v[];
        for (int i = 0; i < 10000; i++) {
            try{
                v = new int[i*b];
            }catch (OutOfMemoryError e){
                System.out.println(e);
            }
            System.out.println(i);
        }*/
        //Le eccezioni unchecked in generale non si intercettano,
        //anche se si può fare,
        //se capitano il programma crolla e si interviene
        Integer a;
        a = 12;
        a = null;
        try {
            System.out.println(a.byteValue());
        }catch (NullPointerException e){ //NullPointerException
            System.out.println(e);
        }
        int v[] = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = i;
        }
        for (int i = 0; i < v.length; i++) {
            if (v[i] > v[i+1]){ //Genera un OutOfBoundException
                System.out.println("Fai qualcosa");
            }
        }
        //La classe Scanner può generare un InputMismatchException
        //che è sempre di tipo unchecked, ma che può aver senso intercettare
        //anche se va valutato
        Scanner in = new Scanner(System.in);
        int n = 0;
        do {
            try {
                n = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Devi inserire un intero");
                in.nextLine();
            }
        }while(n == 0);
        //La classe BufferedReader invece genera un'IOException
        //che è di tipo checked e quindi DEVE essere intercettata
        //altrimenti il programma non compila
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = buf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}