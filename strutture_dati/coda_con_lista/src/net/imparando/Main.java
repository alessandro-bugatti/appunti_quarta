package net.imparando;

public class Main {

    public static void main(String[] args) {
        Coda coda = new Coda();
        coda.push(17);
        coda.push(87);
        coda.push(45);
        coda.push(44);
        System.out.println(coda);
        System.out.println("Estratto l'elemento " + coda.pop());
        System.out.println("Estratto l'elemento " + coda.pop());
        System.out.println(coda);
        System.out.println("Estratto l'elemento " + coda.pop());
        System.out.println("Estratto l'elemento " + coda.pop());
        System.out.println(coda);
        if (coda.empty())
            System.out.println("La coda è vuota");
        System.out.println("Estratto l'elemento " + coda.pop());
        coda.push(99);
        System.out.println(coda);

    }
}
