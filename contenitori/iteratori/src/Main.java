import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> copia;
//        for (int i = 0; i < 10; i++) {
//            al.add(i + 1);
//        }
//        //Si vogliono rimuovere gli elementi di indice pari (0, 2, ...)
//
//        //Con ciclo for, si può, ma, modificando l'array, bisogna stare attenti agli indici
//        copia = (ArrayList<Integer>) al.clone();
//        for (int i = 0; i < copia.size(); i++) {
//            copia.remove(i);
//        }
//        System.out.println(copia);
//        //Con foreach, non si può fare, perchè non si può modificare una collezione
//        //su cui si sta iterando
//        copia = (ArrayList<Integer>) al.clone();
//        try {
//            int i = 0;
//            for (Integer el: copia) {
//                if (i % 2 == 0)
//                    copia.remove(el);
//                i++;
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        //Con l'iteratore
//        copia = (ArrayList<Integer>) al.clone();
//        Iterator<Integer> i = copia.iterator();
//
//        while(i.hasNext()){
//            i.next();
//            i.remove();
//            i.next();
//        }
//        System.out.println(copia);

        for (int i = 0; i < 11; i++) {
            al.add(i+1);
        }

        //Eliminare gli elementi in posizione pari
        copia = (ArrayList<Integer>) al.clone();

        for (int i = 0; i < copia.size(); i++) {
            copia.remove(i);
        }
        System.out.println(copia);

        int i = 0;
        copia = (ArrayList<Integer>) al.clone();
        try {
            for (Integer el: copia) {
                if (i % 2 == 0){
                    copia.remove(el);
                }
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        copia = (ArrayList<Integer>) al.clone();
        Iterator<Integer> it = copia.iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
            if (it.hasNext())
                it.next();
        }

        System.out.println(copia);



    }
}