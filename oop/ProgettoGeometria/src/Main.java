import net.imparando.Punto;
import net.imparando.Segmento;

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

        a = new Punto(200,200);
        System.out.println("Distanza tra a  e l'origine: " + a.distanzaOrigine());

        Segmento s = new Segmento(a ,b);
        s.disegna();
        a = new Punto(50, 100);
        a.disegna();

        graphics.Canvas.pause();
        a = new Punto(100, 200);
        a.disegna();
    }
}