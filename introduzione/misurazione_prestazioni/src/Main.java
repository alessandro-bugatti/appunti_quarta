public class Main {

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
        int v[];
        int DIM = 5000;
        while (DIM <= 50000) {

            v = new int[DIM];
            for (int i = 0; i < DIM; i++) {
                v[i] = (int) (Math.random() * 1000000);
            }
            long inizio = System.currentTimeMillis();

            //Inserire la funzione di cui si vogliono misurare le prestazioni
            bubbleSort(v);

            long fine = System.currentTimeMillis();
            System.out.println("Con " + DIM + " elementi impiega " +
                    (fine - inizio) / 1000.0 + " secondi.");
            DIM += 5000;
        }
    }
}