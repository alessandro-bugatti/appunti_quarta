import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            apriFile("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        }
    }

    public static void apriFile(String nomeFile) throws FileNotFoundException {
        FileReader reader = new FileReader(nomeFile);
    }
}