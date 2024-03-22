import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Le classi astratte non possono avere istanze concrete
        //Figura f = new Figura("Bianco",1,2);
        Cerchio c = new Cerchio("Bianco",1,2,3);
        System.out.println(c);
        Rettangolo r = new Rettangolo("Verde", 4,5,6,7);
        System.out.println("Perimetro del cerchio: " + c.getPerimetro());
        System.out.println("Perimetro del rettangolo: " + r.getPerimetro());

        //Polimorfismo
        //Downcasting implicito
        Figura f = new Cerchio("Blu", 12, 4,6);
        System.out.println(f.getPerimetro());
        Figura g = new Rettangolo("Giallo", 3, 4, 5, 6);
        System.out.println(g.getPerimetro());

        //Caso d'uso in cui voglio avere un contenitore
        //di oggetti diversi, ma che possono essere trattati
        //allo stesso modo
        ArrayList<Figura> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int scelta = (int)(Math.random()*3) + 1;
            if (scelta == 1){
                lista.add(new Cerchio("Bianco",1,3,4));
            }
            else if (scelta == 2){
                lista.add(new Rettangolo("Azzurro", 2, 3, 4, 5));
            }
            else {
                lista.add(new Quadrato("Verde", 3, 4, 5));
            }

        }
        for (Figura i: lista
        ) {
            System.out.println(i.getPerimetro());
        }
        Cerchio c2 = c;
        Figura l = c;
        Cerchio vero = (Cerchio) f;
        Cerchio finto = (Cerchio) g;
        vero.metodoDelCerchio();
        finto.metodoDelCerchio();
    }
}