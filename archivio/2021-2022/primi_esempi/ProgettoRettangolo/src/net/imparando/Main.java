package net.imparando;

public class Main {

    public static void main(String[] args) {
	    Rettangolo r = new Rettangolo(new Punto(3,7), new Punto (10, 2));
        System.out.println(r.getArea());
        r.spostaX(4);
    }
}
