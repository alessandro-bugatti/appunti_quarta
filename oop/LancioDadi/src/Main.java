public class Main {
    public static void main(String[] args) {
        int n_dadi = 3;
        LancioDadiCat l = new LancioDadiCat(n_dadi);
        int[] dadi;
        dadi = l.getValori();
        for (int i = 0; i < n_dadi; i++) {
            System.out.println("" + (i + 1) + " " + dadi[i]);
        }
        dadi[1] = 14;

        int[] dadi2;
        dadi2 = l.getValori();
        for (int i = 0; i < n_dadi; i++) {
            System.out.println("" + (i + 1) + " " + dadi2[i]);
        }
    }
}