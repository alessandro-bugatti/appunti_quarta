public class Main {
    public static void inizializzaLampadine(Lampadina[] v){
        for (int i = 0; i < v.length; i++) {
            v[i] = new Lampadina(80);
            v[i].setNome("Lampadina " + (i+1));
        }
    }

    public static Lampadina[] tornaAccese(Lampadina[] v){
        Lampadina[] accese;
        int conta = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null && v[i].isAcceso()){
                conta++;
            }
        }
        accese = new Lampadina[conta];
        int j = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null && v[i].isAcceso()){
                accese[j] = v[i];
                j++;
            }
        }
        return accese;
    }

    public static void main(String[] args) {
        Lampadina s = new Lampadina(8.8f);
        Lampadina f = new Lampadina(s);

        System.out.println(s);
        System.out.println(f);

        s.setIntensita(56);
        System.out.println(s);
        s.setIntensita(45);
        System.out.println(s);

        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = i;
        }

        Lampadina[] vl;
        vl = new Lampadina[10];
        inizializzaLampadine(vl);
        vl[1].accendi();
        vl[5].accendi();
        for (Lampadina l: vl) {
            System.out.println(l);
        }
        Lampadina[] accese = tornaAccese(vl);
        for (Lampadina l: accese) {
            System.out.println(l);
        }

        SistemaDomotico sistemaDomotico = new SistemaDomotico(10);

        s.setNome("Test");

        sistemaDomotico.aggiungi(s);
        sistemaDomotico.aggiungi(new Lampadina(80,"Test2"));

        sistemaDomotico.accendi("Test2");
        s.accendi();

    }
}