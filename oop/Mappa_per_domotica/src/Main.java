import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        try {
            MappaPrese mp = new MappaPrese("mappa1.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (FormatoFileNonValido e) {
            throw new RuntimeException(e);
        }
    }
}