public class Main {
    private static int[] pari(int v[]){
        int n_pari = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0){
                n_pari++;
            }
        }
        int[] p = new int[n_pari];
        int j = 0;
        for (int i = 0; i < v.length; i++) {
            if(v[i] % 2 == 0){
                p[j] = v[i];
                j++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()* 100);
        }
        int[] p = pari(v);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}