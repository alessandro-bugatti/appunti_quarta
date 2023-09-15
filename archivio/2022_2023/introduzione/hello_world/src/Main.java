/**
 * Esempio di utilizzo di Java come se fosse un programma "procedurale"
 */

public class Main {
    /**
     * Funzione per il calcolo di un termine della serie di Fibonacci
     * @param n Termine n-esimo
     * @return Fibonacci(n)
     */
    public static int fibonacci(int n){
        if (n == 1 || n == 2)
            return 1;
        int precedente = 1, attuale = 1;
        for (int i = 2; i < n ; i++) {
            int nuovo = attuale + precedente;
            precedente = attuale;
            attuale = nuovo;
        }
        return attuale;

    }

    /**
     * Esempio di programma che mostra i costrutti tipici del linguaggio
     * e la coincidenza con le stesse operazioni del C++
     * @param args
     */
    public static void main(String[] args) {

        /*
        //Esempio di utilizzo dell'if
        int numero;
        numero = 7;
        if (numero % 2 == 0){
            System.out.println("Il numero è pari");

        }
        else {
            System.out.println("Il numero è dispari");
        }*/
        //Esempio della successione di Fibonacci
        int termine = 10;
        int posizione_attuale = 2;
        int precedente = 1, attuale = 1;
        System.out.println("F(1) = " + precedente);
        System.out.println("F(2) = " + attuale);
        //while (posizione_attuale <= termine){
        for (int i = 0; i < 8 ; i++) {
            posizione_attuale = i + 2;
            int nuovo = attuale + precedente;
            System.out.println("F(" + (posizione_attuale + 1) + ") = " + nuovo);
            precedente = attuale;
            attuale = nuovo;
            //posizione_attuale++;
        }
        //Utilizzando la funzione
        int valore = fibonacci(10);
        System.out.println("Il valore della successione al passo 10 è " + valore);

    }
}