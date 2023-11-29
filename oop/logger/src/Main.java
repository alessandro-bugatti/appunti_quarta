import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Logger log = null;
        try {
            log = new Logger("referto.txt");
        } catch (IOException e) {
            System.out.println("Apertura del file fallita");
            return;
        }
        try {
            log.add("prova");
            log.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}