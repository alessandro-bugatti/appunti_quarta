public class Main {
    public static void main(String[] args) {
        SvegliaDigitale s = new SvegliaDigitale(4, 58);
        System.out.println(s);
        s.impostaOrario();
        s.setOre();
        s.setMinuti();
        System.out.println(s);
        s.setMinuti();
        System.out.println(s);
        s.impostaOrario();
        s.setOre();
        s.setOre();
        System.out.println(s);
        s.impostaSveglia();
        for (int i = 0; i < 320; i++) {
            s.setMinuti();
        }
        System.out.println(s);
        s = new SvegliaDigitale(23, 59);
        s.impostaOrario();
        s.setMinuti();
        s.setMinuti();
        System.out.println(s);
        s = new SvegliaDigitale(25, 78);
        System.out.println(s);
    }
}