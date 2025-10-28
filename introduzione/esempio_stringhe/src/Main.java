public class Main {
    public static void main(String[] args){
        String s = "";
        final int N = 1000000;
        System.out.println("Differenza di prestazioni nella concatenazione");
        System.out.println("Utilizzando una String");
        for (int i = 0; i < N; i++) {
            s += '.';
        }
        System.out.println("Fine della concatenazione");
        System.out.println("Utilizzando uno StringBuilder");
        System.out.println("Inizio della concatenazione di " + N + " caratteri.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append('.');
        }
        System.out.println("Fine della concatenazione");
    }
}
