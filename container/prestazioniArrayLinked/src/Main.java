import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();


        final int DIM = 100000;
        //confronto per l'inserimento in testa
        long inizio = System.currentTimeMillis();
        long fine;

        for(int i = 0; i < DIM; ++i){
            al.add(0,i);
        }
        fine = System.currentTimeMillis();
        System.out.println("ArrayList (inserimento in testa): " + (double)(fine-inizio)/1000 + " secondi");

        inizio = System.currentTimeMillis();

        for(int i = 0; i < DIM; ++i){
            ll.add(0,i);
        }

        fine = System.currentTimeMillis();
        System.out.println("LinkedList (inserimento in testa): " + (double)(fine-inizio)/1000 + " secondi");

        //confronto per l'inserimento in coda
        ll.clear();
        al.clear();

        inizio = System.currentTimeMillis();

        for(int i = 0; i < DIM; ++i){
            al.add(i);
        }
        fine = System.currentTimeMillis();
        System.out.println("ArrayList (inserimento in coda): " + (double)(fine-inizio)/1000 + " secondi");

        inizio = System.currentTimeMillis();

        for(int i = 0; i < DIM; ++i){
            ll.add(i);
        }

        fine = System.currentTimeMillis();
        System.out.println("LinkedList (inserimento in coda): " + (double)(fine-inizio)/1000 + " secondi");

        //confronto per l'iterazione usando un for

        inizio = System.currentTimeMillis();

        long somma = 0;

        for(int i = 0; i < DIM; ++i){
            somma += al.get(i);
        }
        fine = System.currentTimeMillis();
        System.out.println("ArrayList (iterazione con for): " + (double)(fine-inizio)/1000 + " secondi");

        inizio = System.currentTimeMillis();

        for(int i = 0; i < DIM; ++i){
            somma += ll.get(i);
        }

        fine = System.currentTimeMillis();
        System.out.println("LinkedList (iterazione con for): " + (double)(fine-inizio)/1000 + " secondi");

        //confronto per l'iterazione usando un foreach

        inizio = System.currentTimeMillis();

        somma = 0;

        for(int i : al){
            somma += i;
        }
        fine = System.currentTimeMillis();
        System.out.println("ArrayList (iterazione con foreach): " + (double)(fine-inizio)/1000 + " secondi");

        inizio = System.currentTimeMillis();

        for(int i : ll){
            somma += i;
        }

        fine = System.currentTimeMillis();
        System.out.println("LinkedList (iterazione con foreach): " + (double)(fine-inizio)/1000 + " secondi");

        //confronto per l'iterazione usando un iteratore

        somma = 0;
        Iterator<Integer> it = al.iterator();

        inizio = System.currentTimeMillis();

        while(it.hasNext()){
            somma+=it.next();
        }
        fine = System.currentTimeMillis();
        System.out.println("ArrayList (iterazione con iterator): " + (double)(fine-inizio)/1000 + " secondi");

        inizio = System.currentTimeMillis();

        it = ll.iterator();

        while(it.hasNext()){
            somma+=it.next();
        }

        fine = System.currentTimeMillis();
        System.out.println("LinkedList (iterazione con iterator): " + (double)(fine-inizio)/1000 + " secondi");

    }
}