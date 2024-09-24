import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            al.add((int)(Math.random()*100));
        }
        System.out.println(Collections.max(al));
        LinkedList<String> ll = new LinkedList<>();
        ll.add("tavolo");
        ll.add("lampada");
        ll.add("nave");
        System.out.println("La parola massima è " +
                Collections.max(ll));
        System.out.println("La parola minima è " +
                Collections.min(ll));
        System.out.println("La frequenza di 97 è " +
                Collections.frequency(al, 97));
        al.clear();
        for (int i = 0; i < 10; i++) {
            al.add(i+1);
        }
        System.out.println(al);
        Collections.swap(al,2,5);
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(ll);
        System.out.println(ll);

        ArrayList<Orario> ol = new ArrayList<>();
        ol.add(new Orario(12,33,44));
        ol.add(new Orario(12,12,56));
        ol.add(new Orario(12,34,55));
        Collections.sort(ol);
        System.out.println(ol);
    }
}