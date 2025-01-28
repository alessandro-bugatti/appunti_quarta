import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        TreeSet<Integer> ts = new TreeSet<>();
        HashSet<Integer> hs = new HashSet<>();
        final int N_ELEMENTI = 1000000;
        final int GRANDEZZA = 1000000000;
        for (int i = 0; i < N_ELEMENTI; i++) {
            int n = (int)(Math.random() * GRANDEZZA);
            al.add(n);
            ts.add(n);
            hs.add(n);
        }
        System.out.println(al.size());
        System.out.println(ts.size());
        System.out.println(hs.size());

        ArrayList<Integer> cercati = new ArrayList<>();
        final int N_CERCATI = N_ELEMENTI / 1;

        for (int i = 0; i < N_CERCATI; i++) {
            int n = (int)(Math.random() * GRANDEZZA);
            cercati.add(n);
        }
        long fine, inizio = System.currentTimeMillis();
        int quanti;
        final boolean ARRAYLIST = false;
        if (ARRAYLIST) {
            //Misura delle prestazioni di una array in ricerca
            inizio = System.currentTimeMillis();
            quanti = 0;
            for (Integer i : cercati) {
                if (al.contains(i))
                    quanti++;
            }
            fine = System.currentTimeMillis();
            System.out.println("Sono stati trovati " + quanti + " elementi in " +
                    (double) (fine - inizio) / 1000 + " secondi");
        }
        //Misura delle prestazioni di un treeset in ricerca
        inizio = System.currentTimeMillis();
        quanti = 0;
        for (Integer i : cercati){
            if (ts.contains(i))
                quanti++;
        }
        fine = System.currentTimeMillis();
        System.out.println("Sono stati trovati " + quanti + " elementi in " +
                (double)(fine - inizio)/1000 + " secondi");

        //Misura delle prestazioni di un hashset in ricerca
        inizio = System.currentTimeMillis();
        quanti = 0;
        for (Integer i : cercati){
            if (hs.contains(i))
                quanti++;
        }
        fine = System.currentTimeMillis();
        System.out.println("Sono stati trovati " + quanti + " elementi in " +
                (double)(fine - inizio)/1000 + " secondi");

    }
}