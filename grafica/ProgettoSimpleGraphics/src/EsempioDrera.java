import graphics.*;

import java.util.Scanner;

public class EsempioDrera {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Quante palline vuoi che ci siano?");
        int scelta = in.nextInt();
        Ellipse[] ellipses = new Ellipse[scelta];
        for (int i = 0; i < ellipses.length; i++) {
            ellipses[i] = new Ellipse(i * 50, i*50, 50, 50);
        }
        for (int i = 0; i < ellipses.length; i++) {
            ellipses[i].draw();
        }
    }
}