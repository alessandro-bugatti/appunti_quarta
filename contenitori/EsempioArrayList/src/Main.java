import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(45);
        a.add(72);
        a.add(0, 98);
        //a.add(5,87); //eccezione
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        System.out.println(a);
    }
}