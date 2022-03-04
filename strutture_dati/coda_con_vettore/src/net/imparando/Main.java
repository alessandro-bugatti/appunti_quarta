package net.imparando;

public class Main {

    public static void main(String[] args) {
        Coda c = new Coda();
        c.push(13);
        c.push(14);
        c.push(15);
        System.out.println(c.pop());
        c.push(16);
        while(!c.empty())
            System.out.println(c.pop());
    }
}
