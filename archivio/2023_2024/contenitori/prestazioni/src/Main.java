import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
Codice per vedere le differenze di prestazioni su alcune operazioni tra
ArrayList e LinkedList, le righe commentate riguardano le istruzioni con
prestazioni pessime, se decommentate si possono percepire chiaramente i problemi
che hanno
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<>();
        LinkedList<Double> ll = new LinkedList<>();
        //Stesse prestazioni
        for (int i = 0; i < 1000000; i++) {
            al.add(Math.random());
        }
        for (int i = 0; i < 1000000; i++) {
            ll.add(Math.random());
        }

        //Inserimento all'inizio, ArrayList performance pessime
        //LinkedList come in precedenza
        for (int i = 0; i < 1000000; i++) {
            //al.add(0,Math.random());
            ll.add(0,Math.random());
        }

        double somma = 0;
        //Iterazione con indice su LinkedList, performance pessime
        for (int i = 0; i < 1000000; i++) {
            //somma += ll.get(i);
        }
        //Iterazione con iteratore su LinkedList, performance buone
        Iterator<Double> i = ll.iterator();
        while(i.hasNext()){
            somma += i.next();
        }
        System.out.println(somma);


    }
}