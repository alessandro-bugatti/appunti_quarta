package net.imparando;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Match match = new Match(5);
        Scanner in = new Scanner(System.in);
        while(!match.isFinished()){
            System.out.println("Inserisci chi ha fatto il punto: ");
            int giocatore = in.nextInt();
            if (giocatore == 1)
                match.puntoGiocatoreUno();
            else
                match.puntoGiocatoreDue();
            System.out.println(match);
        }


    }
}
