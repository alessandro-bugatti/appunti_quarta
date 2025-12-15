import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci un numero intero:");
        int n = in.nextInt();
        for (int i = 0; i <n ; i++) {
            l.add(rand.nextInt(101));
        }
        List<Integer> originale= new LinkedList<>(l);
        //System.out.println(l);
        for (int i = 1; i <l.size()-1 ; i++) {
            if(l.get(i)==l.get(i-1)+l.get(i+1)){
                l.set(i,l.get(i-1)*2);
            }
        }
        //System.out.println(l);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)!=originale.get(i)){
                System.out.println(originale.get(i)+"->"+l.get(i));
                System.out.println("posizione: "+i+" "+originale.get(i-1)+" "+ originale.get(i)+" "+originale.get(i+1));
            }
        }
    }
}