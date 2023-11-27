public class Main {
    public static void main(String[] args) {
        Partita partita = new Partita("Torbole", "Concesio");
        partita.assegnaPuntoCasa();
        System.out.println(partita.getPunteggioCasa());
        for (int i = 0; i < 24; i++) {

            if (partita.assegnaPuntoCasa())
                System.out.println("Set vinto");
            partita.assegnaPuntoOspiti();
        }
        System.out.println(partita.getPunteggioCasa());
        System.out.println(partita.getSetCasa());
        partita.assegnaPuntoCasa();
        System.out.println(partita.getPunteggioCasa());
        System.out.println(partita.getSetCasa());
        System.out.println(partita.getPunteggioOspiti());
        System.out.println(partita.getSetOspiti());

    }
}