import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(45);
        al.add(34);
        al.add(98);
        System.out.println(al);
        Integer massimo = Collections.max(al);
        System.out.println(massimo);
        int minimo = Collections.min(al);
        System.out.println(minimo);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
        System.out.println(Collections.binarySearch(al,45));
        System.out.println(Collections.binarySearch(al,46));
    }
}