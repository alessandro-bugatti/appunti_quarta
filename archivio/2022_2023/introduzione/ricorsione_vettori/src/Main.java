



public class Main {
    /**
     * Funzione ricorsiva che cerca un elemento in un vettore
     * @param v vettore in cui cercare un elemento
     * @param cercato elemento da cercare
     * @param inizio inizio dell'intervallo di ricerca
     * @param fine fine dell'intervallo di ricerca, si trova fuori dal vettore
     * @return true se viene trovato, false altrimenti
     */
    public static boolean cerca(int v[], int cercato, int inizio, int fine){
        if (inizio == fine)
            return false;
        return (v[inizio] == cercato) || cerca(v, cercato, inizio+1, fine);
    }

    public static boolean cerca2(int v[], int cercato, int inizio, int fine){
        int m = (inizio + fine) / 2;
        return (v[m] == cercato) ||
                cerca(v, cercato, inizio, m - 1) ||
                cerca(v, cercato, m + 1, fine);
    }

    public static boolean ricercaBinaria(int v[], int cercato, int inizio, int fine) {
        if (inizio > fine)
            return false;
        int m = (inizio + fine) / 2;
        if (v[m] == cercato)
            return true;
        else if (cercato > v[m])
            return ricercaBinaria(v, cercato, m + 1, fine);
        else
            return ricercaBinaria(v, cercato, inizio, m - 1);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}