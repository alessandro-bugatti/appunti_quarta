import java.util.HashMap;


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
    }
}