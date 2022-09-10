package net.imparando;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>();
        a.add(42);
        a.add(27);
        a.add(13);
        a.add(31);
        a.add(2);
        a.add(21);
        a.add(71);
        a.add(50);
        a.add(84);
        a.add(48);
        a.add(62);
        a.add(87);
        System.out.println(a);
        for (int i: a ) {
            System.out.print(i + ", ");
        }
        System.out.println(a.contains(87));
        System.out.println(a.contains(55));
        //Massimo
        System.out.println(a.last());
        //Minimo
        System.out.println(a.first());
        //Rimozione
        a.remove(50);
        System.out.println(a);

    }
}
