package net.imparando;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Dichiarazione di un array usando come tipo una lista
        //Questo sarebbe il modo migliore, perchè è ancora più generale
        //ma noi preferiremo quello più esplicito
        //List l = new ArrayList<Integer>();
        //Il secondo modo crea direttamente un ArrayList
        ArrayList<Integer> l = new ArrayList<>();
        //Aggiunta di un nuovo elemento
        l.add(13);
        l.add(45);
        l.add(12);
        System.out.println(l);
        //Come iterare su un contenitore?
        //Ci sono tre modi

        //Modo 1, il classico
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        //Modo 2, il prolisso
        Iterator<Integer> iter = l.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        //Modo 3, il carino
        for (Integer item: l) {
            System.out.println(item);
        }
        for (int i = 0; i < 10; i++) {
            l.add(i*3 + 5);
        }
        //Rimozione di un elemento per indice
        System.out.println(l);
        l.remove(5);
        System.out.println(l);
        //Rimozione di un elemento indicandone il "valore"
        l.remove(Integer.valueOf(20));
        System.out.println(l);
        ArrayList <Integer> l2 = new ArrayList<>();
        l2.add(17);
        l2.add(23);
        l.add(17);
        System.out.println(l);
        l.removeAll(l2);
        System.out.println(l);
        System.out.println(l2);
        for (int i = 0; i < 5; i++) {
            l.add(20);
        }
        System.out.println(l);
        int dim = l.size();
        l.remove(Integer.valueOf(20));
        while(dim != l.size()){
            dim = l.size();
            l.remove(Integer.valueOf(20));
        }
        System.out.println(l);
        while(l.remove(Integer.valueOf(20)));



    }
}
