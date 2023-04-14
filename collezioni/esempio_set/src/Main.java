import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    private static final int MAX_ELEMENTI = 1000000;

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        hs.add(34);
        hs.add(13);
        hs.add(99);
        System.out.println(hs);
        ts.add(34);
        ts.add(13);
        ts.add(99);
        System.out.println(ts);
        if (hs.contains(34)) {
            System.out.println("Il set contiene il 34");
        }
        hs.clear();
        for (int i = 0; i < MAX_ELEMENTI; i++) {
            hs.add((int) (Math.random() * MAX_ELEMENTI));
        }
        //Verifico che eventuali duplicati non sono stati inseriti
        System.out.println(hs.size());

        int trovati = 0;
        for (int i = 0; i < MAX_ELEMENTI; i++) {
            int cercato = (int) (Math.random() * MAX_ELEMENTI);
            if (hs.contains(cercato))
                trovati++;
        }
        System.out.println(trovati);

        //Stesso codice per il TreeSet
        ts.clear();
        for (int i = 0; i < MAX_ELEMENTI; i++) {
            ts.add((int) (Math.random() * MAX_ELEMENTI));
        }
        //Verifico che eventuali duplicati non sono stati inseriti
        System.out.println(ts.size());

        trovati = 0;
        for (int i = 0; i < MAX_ELEMENTI; i++) {
            int cercato = (int) (Math.random() * MAX_ELEMENTI);
            if (ts.contains(cercato))
                trovati++;
        }
        System.out.println(trovati);
        for (int i = 0; i < MAX_ELEMENTI * 6; i++) {
            int rimosso = (int) (Math.random() * MAX_ELEMENTI);
            ts.remove(rimosso);
        }
        System.out.println(ts.size());
        System.out.println(ts);
        hs = new HashSet<>();
        ts = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            ts.add((int)(Math.random()*100000));
            hs.add((int)(Math.random()*100000));
        }
        System.out.println(ts);
        System.out.println(hs);
    }
}