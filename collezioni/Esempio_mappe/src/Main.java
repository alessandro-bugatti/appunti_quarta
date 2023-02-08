import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        HashMap<String, String> rubrica;
        rubrica = new HashMap<>();
        rubrica.put("Giorgio", "12345678");
        rubrica.put("Anna", "987654321");
        rubrica.put("Deborah", "555555555");
        //La get è un'operazione efficiente
        System.out.println(rubrica.get("Giorgio"));
        System.out.println(rubrica.size());
        //La chiave è unica, quindi sovrascrive eventuali valori
        //presenti in precedenza
        rubrica.put("Giorgio", "33345678");
        System.out.println(rubrica.get("Giorgio"));
        System.out.println(rubrica.toString());
        //Sintatticamente corretta, semanticamente sbagliata
        for (int i = 0; i < rubrica.size(); i++) {
            System.out.println(rubrica.get(i));
        }
        //Si fa in questo modo
        for (String s:
             rubrica.keySet()) {
            System.out.println(s);
        }

        //Esercizio 1
        HashMap<String, String> biblioteca1 = new HashMap<>();
        HashMap<String, String> biblioteca2 = new HashMap<>();
        biblioteca1.put("987666657", "L'isola del tesoro");
        biblioteca1.put("987666659", "Il signore delle mosche");
        biblioteca2.put("987666659", "Il signore degli anelli");
        biblioteca2.putAll(biblioteca1);
        System.out.println(biblioteca2);

        HashMap<String, String> storia = new HashMap<>();
        storia.put("17-03-1861", "Proclamazione di Vittorio Emanuele II come Re d'Italia");
        storia.put("20-07-1969", "Primo uomo sulla Luna");
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci una data nel formato gg-mm-aaaa: ");
        String data = in.next();
        String evento = storia.get(data);
        if (evento == null)
            System.out.println("Non esiste l'evento richiesto");
        else
            System.out.println(evento);

        HashMap<String, String> ristoranti = new HashMap<>();
        ristoranti.put("Il cavallino dorato", "Gianfranco Peronisi");
        ristoranti.put("La vecchia locanda", "Arturo Mestolini");
        for (String ristorante: ristoranti.keySet()){
            System.out.println(ristorante);
        }
        //Prima possilità
        for (String capocuoco : ristoranti.values()){
            System.out.println(capocuoco);
        }
        //Seconda possibilità
        for (String ristorante: ristoranti.keySet()){
            System.out.println(ristoranti.get(ristorante));
        }

        System.out.println(ristoranti);

        for(Map.Entry<String, String> coppia:ristoranti.entrySet()){
            System.out.println(coppia);
            System.out.println(coppia.getKey() + " -> " + coppia.getValue());
        }

    }
}