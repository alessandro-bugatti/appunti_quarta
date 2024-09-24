import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> rubrica;
        rubrica = new HashMap<>();
        rubrica.put("Anna", "123456789");
        rubrica.put("Marco", "987653221");
        System.out.println(rubrica);
        rubrica.put("Anna", "111111111");
        System.out.println(rubrica);

        HashMap<String, ArrayList<String >> rubricaMigliorata;
        rubricaMigliorata = new HashMap<>();
        ArrayList<String> t;
        t = rubricaMigliorata.get("Anna");
        if (t == null){
            t = new ArrayList<>();
            t.add("123456789");
            rubricaMigliorata.put("Anna", t);
        }
        else{
            t.add("999999999");
            rubricaMigliorata.put("Anna", t);
        }
        System.out.println(rubricaMigliorata);
        t = rubricaMigliorata.get("Anna");
        if (t == null){
            t = new ArrayList<>();
            t.add("123456789");
            rubricaMigliorata.put("Anna", t);
        }
        else{
            t.add("999999999");
            rubricaMigliorata.put("Anna", t);
        }
        System.out.println(rubricaMigliorata);
        System.out.println(rubricaMigliorata.get("Piero"));
    }
}