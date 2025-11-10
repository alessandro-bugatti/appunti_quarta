import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int[] a = new int[10];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        for (int i = 0; i < n; i++) {
            try{
                a[i] = i * 3;
                System.out.println(a[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("C'è stato un problema con l'indice " + i);
            }
        }
    }
}