import java.io.*;
import java.util.ArrayList;

public class Main {

    //Carica un quiz leggendo le informazioni da un file esterno
    public static void carica(Quiz q, String nomefile) throws IOException, FileNotFoundException {
        FileReader f = new FileReader(nomefile);
        BufferedReader in = new BufferedReader(f);
        String s = "";
        while((s = in.readLine()) != null){
            String testo = s;
            ArrayList <String> r = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                s = in.readLine();
                r.add(s);
            }
            s = in.readLine();
            int n = Integer.parseInt(s);
            Risposta []risposte = new Risposta[4];
            for (int i = 0; i < r.size(); i++) {
                boolean corretta = false;
                if(i == n-1){
                    corretta = true;
                }
                risposte[i] = new Risposta(r.get(i),corretta);
            }
            Domanda d = new Domanda(testo, risposte);
            q.add(d);
        }
        in.close();
        f.close();
    }

    public static void main(String[] args) throws IOException {
        Quiz qSalvato;
        try{
            FileInputStream fis = new FileInputStream("quiz.save");
            ObjectInputStream ois = new ObjectInputStream(fis);
            qSalvato = (Quiz)ois.readObject();
        } catch (Exception e){
            qSalvato = null;
        }
        Quiz q = new Quiz("Primo esempio");
        try {
            carica(q, "domande.txt");
        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file");
            return;
        }
        System.out.println("Il quiz contiene " + q.getQuanteDomande() + " domande");
        //svolgimento del quiz
        if(qSalvato != null){
            System.out.println("C'è un quiz interrotto, vuoi continuare quello?");
            int [] nonDate = qSalvato.getDomandeNonDate();
            for (int i = 0; i < nonDate.length; i++) {
                System.out.println(qSalvato.getDomanda(nonDate[i]));
            }
            System.out.println(qSalvato.getQuanteDomande());
        }

        //prima di uscire serializzo il quiz
        FileOutputStream fos = new FileOutputStream("quiz.save");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(q);
        oos.close();
        fos.close();
    }
}