public class Main {
    public static void main(String[] args) {
        /**
         * Quando si definisce una classe quello è il modello su cui
         * si vogliono creare degli oggetti
         */
        Lampadina l = new Lampadina();
        l.potenza = 100000;
        System.out.println(l.potenza);
    }
}