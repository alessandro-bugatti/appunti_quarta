public class Main {

    //Carica un quiz leggendo le informazioni da un file esterno
    public static void carica(Quiz q, String nomefile){

    }

    public static void main(String[] args) {
        Quiz q = new Quiz("Primo esempio");
        carica(q, "domande.txt");
    }
}