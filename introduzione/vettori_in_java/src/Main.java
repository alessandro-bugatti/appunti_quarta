public class Main {
    /**
     * Constante che rappresenta la dimensione massima del vettore
     */
    public static final int DIM = 10;

    public static void main(String[] args) {
        //Dichiarazione
        int v[]; //int[] v;
        //Creazione
        v = new int[DIM];
        for (int i = 0; i < v.length; i++) {
            /*
            Math.random è una funzione che produce un numero compreso
            tra 0 (incluso) e 1 (escluso)
             */
            v[i] = (int)(Math.random() * 1000);
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}