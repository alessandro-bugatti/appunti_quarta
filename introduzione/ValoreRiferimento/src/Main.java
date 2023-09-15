public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
        int[] a;
        a = new int[10];
        System.out.println(a[1]);
        int [] b;
        b = a;
        a[1] = 7;
        System.out.println(b[1]);
        System.out.println(a);
        System.out.println(b);
        b = new int[5];
        System.out.println(a);
        System.out.println(b);
        b = a;
        System.out.println(a);
        System.out.println(b);
        a = new int[15];
        for (int i = 0; i < 15; i++) {
            a[i] = i*i;
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(a[i]);
        }

    }
}