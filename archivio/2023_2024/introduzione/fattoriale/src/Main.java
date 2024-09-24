public class Main {

    private static int fattoriale(int N){
        if (N == 0)
            return 1;
        //Definizione ricorsiva
        return fattoriale(N-1) * N;
    }

    public static void main(String[] args) {
        System.out.println(fattoriale(3));
    }
}