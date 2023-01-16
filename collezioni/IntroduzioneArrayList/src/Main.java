import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> valori;
        valori = new ArrayList<>();
        //Metodo add
        valori.add(12);
        valori.add(27);
        System.out.println(valori);
        //Metodo addAll
        ArrayList <Integer> valori2;
        valori2 = new ArrayList<>();
        //Metodo add
        valori2.add(33);
        valori2.add(-7);
        valori2.add(4);
        valori.addAll(valori2);
        System.out.println(valori);
        System.out.print("[" + valori.get(0));
        //Iterazione
        for (int i = 1; i < valori.size(); i++){
            System.out.print(" ," + valori.get(i));
        }
        System.out.print("]\n");
        //clear
        valori2.clear();
        System.out.println(valori2);
        valori.remove(Integer.valueOf(12));
        System.out.println(valori);

        //Ciclare su una collezione
        //for normale se la collezione è anche una lista
        int somma = 0;
        for (int i = 0; i < valori.size(); i++)
        {
            somma += valori.get(i);
        }
        System.out.println(somma);
        //Metodo di iterazione con un iteratore
        Iterator<Integer> i;
        i = valori.iterator();
        somma = 0;
        while(i.hasNext()){
            int temp = i.next();
            somma += temp;
        }
        System.out.println(somma);
        somma = 0;
        //Metodo con foreach
        for (int valore:
             valori) {
            somma += valore;
        }

        //Classe LinkedList

        LinkedList<Double> ll;
        ArrayList<Double> al;
        ll = new LinkedList<>();
        al = new ArrayList<>();
        ll.add(1.2);
        al.add(1.2);
        System.out.println(ll);
        System.out.println(al);
        ll.add(2.5);
        al.add(2.5);
        System.out.println(ll);
        System.out.println(al);
        for (int j = 0; j < 1000000; j++) {
            al.add(Math.random());
        }
        System.out.println(al.size());
        for (int j = 0; j < 1000000; j++) {
            ll.add(Math.random());
        }
        System.out.println(ll.size());
        /*for (int j = 0; j < 1000000; j++) {
            al.add(0,Math.random());
        }
        System.out.println(al.size());*/
        for (int j = 0; j < 1000000; j++) {
            ll.add(0,Math.random());
        }
        System.out.println(ll.size());
        double s = 0;
        for (double valore:
             al) {
            s += valore;
        }
        System.out.println(s);
        s = 0;
        for (double valore:
                ll) {
            s += valore;
        }
        System.out.println(s);
        for (int j = 0; j < 1000000; j++) {
            s += al.get((int)(Math.random()*1000000));
        }
        System.out.println(s);
        for (int j = 0; j < 1000000; j++) {
            s += ll.get((int)(Math.random()*1000000));
        }
        System.out.println(s);
    }
}