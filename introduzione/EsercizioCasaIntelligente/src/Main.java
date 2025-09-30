

public class Main {
    public static void main(String[] args) {
        LampadinaIntelligente l = new LampadinaIntelligente(-50);
        System.out.println(l.getPotenza());
        LampadinaIntelligente m = l;
        System.out.println(l);
        m = new LampadinaIntelligente(890);
        System.out.println(m);
        if (l.equals(m)){
            System.out.println("Sono uguali.");
        }
        m.setNome("Sala");
        if (!l.equals(m)){
            System.out.println("Sono diverse.");
        }
        l.setNome("Sala");
        if (l.equals(m)){
            System.out.println("Sono tornate uguali.");
        }

    }
}