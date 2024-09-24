public class Fibonacci {

    private static int Fibonacci(int N){
        //Condizione di terminazione
        if (N == 1 || N == 2)
            return 1;
        //Definizione ricorsiva
        return Fibonacci(N-1) + Fibonacci(N-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }
}