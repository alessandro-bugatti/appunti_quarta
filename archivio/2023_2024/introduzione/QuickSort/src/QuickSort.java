public class QuickSort {
    private static int partition(int[]v, int inizio, int fine){
        return 0;
    }

    private static void QuickSort(int []v, int inizio, int fine){
        if (inizio >= fine)
            return;
        int i = partition(v, inizio, fine);
        QuickSort(v, inizio, i-1);
        QuickSort(v, i+1, fine);
    }
    public static void main (String [] strings){
        final int LUNGHEZZA = 10; //equivalente di const in C++
        final boolean DEBUG = true;

        int []v;

        v = new int[LUNGHEZZA];

        for (int i = 0; i < LUNGHEZZA; i++) {
            v[i] = (int)(Math.random()*100);
        }

        if (DEBUG) {
            for (int i = 0; i < LUNGHEZZA; i++) {
                System.out.print(" " + v[i]);
            }
            System.out.println();
        }

        long inizio = System.nanoTime();
        //Algoritmo di cui sto misurando le prestazioni
        QuickSort(v, 0, LUNGHEZZA - 1);
        long fine = System.nanoTime();
        float durata = (fine - inizio) / 1000000;
        System.out.println("Il tempo impiegato dal SelectionSort per ordinare "
                + LUNGHEZZA + " elementi è di " + durata + " ms");


        if(DEBUG)
            for (int i = 0; i < LUNGHEZZA; i++) {
                System.out.print(" " + v[i]);
            }
    }
}