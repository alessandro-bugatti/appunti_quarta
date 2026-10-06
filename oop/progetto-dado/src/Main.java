import java.util.Scanner;
public class Main{

    public static int lanciaDadi(int quanti, int facce){
        Dado d = new Dado(facce);
        int totale = 0;
        for (int i = 0; i < quanti; i++) {
            totale += d.lancia();
        }
        return totale;
    }

    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        Dado d = new Dado();
//        System.out.println("1 Crea dado");
//        System.out.println("2 Visualizza numero di facce");
//        System.out.println("3 Lancia il dado");
//
//        System.out.println("Scegli: ");
//        int scelta = input.nextInt();
//        if (scelta == 1){
//            System.out.println("Numero di facce: ");
//            int n = input.nextInt();
//            d = new Dado(n);
//            System.out.println("Dado creato");
//        }
//        if(scelta == 2){
//            System.out.println(d);
//        }
//        if(scelta == 3){
//            System.out.println("Faccia uscita: " + d.lancia());
//        }
        Dado d10 = new Dado(10);
        Dado d6 = new Dado(6);
        int totale = 0;
        for (int i = 0; i < 3; i++) {
//            int n = d10.lancia();
//            totale += n;
//            System.out.println(n);
            totale += d10.lancia();
            System.out.println(d10.getUltimoLancio());
        }
        System.out.println("Totale: " + totale);
        System.out.println(d10);
        if (d10.equals(d6)) {
            System.out.println("I dadi sono uguali");
        } else {
            System.out.println("I dadi non sono uguali");
        }
        if (!d10.equals("ciao")){
            System.out.println("Un dado non è uguale a una stringa");
        }
        System.out.println(Main.lanciaDadi(3, 6));
    }


}

