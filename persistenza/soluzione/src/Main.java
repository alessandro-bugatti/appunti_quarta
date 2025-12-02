import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

import static java.time.DayOfWeek.SUNDAY;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String invertiParole(String s){
        String[] parole = s.split(" ");
        String r = "";
        for (int i = parole.length - 1; i >= 0 ; i--) {
            r += parole[i] + " ";
        }
        return r;
    }

    public static int quantiLavorativi(String inizio, String fine){
        //Si suppone che le date siano in ordine
        LocalDate a = LocalDate.parse(inizio);
        LocalDate b = LocalDate.parse(fine);
        int cont = 0;
        for (LocalDate d = a; !d.isAfter(b); d.plusDays(1)){
            if (d.getDayOfWeek() != SUNDAY){
                cont++;
            }
        }
        return cont;
    }

    private static boolean presente(String cercata, String s){
        if (s.indexOf(cercata) != -1){
            return true;
        }
        return false;
    }

    public static String[] paroleRipetute(String nomefile) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(nomefile));
        ArrayList<String> al = new ArrayList<>();
        String s;
        while((s = br.readLine())!= null){
            al.add(s);
        }
        String ripetute = "";
        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i).equals(al.get(j))){
                    if (!presente(al.get(i), ripetute)){
                        ripetute += al.get(i) + " ";
                    }
                }
            }
        }
        return ripetute.split(" ");

    }

    public class Libro implements Serializable {
        private String titolo;
        private String autore;
        private int pagine;

        public int getPagine() {
            return pagine;
        }
        // getters e equals() già implementati
    }

    public static ArrayList<Libro> getPagineMaggioreDi(String nomefile, int N) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomefile));
        ArrayList<Libro> libri = (ArrayList<Libro>) in.readObject();
        ArrayList<Libro> ris = new ArrayList<>();
        for (int i = 0; i < libri.size(); i++) {
            if (libri.get(i).getPagine() > N){
                ris.add(libri.get(i));
            }
        }
        return ris;
    }

    public static void main(String[] args) {

    }
}