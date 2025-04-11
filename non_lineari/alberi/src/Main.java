public class Main {
    public static void main(String[] args) {
        Albero a = new Albero(7);
        a.add(4, 7);
        a.add(5, 7);
        a.add(11, 4);

        a.visitaAnticipata();
        System.out.println();
        a.visitaDifferita();
        System.out.println("\nMassimo: " + a.massimo());

    }
}