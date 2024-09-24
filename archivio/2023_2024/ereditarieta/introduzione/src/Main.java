public class Main {
    public static void main(String[] args) {
        PuntoOrientato p = new PuntoOrientato(0,2,'A');
        p.setX(4);
        System.out.println(p);
        PuntoOrientato q = new PuntoOrientato(4, 2, 'A');
        if (p.equals(q))
            System.out.println("I due punti sono uguali");

    }
}