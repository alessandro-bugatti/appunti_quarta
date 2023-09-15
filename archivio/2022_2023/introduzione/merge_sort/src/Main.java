public class Main {
    /**
     * Metodo per la fusione delle due metà di un vettore
     * entrambe ordinate
     * @param v vettore formato da due parti ordinate, che dovranno essere fuse
     * @param a vettore di supporto per facilitare la scrittura del codice
     * @param inizio inizio della prima metà ordinata
     * @param medio inizio della seconda metà ordinata
     * @param fine fine del vettore da ordinare, esclusa
     */
    public static void merge(int v[], int a[], int inizio, int medio, int fine){
        int i, j, k;
        i = inizio;
        j = medio;
        k = inizio;
        while(i < medio && j < fine){
            if (v[i] < v[j]){
                a[k] = v[i];
                i++;
            }
            else{
                a[k] = v[j];
                j++;
            }
            k++;
        }
        while(i < medio){
            a[k] = v[i];
            i++;
            k++;
        }
        while(j < fine){
            a[k] = v[j];
            j++;
            k++;
        }
        //Riporto gli elementi appoggiati in a all'interno di v
        for (int l = inizio; l < fine ; l++) {
            v[l] = a[l];
        }
    }

    /**
     * Implementazione del Merge Sort
     * @param v vettore da ordinare
     * @param a vettore di appoggio per semplificare il codice
     * @param inizio indice del primo elemento del vettore da ordinare
     * @param fine fine dell'intervallo di ordinamento, escluso
     */
    public static void mergeSort(int v[], int a[], int inizio, int fine){
        if (fine - inizio <= 1) //oppure (inizio <= fine - 1)
            return;
        int m = (inizio + fine) / 2;
        mergeSort(v, a, inizio, m);
        mergeSort(v, a, m, fine);
        merge(v, a, inizio, m, fine);
    }

    public static void main(String[] args) {
        //Esempio di utilizzo
        int v[] = {8, 11, 2, 33, 12, 21, 44, -7, 18};
        int a[] = new int[v.length];
        for (int i : v) {
            System.out.print(i + ", ");
        }
        mergeSort(v, a, 0, v.length);
        System.out.println();
        for (int i : v) {
            System.out.print(i + ", ");
        }
    }
}