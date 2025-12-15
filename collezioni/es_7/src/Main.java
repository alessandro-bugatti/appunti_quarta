import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static public void main(String[] strings){
        List<Double> l = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            l.add(Math.random()*1000);
        }
        //System.out.println(l);
        double media, max, min;
        media = 0;
        max = l.get(0);
        min = l.get(0);
        for (double i: l) {
            media+=i;
            if(i>max)
                max = i;
            if (i<min)
                min = i;
        }
        System.out.println("media = " + media/l.size());
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);


    }
}
