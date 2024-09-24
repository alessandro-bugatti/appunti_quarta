import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> lista;
        lista = new ArrayList<>();
        Scanner in;
        in = new Scanner(System.in);
        String parola;
        System.out.println("inserisci una parola");
        parola = in.next();
        while (!(parola.equals("stop"))){
            System.out.println("vuoi inserirla in coda o in una posizione? (coda, posizione)");
            String scelta;
            scelta = in.next();
            if(scelta.equals("coda")){
                lista.add(parola);
            }
            else{
                int posizione;
                System.out.println("inserisci la posizione");
                posizione = in.nextInt();
                while (posizione < 0 || posizione > lista.size()){
                    System.out.println("la posizione non è corretta. Inseriscine una nuova");
                    posizione = in.nextInt();
                }
                lista.add(posizione, parola);
            }
            System.out.println("inserisci una parola");
            parola = in.next();

        }
        System.out.println(lista);
        for(String s:lista){
            System.out.println("parola -> " + s);
        }
    }
}