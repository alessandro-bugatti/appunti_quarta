import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        int f = 68;
        a.add(45);
        a.add(72);
        a.add(f);
        a.add(0, 98);
        //a.add(5,87); //eccezione
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        System.out.println(a);
        System.out.println("Numero di elementi contenuti nell'arraylist: "  + a.size());
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(27,31,32,-6));
        System.out.println("b = " + b);
        a.addAll(b);
        System.out.println("a dopo l'aggiunta di b = " + a);
        System.out.println("Il quarto elemento di a è " + a.get(3));
        //int n = a.get(100); eccezione perchè non esiste la posizione 100
        a.set(3, 11);
        System.out.println("Il quarto elemento di a adesso è " + a.get(3));
        a.clear();
        System.out.println("a dopo la clear è diventato " + a);
        //System.out.println("Il primo elemento è " + a.get(0)); eccezione
    }
}