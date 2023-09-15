import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeri;
        numeri = new ArrayList<>();
        for (int i = 1; i <= 5 ; i++) {
            numeri.add(i);
        }
        System.out.println(numeri);
        if (numeri.remove(new Integer(3)))
            System.out.println("Rimosso");
        else
            System.out.println("Non presente");
        System.out.println(numeri);
        //Primo problema: attenzione che quando si rimuove un elemento
        //gli indici degli elementi successivi diventano -1. Se non
        //gestito si salta il controllo sull'elemento dopo quello rimosso
        for (int i = 0; i < numeri.size(); i++) {
            if (numeri.get(i) == 2){
                numeri.remove(i);
            }
        }
        System.out.println(numeri);
        for (Integer n:
             numeri) {
            if (n == 4){
                numeri.remove(n);
            }
        }
        //Altro problema: modifica di un ArrayList su cui si sta iterando con un
        //iteratore
        Iterator<Integer> it = numeri.iterator();
        while (it.hasNext())
        {
            Integer n = it.next();
            if (n == 5)
                numeri.remove(n);
                //it.remove(); corretto
        }
        System.out.println(numeri);
    }
}