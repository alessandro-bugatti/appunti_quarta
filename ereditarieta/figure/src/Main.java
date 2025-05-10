import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(2, 4);
        System.out.println(r.getPerimetro());
        r.sposta(2,2);
        System.out.println(r);
        r = new Rettangolo(3, 1, "Giallo", 2, 4);
        r.sposta(2, 2);
        System.out.println(r);
        Quadrato q = new Quadrato(1,3, "Verde", 4);
        System.out.println(q.getPerimetro());
        System.out.println(q);
        LinkedList<Rettangolo> lr = new LinkedList<>();
        lr.add(r);
        lr.add(new Rettangolo(5, 7, "Blu", 9, 13));
        for (Rettangolo ret: lr) {
            ret.sposta(1,1);
        }
        //e poi dovrei fare la stessa cosa per quadrati e cerchi
        //oppure, posso fare un unico contenitore di figure
        List<Figura> lf = new LinkedList<>();
        lf.add(q);
        lf.add(r);
        for (Figura f: lf) {
            f.sposta(1,1);
            System.out.println(f.getPerimetro());
        }
        Collections.sort(lf);
        for (Figura f: lf) {
            f.sposta(1,1);
            System.out.println(f.getPerimetro());
        }
    }
}