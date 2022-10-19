public class Main {
    public static void main(String[] args) {
        Frazione f, g, h;
        f = new Frazione(1,2);
        g = new Frazione(2,3);
        h = new Frazione("1/23");
        //Utilizzo del costruttore di copia
        Frazione i = new Frazione(h);


        //Esempio di utilizzo del metodo toString
        //Se non definito il metodo ritorna una stringa della forma
        //nomeClasse@indirizzo (non è proprio un indirizzo...)
        System.out.println(g.toString());

        System.out.println(f);

        //Esempio di utilizzo dei metodi getter
        int somma = f.getNumeratore() + g.getNumeratore();

        //Esempio di utilizzo della somma
        Frazione totale = f.somma(g);
        //Frazione totale2 = i.somma(f, g); Versione assurda, poichè i non serve
        System.out.println(totale);

    }
}