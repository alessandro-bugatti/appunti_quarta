package net.imparando;

public class Main {

    public static void main(String[] args) {
        Array l = new Array();
        l.add(13);
        l.add(27);
        System.out.println(l.getItem(1));
        for (int i = 1000; i < 200000; i++) {
            l.add((int)(Math.random()*10000000));
        }
        int massimo = l.getItem(0);
        for (int i = 0; i < l.getDimensione(); i++) {
            if (massimo < l.getItem(i))
                massimo = l.getItem(i);

        }
        System.out.println(massimo);
    }
}
