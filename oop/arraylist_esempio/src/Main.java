import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lampadina> v; //Array di lampadine
        //Creazione dell'oggetto di tipo ArrayList
        v = new ArrayList<>();
        //Da questo momento esiste un oggetto nell'heap che
        //rappresenta un vettore di lampadine, al momento vuoto
        Lampadina l = new Lampadina(80, "Sala");
        v.add(new Lampadina(l)); //Se voglio una copia dell'oggetto riferito da l
        v.add(new Lampadina(40, "Divano"));
        //Con il metodo size mi faccio dire quanti elementi sono presenti nel vettore
        for (int i = 0; i < v.size(); i++) {
            //Con il metodo get recupero un elemento tramite l'indice
            v.get(i).accendi();
        }
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        l.spegni();
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        //ArrayList ha il suo metodo toString, che stampa nella forma
        // [e0, e1, e2, ...]
        System.out.println(v);
        for (Lampadina lampadina: v) {
            System.out.println(lampadina);
        }
        for (Lampadina lampadina: v){
            lampadina.spegni();
        }
        System.out.println(v);

        ArrayList<Integer> li;
        li = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            li.add(i);
        }

    }
}