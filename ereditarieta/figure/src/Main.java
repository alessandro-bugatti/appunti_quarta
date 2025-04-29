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

    }
}