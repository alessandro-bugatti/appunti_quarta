import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TazzaPerDadi t = new TazzaPerDadi(2000);
        for (int i = 0; i < 1000; i++) {
            t.add(new Dado(6));
        }
        int l = t.lancia();
        t.add(new Dado(10));
        System.out.println(l);
        System.out.println(t);
    }
}
