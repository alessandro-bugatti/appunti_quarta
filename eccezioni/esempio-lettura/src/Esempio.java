import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Esempio {
    public static void main(String[] args) throws IOException {
        //PIù facile, ha il problema che non legge le frasi
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(s);
        //PIù complesso, ma più potente, il BufferedReader
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(inp);
        s = r.readLine();
    }
}
