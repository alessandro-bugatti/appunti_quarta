import java.io.*;

public class EsempioSerializzazione {
    public static void  main(String args[]) throws IOException, ClassNotFoundException {
        /*
        Lampadina l = new Lampadina(80, "Sala da ballo");

        l.accendi();
        l.aumentaIntensita();
        FileOutputStream fout;
        fout = new FileOutputStream("statoSistema.bin");
        ObjectOutputStream os;
        os = new ObjectOutputStream(fout);
        os.writeObject(l);
        */
        Lampadina l;
        FileInputStream fin = new FileInputStream("statoSistema.bin");
        ObjectInputStream is = new ObjectInputStream(fin);
        l = (Lampadina) is.readObject();
        System.out.println(l);
    }
}
