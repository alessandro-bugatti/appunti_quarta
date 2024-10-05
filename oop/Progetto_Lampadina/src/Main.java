public class Main {
    public static void main(String[] args) {
        Lampadina s = new Lampadina(8.8f);
        Lampadina f = new Lampadina(s);

        System.out.println(s);
        System.out.println(f);
    }
}