import graphics.Color;
import graphics.Ellipse;

import java.util.Scanner;

public class PallineColorateMain {
    public static void main(String s[]){
        final int DIM = 256, MIN = 50, N = 10;
        Ellipse[] ellissi = new Ellipse[N];
        for (int i = 0; i < ellissi.length; i++) {
            ellissi[i] = new Ellipse(Math.random() * DIM,
                                    Math.random() * DIM,
                                    Math.random() * DIM + MIN,
                                    Math.random() * DIM + MIN);
            ellissi[i].setColor(new Color((int)(Math.random() * DIM),
                    (int)(Math.random() * DIM),
                    (int)(Math.random() * DIM)));
            ellissi[i].fill();
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Indica l'indice, da 1 a " + N + " per scegliere l'ellisse   o uscire(0)?");
        int scelta = in.nextInt();
        while(scelta != 0){
            System.out.println("Inserisci dx e dy: ");
            int x = in.nextInt();
            int y = in.nextInt();
            ellissi[scelta].translate(x, y);
            System.out.println("Indica l'indice, da 1 a " + N + " per scegliere l'ellisse   o uscire(0)?");
            scelta = in.nextInt();
        }
        System.exit(0);
    }
}
