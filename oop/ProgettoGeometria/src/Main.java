import net.imparando.Punto;

public class Main {
    public static void main(String[] args) {
        Punto a = new Punto(2,3);
        Punto b = new Punto(1, -7);

        System.out.println("Punto a: " + a);
        System.out.println("Punto b: " + b);
        System.out.println("Distanza tra a e b: " + a.distanza(b));

        a.traslaX(10);
        b.trasla(1, 7);

        System.out.println("Punto a: " + a);
        System.out.println("Punto b: " + b);
        System.out.println("Distanza tra a e b: " + a.distanza(b));

        a = new Punto(1,1);
        System.out.println("Distanza tra a  e l'origine: " + a.distanzaOrigine());

    }
}