import java.util.ArrayList;
import java.util.Arrays;

public class TazzaPerDadi {
    private ArrayList<Dado> arr;

    TazzaPerDadi(int nMax) {
        arr = new ArrayList<>(nMax);
    }

    TazzaPerDadi(int N, int F) {
        arr = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            arr.add(new Dado(F));
        }
    }

    public boolean add(Dado d) {
        return arr.add(d);
    }

    public int quanti() {
        return arr.size();
    }

    public boolean isEmpty() {
        return arr.isEmpty();
    }

    public int getMinimo() {
        return arr.size();
    }

    public int getMassimo() {
        int num = 0;
        for (int i = 0; i < arr.size(); i++) {
            num += arr.get(i).getFaccieDado();
        }
        return num;
    }

    public int lancia() {
        int num = 0;
        for (int i = 0; i < arr.size(); i++) {
            num += arr.get(i).lancia();
        }
        return num;
    }

    @Override
    public String toString() {
        String s = "Dadi attualmente contenuti: " + arr.size() + "\n";
        s += "Lista dei dadi:\n";
        for (int i = 0; i < arr.size(); i++) {
            s += "- dado da " + arr.get(i).getFaccieDado() + "\n";
        }
        return s;
    }
}
