/**
 * Classe didattica che serve a verificare e progettare il
 * funzionamento di un ArrayList
 */
public class MyArrayList {
    static final int INITIAL_DIM = 16;
    private int[] v;
    private int n_items;

    /**
     * Costruttore che istanzia un oggetto
     */
    public MyArrayList(){
        v = new int[INITIAL_DIM];
        n_items = 0;
    }

    /**
     * Metodo che aggiunge un elemento in coda
     * @param n L'elemento che verrà aggiunto
     * @return true, perchè l'implementazione aumenta la dimensione
     * del vettore se non c'è spazio a sufficienza
     */
    public boolean add(int n){
        if (n_items >= v.length)
        {
            int[] new_v = new int[v.length * 2];
            for (int i = 0; i < n_items; i++) {
                new_v[i] = v[i];
            }
            v = new_v;
        }
        v[n_items] = n;
        n_items++;
        return true;
    }
}
