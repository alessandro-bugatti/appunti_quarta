public class Main {
    public static void main(String[] args) {
        int v[] = new int[10];
        for (int i = 0; i <= 10; i++) {
            //Usare un try-catch per catturare RunTimeException è qualcosa che
            //in generale non ha senso ed è il motivo per il quale le eccezioni
            //di tipo RunTimeException non vengono gestite e vengono rilanciate
            //automaticamente senza che sia necessario aggiungerle alla segnatura
            //del metodo
            try {
                v[i] = i + 1;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
    }
}