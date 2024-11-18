public class Presa {
    private int x, y;

    public Presa(String s){
        String pezzi[] = s.split(" ");
        x = Integer.parseInt(pezzi[0]);
        y = Integer.parseInt(pezzi[1]);
    }
}
