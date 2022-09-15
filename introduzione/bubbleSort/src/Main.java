public class Main {
    /**
     * NUmero massimo degli elementi del vettore
     */
    private static final int N_ELEMENTI = 10;

    /**
     * Algoritmo di ordinamento Bubble Sort
     * @param v Vettore che verrà ordinato
     */
    public static void bubbleSort(int v[])
    {
        //Variabile sentinella che verifica ad ogni ciclo se c'è stato almeno
        //uno scambio: quando finiranno gli scambi l'algoritmo avrà finito di ordinare
        boolean scambio = true;
        //Punto di inizio del sottovettore
        int inizio = 0;
        while (scambio){
            scambio = false;
            //Ciclo interno per far "risalire" gli elementi più piccoli
            for (int i = v.length - 1; i > inizio; i--) {
                if (v[i] < v[i-1]){
                    int temp = v[i];
                    v[i] = v[i-1];
                    v[i-1] = temp;
                    scambio = true;
                }
            }
            //Sposta l'inizio del sottovettore
            inizio++;
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
        bubbleSort(vettore);
        System.out.println("Vettore ordinato");
        for (int i = 0; i < vettore.length; i++) {
            System.out.println(vettore[i]);
        }
    }
}