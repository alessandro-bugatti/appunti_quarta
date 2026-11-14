import graphics.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vuoi disegnare un cerchio (1), un rettangolo(2) o un'immagine(3) o uscire(0)?");
        int scelta = in.nextInt();
        while(scelta != 0){
            if (scelta == 1){
                Ellipse e = new Ellipse(300, 300, 200, 200);
                e.draw();
            }
            else if (scelta == 2){
                Rectangle r = new Rectangle(50, 100, 200, 400);
                r.setColor(new graphics.Color(255, 0,0));
                r.fill();
            }
            else{
                Picture p = new Picture("java.png");
                p.draw();
                Text t = new Text(170, 450, "The Duke");
                t.setColor(new Color(255, 100, 0));
                t.grow(100, 40);
                t.draw();
            }
            System.out.println("Vuoi disegnare un cerchio (1), un rettangolo(2) o un'immagine(3) o uscire(0)?");
            scelta = in.nextInt();
        }
    System.exit(0);

    }
}