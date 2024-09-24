import java.lang.System;

public class Main {
    public static void main(String[] args) {
        Frazione f = new Frazione(1,2);
        System.out.println(f);
        f = new Frazione(6,3);
        System.out.println(f);
        f = new Frazione(6,1);
        System.out.println(f);
        f = new Frazione(0,3);
        System.out.println(f);
        f = new Frazione(1,-3);
        System.out.println(f);
        f = new Frazione(-2,-3);
        System.out.println(f);
        f = new Frazione(5);
        System.out.println(f);
        Frazione a = new Frazione(1);
        Frazione b = new Frazione(1, 2);
        Frazione c = a.somma(b);
        System.out.println(c);
        c = a.differenza(b);
        System.out.println(c);

    }
}