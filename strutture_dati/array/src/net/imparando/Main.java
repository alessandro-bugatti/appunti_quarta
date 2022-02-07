package net.imparando;

public class Main {

    public static void main(String[] args) {
	    Array arr = new Array();
        for (int i = 0; i < 16; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        arr.add(1000);
        System.out.println(arr);
        for (int i = 0; i < 100; i++) {
            arr.add(i+1000);
        }
        System.out.println(arr);

    }
}
