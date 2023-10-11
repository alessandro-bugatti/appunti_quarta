public class Main {
    public static void main(String[] args) {
        /**
         * Quando si definisce una classe quello è il modello su cui
         * si vogliono creare degli oggetti
         */
        Lampadina a, b;
        a = new Lampadina(50, "bianco", "sala");
        b = new Lampadina(20, "blu", "cucina");
        System.out.println(a);
        System.out.println(b.toString());
        
    }
}