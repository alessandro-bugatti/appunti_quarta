import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MappaPrese {
    private String nomePiantina;
    private ArrayList<Presa> prese;

    public MappaPrese(String nomeFile) throws FileNotFoundException, IOException, FormatoFileNonValido {
        FileReader fr;
        prese = new ArrayList<>();
        fr = new FileReader(nomeFile);
        BufferedReader br = new BufferedReader(fr);
        //Controllo se il file è valido perchè nella prima riga deve contenere la
        //parola mappa
        String formato = br.readLine();
        if (!formato.equals("mappa")){
            throw new FormatoFileNonValido("Il formato non è valido perchè la parola è " + formato);
        }
        this.nomePiantina = br.readLine();
        String n = br.readLine();
        int n_prese = Integer.parseInt(n);
        for (int i = 0; i < n_prese; i++) {
            String temp = br.readLine();
            prese.add(new Presa(temp));
        }
        br.close();
        fr.close();
    }

    public String getNomePiantina(){
        return this.nomePiantina;
    }

}
