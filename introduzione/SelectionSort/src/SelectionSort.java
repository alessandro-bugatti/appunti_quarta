public class SelectionSort {
    /**
     * Algoritmo che implementa il SelectionSort
     * @param v vettore da ordinare
     * @param inizio primo elemento del vettore da ordinare
     * @param fine ultimo elemento del vettore da ordinare
     */
    private static void SelectionSort(int []v, int inizio, int fine){
        //Selection Sort
        for (int i = inizio; i < fine; i++) {
            int PosMin = i;
            for (int j = i+1; j <= fine; j++) {
                if(v[j]<v[PosMin]){
                    PosMin =j;
                }
            }
            int temp = v[i];
            v[i]=v[PosMin];
            v[PosMin]=temp;
        }
    }
    public static void main (String [] strings){
        final int LUNGHEZZA = 100000; //equivalente di const in C++
        final boolean DEBUG = false;

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
        SelectionSort(v, 0, LUNGHEZZA - 1);
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