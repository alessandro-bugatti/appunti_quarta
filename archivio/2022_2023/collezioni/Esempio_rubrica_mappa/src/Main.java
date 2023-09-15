import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("1 - Aggiungi un numero di telefono");
        System.out.println("2 - Cerca per nome");
        System.out.println("0 - Esci");
    }
    public static void main(String[] args) {
        String scelta = "1";
        Scanner in = new Scanner(System.in);
        HashMap<String, HashSet<String>> rubrica;
        rubrica = new HashMap<>();

        while(!scelta.equals("0")){
            switch (scelta){
                case "1":
                    System.out.println("Inserisci il nome: ");
                    String nome = in.next();
                    System.out.println("Inserisci il telefono: ");
                    String telefono = in.next();
                    if (!rubrica.containsKey(nome)){
                        HashSet<String> set;
                        set = new HashSet<>();
                        set.add(telefono);
                        rubrica.put(nome, set);
                    }
                    else{
                        //rubrica.get(nome).add(telefono);
                        HashSet<String> set;
                        set = rubrica.get(nome);
                        set.add(telefono);
                    }
                    break;
                case "2":
                    System.out.println("Inserisci il nome: ");
                    String nomecercato = in.next();
                    System.out.println(rubrica.get(nomecercato));
                    break;
            }
            System.out.println("Inserisci la scelta: ");
            scelta = in.next();
        }

    }
}