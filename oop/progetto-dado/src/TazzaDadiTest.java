public class TazzaDadiTest {

    public static void main(String[] args) {
        TazzaPerDadi tazza = new TazzaPerDadi(5);
        TazzaPerDadi tazza2 = new TazzaPerDadi(10, 10);
        System.out.println(tazza.lancia());
        System.out.println(tazza2.lancia());
        System.out.println(tazza.getMinimo());
        System.out.println(tazza2.getMassimo());
        System.out.println(tazza);
        System.out.println(tazza2);
    }


}
