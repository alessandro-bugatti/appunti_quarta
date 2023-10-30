public class Main {
    public static void main(String[] args) {
        Punto p,t,f;
        p = new Punto(2,3);
        t = new Punto(p);
        f = null;
        System.out.println(p);
        System.out.println(t);
        if (p.equals(t)){
            System.out.println("Sono uguali");
        }else {
            System.out.println("Sono diversi");
        }
        double d = p.distanza(t);
        System.out.println(d);
    }
}