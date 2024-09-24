import java.util.*;

public class Main {

    private static void stampa_mano(List<Carta> carte){
        for (int i = 0; i < carte.size(); i++) {
            System.out.println("Indice " + (i + 1) + " " + carte.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Carta> mazzo = new ArrayList<>();
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 13 ; j++) {
                mazzo.add(new Carta(j, i));
            }
        }
        System.out.println(mazzo);
        Collections.shuffle(mazzo);
        System.out.println(mazzo);
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            mano.add(mazzo.get(i));
        }
        stampa_mano(mano);
        /*int i, j;
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci le due posizioni di scambio (-1 per terminare):");
        i = in.nextInt();
        j = in.nextInt();
        while (i != -1){
            Collections.swap(mano, i, j);
            stampa_mano(mano);
            System.out.println("Inserisci le due posizioni di scambio (-1 per terminare):");
            i = in.nextInt();
            j = in.nextInt();
        }*/
        Collections.sort(mano);
        System.out.println(mano);
        Carta t = new Carta(2,2);
        int posizione = Collections.binarySearch(mano, t);
        if (posizione < 0)
            System.out.println("Il " + t + " non è presente e, per mantenere la lista ordinata sarebbe da inserire in posizione " + (-posizione - 1));
        else
            System.out.println("Il " + t + " è presente in posizione " + posizione);
    }
}