public class Main {
    /**
     * NUmero massimo degli elementi del vettore
     */
    private static final int N_ELEMENTI = 10;

    /**
     * Algoritmo di ordinamento Selection Sort
     * @param v Vettore che verrà ordinato
     */
    public static void selectionSort(int v[])
    {
        for (int i = 0; i < v.length; i++) {
            /*
            Memorizza la posizione del minimo, inizialmente quella
            del primo elemento del sottovettore
             */
            int min = i;
            /*
            Si scorre tutto il sottovettore per vedere dove si trova il minimo
            attuale
             */
            for (int j = i + 1; j < v.length; j++) {
                if (v[min] > v[j]){
                    min = j;
                }
            }
            /*
            Si porta il minimo nella prima posizione del sottovettore
             */
            int t = v[min];
            v[min] = v[i];
            v[i] = t;
        }
    }

    public static void main(String[] args) {
        int vettore[];
        vettore = new int[N_ELEMENTI];
        for (int i = 0; i < vettore.length; i++) {
            /*
            Il metodo statico Math.random() produce un double casuale
            compreso tra [0, 1), moltiplicandolo per il valore intero n
            che si desidera si ottengono valori interi nell'intervallo
           [0, n). Attenzione al casting, Java è strict rispetto al controllo
           di tipo.
             */
            vettore[i] = (int)(Math.random() * 100);
        }
        System.out.println("Vettore iniziale");
        for (int i = 0; i < vettore.length; i++) {
            System.out.println(vettore[i]);
        }
        selectionSort(vettore);
        System.out.println("Vettore ordinato");
        for (int i = 0; i < vettore.length; i++) {
            System.out.println(vettore[i]);
        }
    }
}