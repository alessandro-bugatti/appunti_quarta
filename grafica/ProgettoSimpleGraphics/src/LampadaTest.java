import java.util.Scanner;

public class LampadaTest {
    public static void main(String[] s){
        Lampadina l = new Lampadina(100, 100, 100);
        System.out.println(l);
        Scanner in = new Scanner(System.in);
        int scelta = in.nextInt();
        while(scelta != 0){
            if (scelta == 1){
                l.accendi();
            }else if (scelta == 2){
                l.spegni();
            }
            scelta = in.nextInt();
        }
    }

}
