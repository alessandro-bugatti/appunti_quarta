import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Data, String> eventi = new HashMap<>();
        eventi.put(new Data(4, 7, 1776), "Dichiarazione d'indipendenza degli Stati Uniti");
        eventi.put(new Data(11,9,2001), "Attacco alle torri gemelle");
        eventi.put(new Data(9,10,1963), "Disastro della diga del Vajont");

        System.out.println(eventi);

        System.out.println(eventi.get(new Data(4,7,1776)));

        Set<Data> date = eventi.keySet();

        for (Data d: date) {
            System.out.println(d);
        }

        //date.add(new Data(3,12,2006));

        Collection<String> avvenimenti = eventi.values();

        for (String s: avvenimenti) {
            System.out.println(s);
        }

        eventi.remove(new Data(11,9,2001));

        System.out.println(eventi);

        eventi.replace(new Data(4,7,1776), "nascita lorenzo");
        System.out.println(eventi);
    }
}