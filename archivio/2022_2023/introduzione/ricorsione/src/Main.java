public class Main {
    public static int fattoriale(int n){
        if (n == 1 || n == 0)
            return 1;
        return n * fattoriale(n-1);
    }

    public static int fibonacci(int n){
        if (n == 1 || n == 0)
            return 1;
        return fibonacci(n-1) +  fibonacci(n-2);
    }

    /**
     * Funzione che stampa l'ordine della mosse per risolvere il problema
     * delle torri di Hanoi con n dischi
     * @param n numero di dischi
     * @param inizio torre di partenza
     * @param fine torre di arrivo
     * @param appoggio torre di appoggio
     */
    public static void hanoi(int n, int inizio, int fine, int appoggio){
        if (n == 0)
            return;
        hanoi(n - 1, inizio, appoggio, fine);
        System.out.println("Sposta un disco dal paletto " + inizio + " al paletto " +
                fine);
        hanoi(n-1, appoggio, fine, inizio);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Il fattoriale di " + n +
                " è " + fattoriale(n));
        System.out.println("Il "+ n +"° numero di Fibonacci è " +
                fibonacci(n));
        System.out.println("Soluzione del problema delle torri di Hanoi con " +
                n + " dischi");
        hanoi(n, 1, 3, 2);

    }
}