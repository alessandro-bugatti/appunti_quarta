import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private String nomeFile;
    private FileWriter fr;
    private BufferedWriter br;
    public Logger(String nomeFile) throws IOException {
        this.nomeFile = nomeFile;
        this.fr = new FileWriter(this.nomeFile);
        this.br = new BufferedWriter(fr);
    }

    public void add(String s) throws IOException {
        this.br.write(s + "\n");
    }

    public void close() throws IOException {
        this.br.close();
    }
}
