package net.imparando;

public class Main {

    public static void main(String[] args) {
	    AlberoBinario a = new AlberoBinario(42);
        a.add(42);
        a.add(27);
        a.add(71);
        a.add(13);
        a.add(31);
        a.add(84);
        a.add(50);
        a.add(2);
        a.add(21);
        a.add(48);
        a.add(62);
        a.add(87);
        a.add(17);
        a.add(120);
        a.add(28);
        a.visitaAnticipata();
        a.visitaPosticipata();
        a.visitaInOrder();
    }
}
